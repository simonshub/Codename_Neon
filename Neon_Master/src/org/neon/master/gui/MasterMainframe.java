/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.neon.master.gui;

import java.util.List;
import javax.swing.JFrame;
import org.neon.master.db.DatabaseManager;
import org.neon.master.db.orm.Catchphrase;
import org.neon.master.db.orm.Player;
import org.neon.master.db.orm.UserIcon;

/**
 *
 * @author XyRoN
 */
public class MasterMainframe extends JFrame {

    public MasterMainframe() {
        initComponents();
        
        List<Catchphrase> phrases = DatabaseManager.getAll(Catchphrase.class);
        for (Catchphrase c : phrases)
            System.out.println(c.text);
        
        List<UserIcon> icons = DatabaseManager.getAll(UserIcon.class);
        for (UserIcon i : icons)
            System.out.println(i.icon_path);
        
        List<Player> players = DatabaseManager.getAll(Player.class);
        for (Player p : players) {
            System.out.println(p.username);
            System.out.println(p.last_login_time);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        player_inspection_frame = new javax.swing.JFrame();
        player_inspection_panel = new javax.swing.JPanel();
        label_username = new javax.swing.JLabel();
        label_password = new javax.swing.JLabel();
        label_catchphrase_question = new javax.swing.JLabel();
        label_catchphrase_answer = new javax.swing.JLabel();
        label_email = new javax.swing.JLabel();
        label_id = new javax.swing.JLabel();
        label_last_login = new javax.swing.JLabel();
        label_color = new javax.swing.JLabel();
        label_icon = new javax.swing.JLabel();
        field_id = new javax.swing.JTextField();
        field_username = new javax.swing.JTextField();
        field_password = new javax.swing.JTextField();
        field_email = new javax.swing.JTextField();
        field_last_login = new javax.swing.JTextField();
        field_catchphrase_answer = new javax.swing.JTextField();
        field_color = new javax.swing.JTextField();
        btn_cancel_player_inspection = new javax.swing.JButton();
        btn_update_player_inspection = new javax.swing.JButton();
        combo_catchphrase_question = new javax.swing.JComboBox<>();
        combo_icon = new javax.swing.JComboBox<>();
        send_message_frame = new javax.swing.JFrame();
        send_message_scrollpane = new javax.swing.JScrollPane();
        text_send_message = new javax.swing.JTextArea();
        label_message_level = new javax.swing.JLabel();
        combo_message_level = new javax.swing.JComboBox<>();
        btn_send_message = new javax.swing.JButton();
        players_panel = new javax.swing.JPanel();
        btn_inspect_player = new javax.swing.JButton();
        btn_force_logout = new javax.swing.JButton();
        btn_send_message_to_player = new javax.swing.JButton();
        player_table_scrollpane = new javax.swing.JScrollPane();
        player_table = new javax.swing.JTable();
        settings_panel = new javax.swing.JPanel();
        btn_send_message_to_all = new javax.swing.JButton();
        btn_force_log_out_all = new javax.swing.JButton();
        btn_clear_messages = new javax.swing.JButton();
        hosted_panel = new javax.swing.JPanel();
        btn_force_logout1 = new javax.swing.JButton();
        btn_send_message_to_player1 = new javax.swing.JButton();
        player_table_scrollpane1 = new javax.swing.JScrollPane();
        hosted_table = new javax.swing.JTable();

        player_inspection_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "Player XYZ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14))); // NOI18N

        label_username.setText("Username:");

        label_password.setText("Password:");

        label_catchphrase_question.setText("Catchphrase Question:");

        label_catchphrase_answer.setText("Catchphrase Answer:");

        label_email.setText("Registration Email:");

        label_id.setText("Database ID:");

        label_last_login.setText("Last Logged in:");

        label_color.setText("Custom Color: (R,G,B) = [ 0.0 , 1.0 ]");

        label_icon.setText("Custom Icon:");

        field_id.setEditable(false);
        field_id.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        field_id.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        field_id.setText("0000");

        field_username.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        field_username.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        field_username.setText("XYZ");

        field_password.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        field_password.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        field_password.setText("fuckyourgame");

        field_email.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        field_email.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        field_email.setText("esimon.test@gmail.com");

        field_last_login.setEditable(false);
        field_last_login.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        field_last_login.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        field_last_login.setText("10:55 - 12.03.2018.");

        field_catchphrase_answer.setEditable(false);
        field_catchphrase_answer.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        field_catchphrase_answer.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        field_catchphrase_answer.setText("your mom");

        field_color.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        field_color.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        field_color.setText("1.0,0.5,0.5");

        btn_cancel_player_inspection.setText("Cancel");

        btn_update_player_inspection.setText("Update");

        combo_catchphrase_question.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        combo_catchphrase_question.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo_icon.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        combo_icon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout player_inspection_panelLayout = new javax.swing.GroupLayout(player_inspection_panel);
        player_inspection_panel.setLayout(player_inspection_panelLayout);
        player_inspection_panelLayout.setHorizontalGroup(
            player_inspection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(player_inspection_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(player_inspection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(player_inspection_panelLayout.createSequentialGroup()
                        .addComponent(label_email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(field_email, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, player_inspection_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_update_player_inspection)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancel_player_inspection))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, player_inspection_panelLayout.createSequentialGroup()
                        .addGroup(player_inspection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_color)
                            .addComponent(label_icon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(player_inspection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(field_color, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(combo_icon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, player_inspection_panelLayout.createSequentialGroup()
                        .addGroup(player_inspection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_id)
                            .addComponent(label_username)
                            .addComponent(label_password))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(player_inspection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(field_password, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(field_username)
                            .addComponent(field_id)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, player_inspection_panelLayout.createSequentialGroup()
                        .addGroup(player_inspection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_catchphrase_answer)
                            .addComponent(label_catchphrase_question)
                            .addComponent(label_last_login))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(player_inspection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(field_last_login)
                            .addComponent(field_catchphrase_answer, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(combo_catchphrase_question, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        player_inspection_panelLayout.setVerticalGroup(
            player_inspection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(player_inspection_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(player_inspection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_id)
                    .addComponent(field_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(player_inspection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_username)
                    .addComponent(field_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(player_inspection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_password)
                    .addComponent(field_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(player_inspection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_email)
                    .addComponent(field_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(player_inspection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_last_login)
                    .addComponent(field_last_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(player_inspection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_catchphrase_question)
                    .addComponent(combo_catchphrase_question, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(player_inspection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_catchphrase_answer)
                    .addComponent(field_catchphrase_answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(player_inspection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_color)
                    .addComponent(field_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(player_inspection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_icon)
                    .addComponent(combo_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(player_inspection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancel_player_inspection)
                    .addComponent(btn_update_player_inspection))
                .addContainerGap())
        );

        javax.swing.GroupLayout player_inspection_frameLayout = new javax.swing.GroupLayout(player_inspection_frame.getContentPane());
        player_inspection_frame.getContentPane().setLayout(player_inspection_frameLayout);
        player_inspection_frameLayout.setHorizontalGroup(
            player_inspection_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(player_inspection_frameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(player_inspection_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        player_inspection_frameLayout.setVerticalGroup(
            player_inspection_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, player_inspection_frameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(player_inspection_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        text_send_message.setColumns(20);
        text_send_message.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        text_send_message.setRows(5);
        send_message_scrollpane.setViewportView(text_send_message);

        label_message_level.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        label_message_level.setText("Message level:");

        combo_message_level.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        combo_message_level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_send_message.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btn_send_message.setText("Send message");

        javax.swing.GroupLayout send_message_frameLayout = new javax.swing.GroupLayout(send_message_frame.getContentPane());
        send_message_frame.getContentPane().setLayout(send_message_frameLayout);
        send_message_frameLayout.setHorizontalGroup(
            send_message_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(send_message_frameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(send_message_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(send_message_scrollpane)
                    .addGroup(send_message_frameLayout.createSequentialGroup()
                        .addComponent(label_message_level)
                        .addGap(18, 18, 18)
                        .addComponent(combo_message_level, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_send_message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        send_message_frameLayout.setVerticalGroup(
            send_message_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, send_message_frameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(send_message_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_message_level)
                    .addComponent(combo_message_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(send_message_scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_send_message)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NEON Master Server Console");

        players_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "Players", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 0, 14))); // NOI18N

        btn_inspect_player.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btn_inspect_player.setText("Inspect");

        btn_force_logout.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btn_force_logout.setText("Force Log out");

        btn_send_message_to_player.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btn_send_message_to_player.setText("Send message");

        player_table.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        player_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Database ID", "Username", "Currently logged in", "In matchmaking"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        player_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        player_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        player_table.setShowVerticalLines(false);
        player_table_scrollpane.setViewportView(player_table);

        javax.swing.GroupLayout players_panelLayout = new javax.swing.GroupLayout(players_panel);
        players_panel.setLayout(players_panelLayout);
        players_panelLayout.setHorizontalGroup(
            players_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, players_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(players_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(player_table_scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(players_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_inspect_player)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_force_logout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_send_message_to_player)))
                .addContainerGap())
        );
        players_panelLayout.setVerticalGroup(
            players_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(players_panelLayout.createSequentialGroup()
                .addComponent(player_table_scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(players_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_send_message_to_player)
                    .addComponent(btn_force_logout)
                    .addComponent(btn_inspect_player))
                .addContainerGap())
        );

        settings_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "Settings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14))); // NOI18N

        btn_send_message_to_all.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btn_send_message_to_all.setText("Send message to all players");

        btn_force_log_out_all.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btn_force_log_out_all.setText("Force Log out all players");

        btn_clear_messages.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btn_clear_messages.setText("Clear old messages");

        javax.swing.GroupLayout settings_panelLayout = new javax.swing.GroupLayout(settings_panel);
        settings_panel.setLayout(settings_panelLayout);
        settings_panelLayout.setHorizontalGroup(
            settings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settings_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(settings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_send_message_to_all, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_force_log_out_all, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clear_messages, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        settings_panelLayout.setVerticalGroup(
            settings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settings_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_clear_messages)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_force_log_out_all)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_send_message_to_all)
                .addContainerGap())
        );

        hosted_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "Hosted Games", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 0, 14))); // NOI18N

        btn_force_logout1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btn_force_logout1.setText("Force end game");

        btn_send_message_to_player1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btn_send_message_to_player1.setText("Send message");

        hosted_table.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        hosted_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Game Map", "Average MMR", "Player List", "Start Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        hosted_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        hosted_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        hosted_table.setShowVerticalLines(false);
        player_table_scrollpane1.setViewportView(hosted_table);

        javax.swing.GroupLayout hosted_panelLayout = new javax.swing.GroupLayout(hosted_panel);
        hosted_panel.setLayout(hosted_panelLayout);
        hosted_panelLayout.setHorizontalGroup(
            hosted_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hosted_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hosted_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(player_table_scrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(hosted_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_force_logout1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_send_message_to_player1)))
                .addContainerGap())
        );
        hosted_panelLayout.setVerticalGroup(
            hosted_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hosted_panelLayout.createSequentialGroup()
                .addComponent(player_table_scrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hosted_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_send_message_to_player1)
                    .addComponent(btn_force_logout1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(settings_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(players_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hosted_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(players_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hosted_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settings_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MasterMainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterMainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterMainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterMainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(() -> {
            new MasterMainframe().setVisible(true);
        });
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel_player_inspection;
    private javax.swing.JButton btn_clear_messages;
    private javax.swing.JButton btn_force_log_out_all;
    private javax.swing.JButton btn_force_logout;
    private javax.swing.JButton btn_force_logout1;
    private javax.swing.JButton btn_inspect_player;
    private javax.swing.JButton btn_send_message;
    private javax.swing.JButton btn_send_message_to_all;
    private javax.swing.JButton btn_send_message_to_player;
    private javax.swing.JButton btn_send_message_to_player1;
    private javax.swing.JButton btn_update_player_inspection;
    private javax.swing.JComboBox<String> combo_catchphrase_question;
    private javax.swing.JComboBox<String> combo_icon;
    private javax.swing.JComboBox<String> combo_message_level;
    private javax.swing.JTextField field_catchphrase_answer;
    private javax.swing.JTextField field_color;
    private javax.swing.JTextField field_email;
    private javax.swing.JTextField field_id;
    private javax.swing.JTextField field_last_login;
    private javax.swing.JTextField field_password;
    private javax.swing.JTextField field_username;
    private javax.swing.JPanel hosted_panel;
    private javax.swing.JTable hosted_table;
    private javax.swing.JLabel label_catchphrase_answer;
    private javax.swing.JLabel label_catchphrase_question;
    private javax.swing.JLabel label_color;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_icon;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_last_login;
    private javax.swing.JLabel label_message_level;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_username;
    private javax.swing.JFrame player_inspection_frame;
    private javax.swing.JPanel player_inspection_panel;
    private javax.swing.JTable player_table;
    private javax.swing.JScrollPane player_table_scrollpane;
    private javax.swing.JScrollPane player_table_scrollpane1;
    private javax.swing.JPanel players_panel;
    private javax.swing.JFrame send_message_frame;
    private javax.swing.JScrollPane send_message_scrollpane;
    private javax.swing.JPanel settings_panel;
    private javax.swing.JTextArea text_send_message;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
