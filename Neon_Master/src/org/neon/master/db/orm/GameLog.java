/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.neon.master.db.orm;

import org.neon.master.db.orm.model.AbstractDatabaseModel;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.neon.master.db.DatabaseManager;
import org.neon.master.db.DatabaseTableMapping;

/**
 *
 * @author XyRoN
 */
public class GameLog extends AbstractDatabaseModel {
    
    public int id;
    public Date start_time;
    public Date end_time;
    public String map_name;
    public String player_id_list;
    
    
    
    public List<Player> getPlayers () {
        List<Player> players = new ArrayList<> ();
        String[] player_ids = player_id_list.split(DatabaseTableMapping.GAME_LOG.values[0]);
        
        for (String player_id : player_ids) {
            Player player = DatabaseManager.getSingle(Player.class, player_id);
            if (player!=null) players.add(player);
        }
        
        return players;
    }
    
}
