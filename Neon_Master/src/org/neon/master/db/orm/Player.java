/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.neon.master.db.orm;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.neon.master.db.orm.model.AbstractDatabaseModel;
import java.sql.Date;
import org.neon.common.log.Log;
import org.neon.master.db.DatabaseManager;

/**
 *
 * @author XyRoN
 */
public class Player extends AbstractDatabaseModel {
    
    public int id;
    public String email;
    public String username;
    public String password;
    public String catchphrase_answer;
    public int catchphrase_question;
    public double color_r;
    public double color_g;
    public double color_b;
    public int user_icon;
    public Date last_login_time;
    
    
    
    public UserIcon getUserIcon () {
        return DatabaseManager.getSingle(UserIcon.class, user_icon);
    }
    
    public Catchphrase getCatchphraseQuestion () {
        return DatabaseManager.getSingle(Catchphrase.class, catchphrase_question);
    }
    
    
    
    public static String encrypt (String text) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(text.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();

            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException ex) {
            Log.err("Error while trying to encrypt '"+text+"'!");
            Log.err(ex);
            return text;
        }
    }
    
    public static boolean keyCheck (String key, String hash) {
        return hash.equals(encrypt(key));
    }
    
}
