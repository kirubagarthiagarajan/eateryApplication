/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.deliveryPersonFrame;

import javax.swing.JFrame;
import model.EateryEnterprise;
import ui.restaurantFrame.menuManagePanel;

/**
 *
 * @author ktkir
 */
public class deliveryOrderManager extends javax.swing.JFrame {

    /**
     * Creates new form deliveryOrderManager
     */
    EateryEnterprise eatery;
    public deliveryOrderManager( EateryEnterprise eatery) {
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

        splittedPane = new javax.swing.JSplitPane();
        togglePane = new javax.swing.JPanel();
        mngOrders = new javax.swing.JButton();
        displayPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        splittedPane.setDividerLocation(150);

        mngOrders.setText("MANAGE ORDERS");
        mngOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngOrdersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout togglePaneLayout = new javax.swing.GroupLayout(togglePane);
        togglePane.setLayout(togglePaneLayout);
        togglePaneLayout.setHorizontalGroup(
            togglePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(togglePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mngOrders)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        togglePaneLayout.setVerticalGroup(
            togglePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(togglePaneLayout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(mngOrders)
                .addContainerGap(301, Short.MAX_VALUE))
        );

        splittedPane.setLeftComponent(togglePane);

        javax.swing.GroupLayout displayPaneLayout = new javax.swing.GroupLayout(displayPane);
        displayPane.setLayout(displayPaneLayout);
        displayPaneLayout.setHorizontalGroup(
            displayPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
        );
        displayPaneLayout.setVerticalGroup(
            displayPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );

        splittedPane.setRightComponent(displayPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splittedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splittedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mngOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngOrdersActionPerformed
        // TODO add your handling code here:
               deliveryOrderManagerPanel deliveryOrderManagerPanel = new deliveryOrderManagerPanel(eatery);
        splittedPane.setRightComponent(deliveryOrderManagerPanel);
    }//GEN-LAST:event_mngOrdersActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.eatery.replaceOrderDb();
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(deliveryOrderManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deliveryOrderManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deliveryOrderManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deliveryOrderManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new deliveryOrderManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel displayPane;
    private javax.swing.JButton mngOrders;
    private javax.swing.JSplitPane splittedPane;
    private javax.swing.JPanel togglePane;
    // End of variables declaration//GEN-END:variables
}
