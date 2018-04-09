/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.neon.master.db;

import org.neon.master.db.orm.Catchphrase;
import org.neon.master.db.orm.GameLog;
import org.neon.master.db.orm.Player;
import org.neon.master.db.orm.PlayerMessage;
import org.neon.master.db.orm.UserIcon;

/**
 *
 * @author XyRoN
 */
public enum DatabaseTableMapping {
        
    PLAYER(Player.class),
    GAME_LOG(GameLog.class, "="),
    USER_ICON(UserIcon.class),
    CATCHPHRASE(Catchphrase.class),
    PLAYER_MESSAGE(PlayerMessage.class),

    ;
    
    public static final String ID_SUFFIX = "";
    public static final String DATETIME_FORMAT = "yyyy-MM-dd hh:mm:ss";

    private final Class mapping;
    public final String[] values;
    private DatabaseTableMapping(Class mapping, String... relevant_constants) {
        this.mapping = mapping;
        this.values = relevant_constants;
    }

    public static Class getClass (DatabaseTableMapping mapping) {
        return mapping.mapping;
    }
    public static DatabaseTableMapping getMapping (Class c) {
        for (DatabaseTableMapping value : DatabaseTableMapping.values())
            if (value.mapping.equals(c)) return value;
        return null;
    }

}
