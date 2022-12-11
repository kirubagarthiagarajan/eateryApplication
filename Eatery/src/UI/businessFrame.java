/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.Color;
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
        this.getContentPane().setBackground(new Color(0,153,204));
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
        btnEateryEnterprise = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRestarauntFrame.setBackground(new java.awt.Color(102, 102, 102));
        btnRestarauntFrame.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        btnRestarauntFrame.setText("RESTARAUNT ENTERPRISE");
        btnRestarauntFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRestarauntFrameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRestarauntFrameMouseExited(evt);
            }
        });
        btnRestarauntFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarauntFrameActionPerformed(evt);
            }
        });

        btnDeliveryPersonFrame.setBackground(new java.awt.Color(102, 102, 102));
        btnDeliveryPersonFrame.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        btnDeliveryPersonFrame.setText("DELIVERY ENTERPRISE");
        btnDeliveryPersonFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeliveryPersonFrameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeliveryPersonFrameMouseExited(evt);
            }
        });
        btnDeliveryPersonFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryPersonFrameActionPerformed(evt);
            }
        });

        btnGrocery.setBackground(new java.awt.Color(102, 102, 102));
        btnGrocery.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        btnGrocery.setText("GROCERY ENTERPRISE");
        btnGrocery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGroceryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGroceryMouseExited(evt);
            }
        });
        btnGrocery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGroceryActionPerformed(evt);
            }
        });

        btnEateryEnterprise.setBackground(new java.awt.Color(102, 102, 102));
        btnEateryEnterprise.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        btnEateryEnterprise.setText("EATERY ENTERPRISE");
        btnEateryEnterprise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEateryEnterpriseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEateryEnterpriseMouseExited(evt);
            }
        });
        btnEateryEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEateryEnterpriseActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUSINESS ENTERPRISE PORTAL");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("WELCOME TO THE BUSINESS ENTERPRISE PORTAL. CLICK THE APPROPRIATE BUTTON, BASED ON YOUR ENTERPRISE");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/businessImage.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1600, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(380, 380, 380))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(btnEateryEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGrocery, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRestarauntFrame)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeliveryPersonFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEateryEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRestarauntFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeliveryPersonFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGrocery, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
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

    private void btnEateryEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEateryEnterpriseActionPerformed
        // TODO add your handling code here:
        eateryCustomerManageLogin cm = new eateryCustomerManageLogin(eatery);
        cm.setVisible(true);
    }//GEN-LAST:event_btnEateryEnterpriseActionPerformed

    private void btnEateryEnterpriseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEateryEnterpriseMouseExited
        // TODO add your handling code here:
            btnEateryEnterprise.setBackground(new Color(102,102,102));

    }//GEN-LAST:event_btnEateryEnterpriseMouseExited

    private void btnEateryEnterpriseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEateryEnterpriseMouseEntered
        // TODO add your handling code here:
          btnEateryEnterprise.setBackground(new Color(255,204,0));

    }//GEN-LAST:event_btnEateryEnterpriseMouseEntered

    private void btnRestarauntFrameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestarauntFrameMouseExited
        // TODO add your handling code here:
        btnRestarauntFrame.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnRestarauntFrameMouseExited

    private void btnRestarauntFrameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestarauntFrameMouseEntered
        // TODO add your handling code here:
        btnRestarauntFrame.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_btnRestarauntFrameMouseEntered

    private void btnDeliveryPersonFrameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeliveryPersonFrameMouseExited
        // TODO add your handling code here:
        btnDeliveryPersonFrame.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnDeliveryPersonFrameMouseExited

    private void btnDeliveryPersonFrameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeliveryPersonFrameMouseEntered
        // TODO add your handling code here:
        btnDeliveryPersonFrame.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_btnDeliveryPersonFrameMouseEntered

    private void btnGroceryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGroceryMouseEntered
        // TODO add your handling code here:
         btnGrocery.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_btnGroceryMouseEntered

    private void btnGroceryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGroceryMouseExited
        // TODO add your handling code here:
        btnGrocery.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnGroceryMouseExited

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
    private javax.swing.JButton btnDeliveryPersonFrame;
    private javax.swing.JButton btnEateryEnterprise;
    private javax.swing.JButton btnGrocery;
    private javax.swing.JButton btnRestarauntFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}