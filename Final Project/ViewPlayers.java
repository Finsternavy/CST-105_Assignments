/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject.frontend;

import FinalProject.backend.DefensivePlayer;
import FinalProject.backend.NFLPlayer;
import FinalProject.backend.OffensivePlayer;
import javax.swing.table.DefaultTableModel;

public class ViewPlayers extends javax.swing.JPanel {

    public static enum PlayerTypes {
        OFFENSE,
        DEFENSE,
        ALL
    }

    private final PlayerTypes typeSelection;

    /**
     * Creates new form ViewPlayers
     *
     * @param typeSelection
     */
    public ViewPlayers(PlayerTypes typeSelection) {
        initComponents();
        
        this.typeSelection = typeSelection;
        this.setUpTable(typeSelection);
    }

    public static final String[] HEADER_OFFENSE_TABLE = {
        "Name",
        "Position",
        "Age",
        "Number",
        "Weight",
        "Pass TDs",
        "INTs",
        "Pass Attempts",
        "Completions",
        "Comp %",
        "Pass Yards",
        "Rush Yards",
        "Rush Attempts",
        "YrdsPerCarry",
        "Rush TDs",
        "Fumbles",
        "Receiving Yards",
        "YrdsPerCatch",
        "Receiving TDs"
    };

    public static final String[] HEADER_DEFENSE_TABLE = {
        "Name",
        "Position",
        "Age",
        "Number",
        "Weight",
        "Solo Tkls",
        "Assist Tkls",
        "Total Tkls",
        "Sacks",
        "INT",
        "Safety",
        "Pass Deflect",
        "Def TDs",
        "Forced Fumbles",
        "Fumble Recoveries"
    };

    public static final String[] HEADER_ALL_TABLE = {
        "Name",
        "Position",
        "Age",
        "Number",
        "Weight"
    };

    private void setUpTable(PlayerTypes type) {
        DefaultTableModel model;

        switch (type) {
            case OFFENSE:
                model = new DefaultTableModel(ViewPlayers.HEADER_OFFENSE_TABLE, 0);

                MainFrame.PLAYER_MANAGER.offensivePlayers.forEach((OffensivePlayer player) -> {
                    model.addRow(player.toArray());
                });

                break;
            case DEFENSE:
                model = new DefaultTableModel(ViewPlayers.HEADER_DEFENSE_TABLE, 0);

                MainFrame.PLAYER_MANAGER.defensivePlayers.forEach((DefensivePlayer player) -> {
                    model.addRow(player.toArray());
                });

                break;
            case ALL:
                model = new DefaultTableModel(ViewPlayers.HEADER_ALL_TABLE, 0);

                MainFrame.PLAYER_MANAGER.offensivePlayers.forEach((NFLPlayer player) -> {
                    model.addRow(player.toArray());
                });

                MainFrame.PLAYER_MANAGER.defensivePlayers.forEach((NFLPlayer player) -> {
                    model.addRow(player.toArray());
                });

                break;
            default:
                throw new AssertionError(type.name());
        }

        this.availablePlayersTable.setModel(model);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changeViewedPlayersButton = new javax.swing.JButton();
        returnToDraftboardButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        availablePlayersTable = new javax.swing.JTable();
        draftPlayerButton = new javax.swing.JButton();

        changeViewedPlayersButton.setText("Change Viewed Players");
        changeViewedPlayersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeViewedPlayersButtonActionPerformed(evt);
            }
        });

        returnToDraftboardButton.setText("Return to DraftBoard");
        returnToDraftboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnToDraftboardButtonActionPerformed(evt);
            }
        });

        availablePlayersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
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
        availablePlayersTable.setMinimumSize(new java.awt.Dimension(150, 64));
        jScrollPane1.setViewportView(availablePlayersTable);

        jScrollPane2.setViewportView(jScrollPane1);

        draftPlayerButton.setText("Draft Selected Player");
        draftPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                draftPlayerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnToDraftboardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changeViewedPlayersButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addComponent(draftPlayerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changeViewedPlayersButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(draftPlayerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnToDraftboardButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void changeViewedPlayersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeViewedPlayersButtonActionPerformed
        
        MainFrame.INSTANCE.changeState(MainFrame.ViewState.OPTIONS);
    }//GEN-LAST:event_changeViewedPlayersButtonActionPerformed

    private void returnToDraftboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToDraftboardButtonActionPerformed
        
        MainFrame.INSTANCE.changeState(MainFrame.ViewState.DRAFTBOARD);
    }//GEN-LAST:event_returnToDraftboardButtonActionPerformed

    private void draftPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_draftPlayerButtonActionPerformed
        int index = availablePlayersTable.getSelectedRow();

        switch (this.typeSelection) {
            case OFFENSE:
                MainFrame.PLAYER_MANAGER.currentRoster.add((NFLPlayer) MainFrame.PLAYER_MANAGER.offensivePlayers.get(index));
                break;
            case DEFENSE:
                MainFrame.PLAYER_MANAGER.currentRoster.add((NFLPlayer) MainFrame.PLAYER_MANAGER.defensivePlayers.get(index));
                break;
            case ALL:
                int offensiveSize = MainFrame.PLAYER_MANAGER.offensivePlayers.size();

                if (index > offensiveSize) {
                    index -= offensiveSize;

                    MainFrame.PLAYER_MANAGER.currentRoster.add((NFLPlayer) MainFrame.PLAYER_MANAGER.defensivePlayers.get(index));
                } else {
                    MainFrame.PLAYER_MANAGER.currentRoster.add((NFLPlayer) MainFrame.PLAYER_MANAGER.offensivePlayers.get(index));
                }

                break;
            default:
                throw new AssertionError(this.typeSelection.name());

        }
    }//GEN-LAST:event_draftPlayerButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable availablePlayersTable;
    private javax.swing.JButton changeViewedPlayersButton;
    private javax.swing.JButton draftPlayerButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton returnToDraftboardButton;
    // End of variables declaration//GEN-END:variables
}
