/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.restaurantFrame;

import model.eateryEnterprise;

/**
 *
 * @author BARATHI
 */
public class restaurantLanding extends javax.swing.JFrame {

    /**
     * Creates new form restaurantLanding
     */
     private eateryEnterprise eatery;
       
    public restaurantLanding(eateryEnterprise eatery) {
        initComponents();
        this.eatery=eatery;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMenuManagement = new javax.swing.JButton();
        btnEmployeeManagement = new javax.swing.JButton();
        btnOrderManagement = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMenuManagement.setBackground(new java.awt.Color(255, 255, 0));
        btnMenuManagement.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        btnMenuManagement.setText("MENU MANAGEMENT");
        btnMenuManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuManagementActionPerformed(evt);
            }
        });

        btnEmployeeManagement.setBackground(new java.awt.Color(255, 255, 0));
        btnEmployeeManagement.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        btnEmployeeManagement.setText("EMPLOYEE MANAGEMENT");
        btnEmployeeManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeManagementActionPerformed(evt);
            }
        });

        btnOrderManagement.setBackground(new java.awt.Color(255, 255, 0));
        btnOrderManagement.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        btnOrderManagement.setText("ORDER DELIVERY MANAGEMENT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(btnOrderManagement))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(btnEmployeeManagement))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(btnMenuManagement)))
                .addContainerGap(349, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addComponent(btnOrderManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnEmployeeManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMenuManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuManagementActionPerformed
        // TODO add your handling code here:
        menuManagerLogin menuManagerLogin = new menuManagerLogin(eatery);
        menuManagerLogin.setVisible(true);
    }//GEN-LAST:event_btnMenuManagementActionPerformed

    private void btnEmployeeManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeManagementActionPerformed
        // TODO add your handling code here:
        employeeManagerLogin empManageLogin = new employeeManagerLogin(eatery);
        empManageLogin.setVisible(true);
    }//GEN-LAST:event_btnEmployeeManagementActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(restaurantLanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(restaurantLanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(restaurantLanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(restaurantLanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new restaurantLanding().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmployeeManagement;
    private javax.swing.JButton btnMenuManagement;
    private javax.swing.JButton btnOrderManagement;
    // End of variables declaration//GEN-END:variables
}
