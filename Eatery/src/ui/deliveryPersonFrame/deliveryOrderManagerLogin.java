/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.deliveryPersonFrame;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.EateryEnterprise;

/**
 *
 * @author ktkir
 */

public class deliveryOrderManagerLogin extends javax.swing.JFrame {

    /**
     * Creates new form deliveryOrderManagerLogin
     */
    private EateryEnterprise eatery;
    String passcodeString= "delMng@123";
    public deliveryOrderManagerLogin(EateryEnterprise eatery) {
        initComponents();
        this.getContentPane().setBackground(new Color(0,153,204));
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

        passCode = new javax.swing.JTextField();
        btnPatientLogin = new javax.swing.JButton();
        txtLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        passCode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnPatientLogin.setBackground(new java.awt.Color(102, 102, 102));
        btnPatientLogin.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnPatientLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnPatientLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        btnPatientLogin.setText("LOGIN");
        btnPatientLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPatientLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPatientLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPatientLoginMouseExited(evt);
            }
        });
        btnPatientLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientLoginActionPerformed(evt);
            }
        });

        txtLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtLabel.setText("Passcode");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Please enter your Delivery Order Manager Passcode to login");

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMPLOYEE MANAGER LOGIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1600, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPatientLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passCode, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(664, 664, 664))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passCode, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnPatientLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 545, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPatientLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientLoginActionPerformed
        // TODO add your handling code here:
        if(!passCode.getText().equals(""))
        {
           
            if(passCode.getText().equals(passcodeString))
            {
                deliveryOrderManager empManage= new deliveryOrderManager(eatery);
                empManage.setVisible(true);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Passcode is invalid!");
            }
          
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Enter the passCodee to login!");
        }
    }//GEN-LAST:event_btnPatientLoginActionPerformed

    private void btnPatientLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPatientLoginMouseEntered
        // TODO add your handling code here:
        btnPatientLogin.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_btnPatientLoginMouseEntered

    private void btnPatientLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPatientLoginMouseExited
        // TODO add your handling code here:
        btnPatientLogin.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnPatientLoginMouseExited

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
            java.util.logging.Logger.getLogger(deliveryOrderManagerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deliveryOrderManagerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deliveryOrderManagerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deliveryOrderManagerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new deliveryOrderManagerLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPatientLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField passCode;
    private javax.swing.JLabel txtLabel;
    // End of variables declaration//GEN-END:variables
}