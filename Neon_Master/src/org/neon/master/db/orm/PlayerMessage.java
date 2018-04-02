/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.neon.master.db.orm;

import org.neon.master.db.orm.model.AbstractDatabaseModel;
import java.sql.Date;
import org.neon.master.db.DatabaseManager;

/**
 *
 * @author XyRoN
 */
public class PlayerMessage extends AbstractDatabaseModel {
    
    public int id;
    public int player_from;
    public int player_to;
    public String contents;
    public Date time;
    
    
    
    public Player getPlayerFrom () {
        return DatabaseManager.getSingle(Player.class, player_from);
    }
    
    public Player getPlayerTo () {
        return DatabaseManager.getSingle(Player.class, player_to);
    }
    
}
