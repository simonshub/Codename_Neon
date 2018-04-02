/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.neon.master.db;

import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.neon.common.log.Log;
import org.neon.master.db.orm.model.AbstractDatabaseModel;

/**
 *
 * @author XyRoN
 */
public class DatabaseManager {
    
    public static final String DATABASE_NAME = "neon_master.db";
    public static final String DATABASE_LOCATION = "\\db\\";
    private static final DatabaseManager INSTANCE = new DatabaseManager ();
    
    private Connection conn;
    
    private DatabaseManager () {
        try {
            Class.forName("org.sqlite.JDBC");
            String current_dir = new java.io.File( "." ).getCanonicalPath();
            this.conn = DriverManager.getConnection("jdbc:sqlite:"+current_dir+DATABASE_LOCATION+DATABASE_NAME);
            this.conn.setAutoCommit(false);
        } catch ( IOException | ClassNotFoundException | SQLException e ) {
            Log.err( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        Log.log("Opened database successfully");
    }
    
    public static Connection getConnection () {
        return INSTANCE.conn;
    }
    
    public static void executeSql (String sql) throws SQLException {
        Statement stmt = INSTANCE.conn.createStatement();
        Log.log("Executing DB statement '"+sql+"'...");
        stmt.execute(sql);
        stmt.close();
        INSTANCE.conn.commit();
    }
    
    public static void executeUpdateSql (String sql) throws SQLException {
        Statement stmt = INSTANCE.conn.createStatement();
        Log.log("Executing DB update '"+sql+"'...");
        stmt.executeUpdate(sql);
        stmt.close();
        INSTANCE.conn.commit();
    }
    
    public static ResultSet executeQuerySql (String sql) throws SQLException {
        Statement stmt = INSTANCE.conn.createStatement();
        Log.log("Executing DB query '"+sql+"'...");
        ResultSet rs = stmt.executeQuery(sql);
        INSTANCE.conn.commit();
        return rs;
    }
    
    public static <T extends AbstractDatabaseModel> List<T> getAll (Class<T> table) {
        return getWhere(table, null);
    }
    
    public static <T extends AbstractDatabaseModel> T getSingle (Class<T> table, int id) {
        return getWhere(table, "id="+String.valueOf(id)).get(0);
    }
    
    public static <T extends AbstractDatabaseModel> T getSingle (Class<T> table, String where_clause) {
        return getWhere(table, where_clause).get(0);
    }
    
    public static <T extends AbstractDatabaseModel> List<T> getWhere (Class<T> table, int id) {
        return getWhere(table, "id="+String.valueOf(id));
    }
    
    public static <T extends AbstractDatabaseModel> List<T> getWhere (Class<T> table, String where_clause) {
        return AbstractDatabaseModel.select(table, where_clause);
    }
    
}
