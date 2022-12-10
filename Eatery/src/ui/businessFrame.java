/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JFrame;
import model.EateryEnterprise;
import ui.customerFrame.CustomerManageFrame;
import ui.deliveryPersonFrame.deliveryLanding;
import ui.groceryFrame.groceryLanding;
import ui.restaurantFrame.restaurantLanding;

/**
 *
 * @author ktkir
 */
public class businessFrame extends javax.swing.JFrame {

    /**
     * Creates new form businessFrame
     */
    EateryEnterprise eatery;
    public businessFrame(EateryEnterprise eatery) {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setExtendedState(MAXIMIZED_BOTH );
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

        btnRestarauntFrame = new javax.swing.JButton();
        btnDeliveryPersonFrame = new javax.swing.JButton();
        btnGrocery = new javax.swing.JButton();
        btnCustomerFrame = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRestarauntFrame.setBackground(new java.awt.Color(255, 204, 204));
        btnRestarauntFrame.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        btnRestarauntFrame.setText("RESTARAUNT ENTERPRISE");
        btnRestarauntFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarauntFrameActionPerformed(evt);
            }
        });

        btnDeliveryPersonFrame.setBackground(new java.awt.Color(255, 204, 204));
        btnDeliveryPersonFrame.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        btnDeliveryPersonFrame.setText("DELIVERY ENTERPRISE");
        btnDeliveryPersonFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryPersonFrameActionPerformed(evt);
            }
        });

        btnGrocery.setBackground(new java.awt.Color(255, 204, 204));
        btnGrocery.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        btnGrocery.setText("GROCERY ENTERPRISE");
        btnGrocery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGroceryActionPerformed(evt);
            }
        });

        btnCustomerFrame.setBackground(new java.awt.Color(255, 204, 204));
        btnCustomerFrame.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        btnCustomerFrame.setText("EATERY ENTERPRISE");
        btnCustomerFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerFrameActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUSINESS ENTERPRISE PORTAL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGrocery, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRestarauntFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeliveryPersonFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCustomerFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(btnCustomerFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRestarauntFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeliveryPersonFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGrocery, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRestarauntFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarauntFrameActionPerformed
        // TODO add your handling code here:
        restaurantLanding restLand = new restaurantLanding(eatery);
        restLand.setVisible(true);
    }//GEN-LAST:event_btnRestarauntFrameActionPerformed

    private void btnDeliveryPersonFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryPersonFrameActionPerformed
        // TODO add your handling code here:
        deliveryLanding delMain= new deliveryLanding(eatery);
        delMain.setVisible(true);
    }//GEN-LAST:event_btnDeliveryPersonFrameActionPerformed

    private void btnGroceryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGroceryActionPerformed
        // TODO add your handling code here:
        groceryLanding grocLanding = new groceryLanding(eatery);
        grocLanding.setVisible(true);
    }//GEN-LAST:event_btnGroceryActionPerformed

    private void btnCustomerFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerFrameActionPerformed
        // TODO add your handling code here:
        CustomerManageFrame cm = new CustomerManageFrame(eatery);
        cm.setVisible(true);
    }//GEN-LAST:event_btnCustomerFrameActionPerformed

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
            java.util.logging.Logger.getLogger(businessFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(businessFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(businessFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(businessFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new businessFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerFrame;
    private javax.swing.JButton btnDeliveryPersonFrame;
    private javax.swing.JButton btnGrocery;
    private javax.swing.JButton btnRestarauntFrame;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
