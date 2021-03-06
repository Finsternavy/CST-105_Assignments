/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject.frontend;

import FinalProject.frontend.ViewPlayers.PlayerTypes;

public class SelectOptions extends javax.swing.JPanel {

    /**
     * Creates new form SelectOptions
     */
    public SelectOptions() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        OffenseButton = new javax.swing.JButton();
        DefenseButton = new javax.swing.JButton();
        AllButton = new javax.swing.JButton();
        DraftBoardButton = new javax.swing.JButton();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select what type of available players to view for the draft");

        OffenseButton.setText("Offense");
        OffenseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OffenseButtonActionPerformed(evt);
            }
        });

        DefenseButton.setText("Defense");
        DefenseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefenseButtonActionPerformed(evt);
            }
        });

        AllButton.setText("Select All");
        AllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllButtonActionPerformed(evt);
            }
        });

        DraftBoardButton.setText("Return to Draft Board");
        DraftBoardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DraftBoardButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OffenseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(DefenseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AllButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DraftBoardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OffenseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DefenseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DraftBoardButton, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DefenseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DefenseButtonActionPerformed
        MainFrame.INSTANCE.changeStateToViewPlayers(PlayerTypes.DEFENSE);
    }//GEN-LAST:event_DefenseButtonActionPerformed

    private void OffenseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OffenseButtonActionPerformed
        MainFrame.INSTANCE.changeStateToViewPlayers(PlayerTypes.OFFENSE);
    }//GEN-LAST:event_OffenseButtonActionPerformed

    private void AllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllButtonActionPerformed
        MainFrame.INSTANCE.changeStateToViewPlayers(PlayerTypes.ALL);
    }//GEN-LAST:event_AllButtonActionPerformed

    private void DraftBoardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DraftBoardButtonActionPerformed
        MainFrame.INSTANCE.changeState(MainFrame.ViewState.DRAFTBOARD);
    }//GEN-LAST:event_DraftBoardButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllButton;
    private javax.swing.JButton DefenseButton;
    private javax.swing.JButton DraftBoardButton;
    private javax.swing.JButton OffenseButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
