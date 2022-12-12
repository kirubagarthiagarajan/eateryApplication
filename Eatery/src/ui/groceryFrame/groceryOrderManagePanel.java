/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.groceryFrame;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.EateryEnterprise;
import model.Food;
import model.Grocery;
import model.Order;

/**
 *
 * @author ktkir
 */
public class groceryOrderManagePanel extends javax.swing.JPanel {

    /**
     * Creates new form groceryOrderManagePanel
     */
    EateryEnterprise eatery;
        private List<Order> resOrders;
    private List<Grocery> orderedGrocery;
    public groceryOrderManagePanel(EateryEnterprise eatery) {
        initComponents();
        this.eatery=eatery;
        resOrders= new ArrayList<>();
        resOrders=  eatery.getGroceryOrders();
        this.orderedGrocery=new ArrayList<>();
        btnProcessOrder.setVisible(false);
        btnCancelOrder.setVisible(false);
        populateOrders();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnViewFood = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGrocery = new javax.swing.JTable();
        btnProcessOrder = new javax.swing.JButton();
        btnCancelOrder = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE  GROCERY ORDER");

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "OrderId", "Price", "Customer Id"
            }
        ));
        jScrollPane2.setViewportView(tblOrders);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Current Orders");

        btnViewFood.setText("View Ordered Groceries");
        btnViewFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFoodActionPerformed(evt);
            }
        });

        tblGrocery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Grocery Name", "Price", "Quantity Placed"
            }
        ));
        jScrollPane1.setViewportView(tblGrocery);

        btnProcessOrder.setText("Process Order");
        btnProcessOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessOrderActionPerformed(evt);
            }
        });

        btnCancelOrder.setText("Cancel Order");
        btnCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(535, 535, 535)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnProcessOrder)
                            .addGap(299, 299, 299)
                            .addComponent(btnCancelOrder)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(btnViewFood))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewFood, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcessOrder)
                    .addComponent(btnCancelOrder))
                .addContainerGap(345, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
private void populateOrders() 
     {
    
         tblOrders.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel tableModel = (DefaultTableModel) tblOrders.getModel();
        tableModel.setRowCount(0);
        if (resOrders!=null) {
            for (int i = 0; i < resOrders.size(); i++) {
                Order o = resOrders.get(i);
                Object[] tableRow = new Object[10];
                tableRow[0] = o.getOrderId();
                tableRow[1]= o.getTotalPrice();
                tableRow[2] = o.getCustomerId();
                tableModel.addRow(tableRow);
            }
        }
         
     }
    private void btnViewFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFoodActionPerformed
        // TODO add your handling code here:
        int col= 0;
        int row=tblOrders.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(this, "You should select atleast 1 row to update!");
        } else {
            int OrderId= Integer.parseInt(tblOrders.getModel().getValueAt(row, col).toString());
            Order order = eatery.getOrderWithOrderId(OrderId);
            orderedGrocery=order.getOrderedGroceryList();
            if(orderedGrocery.size()>0)
            {
                populateGroceryList();
                btnProcessOrder.setVisible(true);
                btnCancelOrder.setVisible(true);
            }

        }
    }//GEN-LAST:event_btnViewFoodActionPerformed

    private void populateGroceryList() 
     {
    
         tblGrocery.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel tableModel = (DefaultTableModel) tblGrocery.getModel();
        tableModel.setRowCount(0);
        if (orderedGrocery!=null) {
            for (int i = 0; i < orderedGrocery.size(); i++) {
                Grocery o = orderedGrocery.get(i);
                Object[] tableRow = new Object[10];
                tableRow[0] = o.getGroceryName();
                tableRow[1]= o.getPrice();
                tableRow[2] = o.getOrderQuantity();
                tableModel.addRow(tableRow);
            }
        }
         
     }
    
    
    private void btnProcessOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessOrderActionPerformed
        // TODO add your handling code here:
        int col= 0;
        int row=tblOrders.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "You should select atleast 1 row to update!");
        } else {
            int OrderId= Integer.parseInt(tblOrders.getModel().getValueAt(row, col).toString());
            eatery.processOrderByGrocery(OrderId);
            resOrders=eatery.getGroceryOrders();
            orderedGrocery.clear();
            populateOrders();
            populateGroceryList();
        }
    }//GEN-LAST:event_btnProcessOrderActionPerformed

    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        // TODO add your handling code here:
        int col= 0;
        int row=tblOrders.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(this, "You should select atleast 1 row to update!");
        } else {
            int OrderId= Integer.parseInt(tblOrders.getModel().getValueAt(row, col).toString());
            Order ord = eatery.getOrderWithOrderId(OrderId);
            eatery.cancelOrderByGrocery(OrderId);
            resOrders=(ArrayList<Order>) eatery.getGroceryOrders();
            orderedGrocery.clear();
            populateOrders();
            populateGroceryList();
        }

    }//GEN-LAST:event_btnCancelOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnProcessOrder;
    private javax.swing.JButton btnViewFood;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblGrocery;
    private javax.swing.JTable tblOrders;
    // End of variables declaration//GEN-END:variables
}