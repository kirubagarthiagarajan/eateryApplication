/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.restaurantFrame;

import java.awt.Color;
import javax.swing.JFrame;
import model.EateryEnterprise;

/**
 *
 * @author ktkir
 */
public class employeeManageFrame extends javax.swing.JFrame {

    /**
     * Creates new form employeeManageFrame
     */
    private EateryEnterprise eatery;
    private int currentRestarauntId;
    public employeeManageFrame(EateryEnterprise eatery,int restarauntId) {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.eatery=eatery;
         this.eatery.populateOrdersToRestaurant(restarauntId);
         this.getContentPane().setBackground(new Color(0,153,204));
        this.currentRestarauntId=restarauntId;
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
        displayPane = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        togglePAne = new javax.swing.JPanel();
        btnManageMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        splittedPane.setDividerLocation(190);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Welcome to the Employee Management Portal. Please click 'MANAGE EMPLOYEES' to continue.");

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMPLOYEE MANAGER PORTAL");

        javax.swing.GroupLayout displayPaneLayout = new javax.swing.GroupLayout(displayPane);
        displayPane.setLayout(displayPaneLayout);
        displayPaneLayout.setHorizontalGroup(
            displayPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1405, Short.MAX_VALUE)
            .addGroup(displayPaneLayout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        displayPaneLayout.setVerticalGroup(
            displayPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayPaneLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 770, Short.MAX_VALUE))
        );

        splittedPane.setRightComponent(displayPane);

        btnManageMenu.setBackground(new java.awt.Color(102, 102, 102));
        btnManageMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnManageMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnManageMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team-management.png"))); // NOI18N
        btnManageMenu.setText("MANAGE EMPLOYEES");
        btnManageMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageMenuMouseExited(evt);
            }
        });
        btnManageMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout togglePAneLayout = new javax.swing.GroupLayout(togglePAne);
        togglePAne.setLayout(togglePAneLayout);
        togglePAneLayout.setHorizontalGroup(
            togglePAneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(togglePAneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnManageMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        togglePAneLayout.setVerticalGroup(
            togglePAneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(togglePAneLayout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(btnManageMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(561, Short.MAX_VALUE))
        );

        splittedPane.setLeftComponent(togglePAne);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splittedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splittedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageMenuActionPerformed
        // TODO add your handling code here:
        employeeManagePanel menuManage = new employeeManagePanel(eatery,currentRestarauntId);
        splittedPane.setRightComponent(menuManage);
    }//GEN-LAST:event_btnManageMenuActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.eatery.replaceEmployeeDb();
    }//GEN-LAST:event_formWindowClosed

    private void btnManageMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageMenuMouseEntered
        // TODO add your handling code here:
         btnManageMenu.setBackground(new Color(255,204,0));


    }//GEN-LAST:event_btnManageMenuMouseEntered

    private void btnManageMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageMenuMouseExited
        // TODO add your handling code here:
        btnManageMenu.setBackground(new Color(102,102,102));

    }//GEN-LAST:event_btnManageMenuMouseExited

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
            java.util.logging.Logger.getLogger(employeeManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeeManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeeManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeeManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new employeeManageFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageMenu;
    private javax.swing.JPanel displayPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane splittedPane;
    private javax.swing.JPanel togglePAne;
    // End of variables declaration//GEN-END:variables
}
