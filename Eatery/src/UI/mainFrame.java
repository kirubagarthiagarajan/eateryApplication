/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.deliveryPartnerEnterprise;
import model.eateryCustomerManagement;
import model.eateryEnterprise;
import model.orderDirectory;
import model.restarauntManagement;
import ui.systemAdmin.systemAdminLogin;

/**
 *
 * @author ktkir
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    
    
        private eateryCustomerManagement eatCusManage;
    private restarauntManagement restarauntManagement;
    private deliveryPartnerEnterprise deliveryEnterPrise;
    private orderDirectory orderList;
    private eateryEnterprise eatery;
    public mainFrame() {
        initComponents();
        eatCusManage=new eateryCustomerManagement();
        restarauntManagement=new restarauntManagement();
        deliveryEnterPrise=new deliveryPartnerEnterprise();
        orderList=new orderDirectory();
        eatery= new eateryEnterprise(eatCusManage,restarauntManagement,deliveryEnterPrise,orderList);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSystemAdminFrame = new javax.swing.JButton();
        btnCustomerFrame = new javax.swing.JButton();
        btnDeliveryPersonFrame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EATERY APPLICATION");

        btnSystemAdminFrame.setBackground(new java.awt.Color(255, 204, 204));
        btnSystemAdminFrame.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        btnSystemAdminFrame.setText("SYSTEM ADMIN");
        btnSystemAdminFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSystemAdminFrameActionPerformed(evt);
            }
        });

        btnCustomerFrame.setBackground(new java.awt.Color(255, 255, 0));
        btnCustomerFrame.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        btnCustomerFrame.setText("CUSTOMER");
        btnCustomerFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerFrameActionPerformed(evt);
            }
        });

        btnDeliveryPersonFrame.setBackground(new java.awt.Color(255, 255, 0));
        btnDeliveryPersonFrame.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        btnDeliveryPersonFrame.setText("DELIVERY BOY");
        btnDeliveryPersonFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryPersonFrameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(393, 393, 393)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSystemAdminFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnCustomerFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addComponent(btnDeliveryPersonFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(btnCustomerFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnDeliveryPersonFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnSystemAdminFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 174, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomerFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerFrameActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_btnCustomerFrameActionPerformed

    private void btnDeliveryPersonFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryPersonFrameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeliveryPersonFrameActionPerformed

    private void btnSystemAdminFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSystemAdminFrameActionPerformed
        // TODO add your handling code here:
   systemAdminLogin sysadminLogin= new systemAdminLogin(eatery);
    sysadminLogin.setVisible(true);
    }//GEN-LAST:event_btnSystemAdminFrameActionPerformed

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerFrame;
    private javax.swing.JButton btnDeliveryPersonFrame;
    private javax.swing.JButton btnSystemAdminFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
