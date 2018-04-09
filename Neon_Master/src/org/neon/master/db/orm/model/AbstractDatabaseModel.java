/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.neon.master.db.orm.model;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.neon.common.log.Log;
import org.neon.master.db.DatabaseManager;
import org.neon.master.db.DatabaseTableMapping;

/**
 *
 * @author XyRoN
 */
public abstract class AbstractDatabaseModel {
    
    public static final String SQL_PLACEHOLDER_TABLE_NAME = "%table%";
    public static final String SQL_PLACEHOLDER_VALUE_LIST = "%values%";
    public static final String SQL_PLACEHOLDER_FIELD_LIST = "%fields%";
    public static final String SQL_PLACEHOLDER_LIST_DELIMITER = ", ";
    
    public static final String SQL_END = ";";
    public static final String SQL_NULL = "NULL";
    public static final String SQL_FROM = "FROM ";
    public static final String SQL_INTO = "INTO ";
    public static final String SQL_INSERT = "INSERT ";
    public static final String SQL_SELECT = "SELECT ";
    public static final String SQL_VALUES = "VALUES ";
    public static final String SQL_UPDATE = "UPDATE ";
    public static final String SQL_WHERE = "WHERE ";
    
    public boolean insert () {
        try {
            String sql = SQL_INSERT + SQL_INTO + SQL_PLACEHOLDER_TABLE_NAME + "(" + SQL_PLACEHOLDER_FIELD_LIST + ") " + SQL_VALUES + "(" + SQL_PLACEHOLDER_VALUE_LIST + ")" + SQL_END;
            String table_name = DatabaseTableMapping.getMapping(this.getClass()).name().toUpperCase();
            Field[] fields_list = this.getClass().getDeclaredFields();
            String[] field_names = new String [fields_list.length];
            Object[] field_values = new Object [fields_list.length];
            for (int i=0;i<fields_list.length;i++) {
                    Field field = fields_list[i];
                    field_names[i] = field.getName().toUpperCase();
                    field_values[i] = field.get(this);
                    if (String.class.equals(field.getType()))
                        field_values[i] = "\"" + field_values[i] + "\"";
            }
            
            String fields = field_names[0];
            for (int i=1;i<field_names.length;i++)
                fields += SQL_PLACEHOLDER_LIST_DELIMITER + field_names[i];
            String values = field_values[0].toString();
            for (int i=1;i<field_values.length;i++)
                values += SQL_PLACEHOLDER_LIST_DELIMITER + ( field_values[i]==null ? SQL_NULL : field_values[i].toString() );
            
            sql = sql.replace(SQL_PLACEHOLDER_TABLE_NAME, table_name);
            sql = sql.replace(SQL_PLACEHOLDER_FIELD_LIST, fields);
            sql = sql.replace(SQL_PLACEHOLDER_VALUE_LIST, values);
            
            DatabaseManager.executeUpdateSql(sql);
        } catch (IllegalArgumentException | IllegalAccessException | SQLException ex) {
            Log.err("Error while trying to insert object of type '"+this.getClass().getName()+"'!");
            Log.err(ex);
            return false;
        }
        return true;
    }
    
    public boolean update () {
        try {
            String sql = SQL_UPDATE + SQL_PLACEHOLDER_TABLE_NAME + SQL_PLACEHOLDER_FIELD_LIST + SQL_END;
            String table_name = DatabaseTableMapping.getMapping(this.getClass()).name().toUpperCase();
            Field[] fields_list = this.getClass().getDeclaredFields();
            String[] field_names = new String [fields_list.length];
            Object[] field_values = new Object [fields_list.length];
            for (int i=0;i<fields_list.length;i++) {
                    Field field = fields_list[i];
                    field_names[i] = field.getName().toUpperCase();
                    field_values[i] = field.get(this);
            }
            
            String fields = "set " + field_names[0] + "=" + field_values[0].toString();
            for (int i=1;i<field_names.length;i++)
                fields += SQL_PLACEHOLDER_LIST_DELIMITER + "set " + field_names[i] + "=" + field_values[i].toString();
            
            sql = sql.replace(SQL_PLACEHOLDER_TABLE_NAME, table_name);
            sql = sql.replace(SQL_PLACEHOLDER_FIELD_LIST, fields);
            
            DatabaseManager.executeUpdateSql(sql);
        } catch (IllegalArgumentException | IllegalAccessException | SQLException ex) {
            Log.err("Error while trying to update object of type '"+this.getClass().getName()+"'!");
            Log.err(ex);
            return false;
        }
        return true;
    }
    
    public static <T extends AbstractDatabaseModel> List<T> select (Class<T> table, String where_clause) {
        try {
            if (DatabaseTableMapping.getMapping(table)==null) throw new SQLException ("Class "+table.getName()+" is not an ORM mapped database table!");
            
            String table_name = DatabaseTableMapping.getMapping(table).name().toUpperCase();
            String where = ( (where_clause==null || where_clause.isEmpty()) ? "" : AbstractDatabaseModel.SQL_WHERE + where_clause );
            String sql = SQL_SELECT + SQL_PLACEHOLDER_FIELD_LIST + " " + SQL_FROM + table_name + " " + where + SQL_END;
            
            Field[] fields_list = table.getDeclaredFields();
            String[] field_names = new String [fields_list.length];
            for (int i=0;i<fields_list.length;i++) {
                    Field field = fields_list[i];
                    field_names[i] = field.getName().toUpperCase();
            }
            
            String fields = field_names[0];
            for (int i=1;i<field_names.length;i++)
                fields += SQL_PLACEHOLDER_LIST_DELIMITER + field_names[i];
            
            sql = sql.replace(SQL_PLACEHOLDER_FIELD_LIST, fields);
            
            List<T> result_list = new ArrayList<> ();
            
            ResultSet rs = DatabaseManager.executeQuerySql(sql);
            while (rs.next()) {
                T row = table.newInstance();
                for (Field field : fields_list) {
                    String potential_fk_field_name = field.getName().toUpperCase() + DatabaseTableMapping.ID_SUFFIX;
                    if (AbstractDatabaseModel.class.isAssignableFrom(field.getType()) && (rs.getObject(potential_fk_field_name) instanceof Integer)) {
                        // FIELD IS FOREIGN KEY
                        int fkey = rs.getInt(potential_fk_field_name);
                        Object result_value = DatabaseManager.getSingle(field.getType().asSubclass(AbstractDatabaseModel.class), fkey);
                        field.set(row, result_value);
                    } else {
                        // NORMAL FIELD
                        Object result_value = rs.getObject(field.getName().toUpperCase());
                        field.set(row, result_value);
                    }
                }
                result_list.add(row);
            }
            return result_list;
        } catch (SQLException | InstantiationException | IllegalAccessException ex) {
            Log.err("Error while trying to select object of type '"+table.getName()+"'!");
            Log.err(ex);
            return new ArrayList ();
        }
    }
    
}
