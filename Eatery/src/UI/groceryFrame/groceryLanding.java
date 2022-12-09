/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.groceryFrame;

import javax.swing.JFrame;
import model.EateryEnterprise;

/**
 *
 * @author ktkir
 */
public class groceryLanding extends javax.swing.JFrame {

    /**
     * Creates new form groceryLanding
     */
    EateryEnterprise eatery;
    public groceryLanding(EateryEnterprise eatery) {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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

        btnGroceryOrder = new javax.swing.JButton();
        btnGroceryManagement = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGroceryOrder.setBackground(new java.awt.Color(255, 255, 0));
        btnGroceryOrder.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        btnGroceryOrder.setText("GROCERY ORDER MANAGEMENT");
        btnGroceryOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGroceryOrderActionPerformed(evt);
            }
        });

        btnGroceryManagement.setBackground(new java.awt.Color(255, 255, 0));
        btnGroceryManagement.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        btnGroceryManagement.setText("GROCERY MANAGEMENT");
        btnGroceryManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGroceryManagementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGroceryManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGroceryOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                .addGap(247, 247, 247))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(btnGroceryManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGroceryOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGroceryOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGroceryOrderActionPerformed
        // TODO add your handling code here:
//        menuManagerLogin menuManagerLogin = new menuManagerLogin(eatery);
//        menuManagerLogin.setVisible(true);
    }//GEN-LAST:event_btnGroceryOrderActionPerformed

    private void btnGroceryManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGroceryManagementActionPerformed
        // TODO add your handling code here:
        groceryManagerLogin grocManageLogin = new groceryManagerLogin(eatery);
        grocManageLogin.setVisible(true);
    }//GEN-LAST:event_btnGroceryManagementActionPerformed

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
            java.util.logging.Logger.getLogger(groceryLanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(groceryLanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(groceryLanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(groceryLanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new groceryLanding().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGroceryManagement;
    private javax.swing.JButton btnGroceryOrder;
    // End of variables declaration//GEN-END:variables
}
