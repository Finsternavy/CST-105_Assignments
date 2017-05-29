/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject.frontend;

import FinalProject.backend.NFLPlayer;
import javax.swing.table.DefaultTableModel;
import FinalProject.backend.DefensivePlayer;
import FinalProject.backend.OffensivePlayer;
import javax.swing.table.DefaultTableModel;
import FinalProject.frontend.ViewPlayers;

/**
 *
 * @author proto
 */
public class DraftBoard extends javax.swing.JPanel {

    /**
     * Creates new form DraftBoard
     */
    public DraftBoard() {
        initComponents();
        DefaultTableModel model = new DefaultTableModel(ViewPlayers.HEADER_ALL_TABLE, 0);
        
        MainFrame.PLAYER_MANAGER.currentRoster.forEach((NFLPlayer player) -> {
            model.addRow(player.toArray());
        });
        
        this.DraftedPlayersTable.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        DraftedPlayersTable = new javax.swing.JTable();
        AddPlayersButton = new javax.swing.JButton();
        FinalizeButton = new javax.swing.JButton();
        RemovePlayerButton = new javax.swing.JButton();

        DraftedPlayersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(DraftedPlayersTable);

        AddPlayersButton.setText("Add More Players");
        AddPlayersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPlayersButtonActionPerformed(evt);
            }
        });

        FinalizeButton.setText("Finalize Picks");
        FinalizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizeButtonActionPerformed(evt);
            }
        });

        RemovePlayerButton.setText("Remove selected Player");
        RemovePlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovePlayerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(RemovePlayerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddPlayersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FinalizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RemovePlayerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddPlayersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FinalizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void AddPlayersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPlayersButtonActionPerformed
        MainFrame.INSTANCE.changeState(MainFrame.ViewState.OPTIONS);
    }//GEN-LAST:event_AddPlayersButtonActionPerformed

    private void FinalizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizeButtonActionPerformed
        MainFrame.INSTANCE.changeState(MainFrame.ViewState.DRAFTEND);

    }//GEN-LAST:event_FinalizeButtonActionPerformed

    private void RemovePlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovePlayerButtonActionPerformed
        ((DefaultTableModel)DraftedPlayersTable.getModel()).removeRow(DraftedPlayersTable.getSelectedRow());
    }//GEN-LAST:event_RemovePlayerButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPlayersButton;
    private javax.swing.JTable DraftedPlayersTable;
    private javax.swing.JButton FinalizeButton;
    private javax.swing.JButton RemovePlayerButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}