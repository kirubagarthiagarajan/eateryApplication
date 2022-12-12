/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.deliveryPersonFrame;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.DeliveryPerson;
import model.EateryEnterprise;
import model.Order;

/**
 *
 * @author ktkir
 */
public class deliveryOrderManagerPanel extends javax.swing.JPanel {

    /**
     * Creates new form deliveryOrderManagerPanel
     */
    EateryEnterprise eatery;
    List<Order> currentOrderList;
    ArrayList<DeliveryPerson> deliveryPersonList;
    int orderId;
    public deliveryOrderManagerPanel(EateryEnterprise eatery) {
        initComponents();
        this.eatery=eatery;
        this.currentOrderList=eatery.getOrdersThatReadyForDelivery();
        populateOrders();
    }
    public void populateOrders()
    {
         tblOrders.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel tableModel = (DefaultTableModel) tblOrders.getModel();
        tableModel.setRowCount(0);
        //System.out.print("outside if");
        if (currentOrderList!=null) {
            System.out.print("outside if");
            for (int i = 0; i < currentOrderList.size(); i++) {
                Order o = currentOrderList.get(i);
                Object[] tableRow = new Object[10];
                tableRow[0] = o.getOrderId();
                if(o.getRestaurantId()==-1)
                {
                     tableRow[1]= "GROCERY STORE BOSTON";
                        tableRow[2] = o.getCustomerId();
                tableRow[3] = o.getCity();
                tableModel.addRow(tableRow);
                }
                else
                {
                    tableRow[1]= o.getRestaurantId();
                     tableRow[2] = o.getCustomerId();
                tableRow[3] = o.getCity();
                tableModel.addRow(tableRow);
                }
            }
        }
    }
    public void populateDeliveryBoyTable()
    {
        tblDeliveryBoy.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel tableModel = (DefaultTableModel) tblDeliveryBoy.getModel();
        tableModel.setRowCount(0);
        //System.out.print("outside if");
        if (deliveryPersonList!=null) {
            //System.out.print("outside if");
            for (int i = 0; i < deliveryPersonList.size(); i++) {
                DeliveryPerson d = deliveryPersonList.get(i);
                Object[] tableRow = new Object[10];
                tableRow[0] = d.getStateId();
                tableRow[1]=d.getName();
                tableRow[2] =d.getCity();
                tableRow[3] = d.getAddress();
                tableModel.addRow(tableRow);
            }
        }
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        getFreeDelivery = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDeliveryBoy = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        assignOrder = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("DELIVERY PERSONS AVAILABLE IN THE CITY");

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SMART DELIVERY - ORDER MANAGER");

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order Id", "Restaraunt/Grocery Store Id", "Customer Id", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrders);

        getFreeDelivery.setBackground(new java.awt.Color(102, 102, 102));
        getFreeDelivery.setForeground(new java.awt.Color(255, 255, 255));
        getFreeDelivery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delivery.png"))); // NOI18N
        getFreeDelivery.setText("GET FREE DELIVERY PERSON IN ORDER'S CITY");
        getFreeDelivery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getFreeDelivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                getFreeDeliveryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                getFreeDeliveryMouseExited(evt);
            }
        });
        getFreeDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getFreeDeliveryActionPerformed(evt);
            }
        });

        tblDeliveryBoy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Delivery Person Id", "Name", "City", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDeliveryBoy);
        if (tblDeliveryBoy.getColumnModel().getColumnCount() > 0) {
            tblDeliveryBoy.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("ORDERS YET TO BE ASSIGNED TO A DELIERY PERSON");

        assignOrder.setBackground(new java.awt.Color(102, 102, 102));
        assignOrder.setForeground(new java.awt.Color(255, 255, 255));
        assignOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/courier.png"))); // NOI18N
        assignOrder.setText("ASSIGN ORDER");
        assignOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        assignOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                assignOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                assignOrderMouseExited(evt);
            }
        });
        assignOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(636, 636, 636)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getFreeDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(671, 671, 671)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(413, 413, 413))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(assignOrder)
                        .addGap(743, 743, 743))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(getFreeDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(assignOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getFreeDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getFreeDeliveryActionPerformed
        // TODO add your handling code here:
         int col= 0;
        int row=tblOrders.getSelectedRow();
        
              if(row < 0)
        {
            JOptionPane.showMessageDialog(this, "Select a order to retrieve delivery personnel!");
        }
        else
           {
        orderId= Integer.parseInt(tblOrders.getModel().getValueAt(row, col).toString());
        Order currentOrder=eatery.getOrderWithOrderId(orderId);
       
         this.deliveryPersonList=(ArrayList<DeliveryPerson>) eatery.getDeliveryBoyThatAreFreeInSameCity(currentOrder.getCity());
         populateDeliveryBoyTable();
        
           }
        
    }//GEN-LAST:event_getFreeDeliveryActionPerformed

    private void assignOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignOrderActionPerformed
        // TODO add your handling code here:
         int col= 0;
        int row=tblDeliveryBoy.getSelectedRow();
           if(row < 0)
        {
            JOptionPane.showMessageDialog(this, "Select a delivery boy to assign order!");
        }
        else
           {
               int deliveryPersonId= Integer.parseInt(tblDeliveryBoy.getModel().getValueAt(row, col).toString());
        String deliveryPersonName= tblDeliveryBoy.getModel().getValueAt(row, 1).toString();
        //Order currentOrder=eatery.getOrderWithOrderId(orderId);
  
       
             JOptionPane.showMessageDialog(this, "Assigned is "+eatery.assignOrderToDeliveryBoy(orderId,deliveryPersonId) );
            
        eatery.assignOrderToDeliveryBoy(orderId,deliveryPersonId);
        JOptionPane.showMessageDialog(this, "Order assigned to"+deliveryPersonName );
        this.currentOrderList=eatery.getOrdersThatReadyForDelivery();
        this.deliveryPersonList.clear();
       populateOrders();
       populateDeliveryBoyTable();
        
           }
        
    }//GEN-LAST:event_assignOrderActionPerformed

    private void getFreeDeliveryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getFreeDeliveryMouseEntered
        // TODO add your handling code here:
        getFreeDelivery.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_getFreeDeliveryMouseEntered

    private void getFreeDeliveryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getFreeDeliveryMouseExited
        // TODO add your handling code here:
        getFreeDelivery.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_getFreeDeliveryMouseExited

    private void assignOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignOrderMouseEntered
        // TODO add your handling code here:
        assignOrder.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_assignOrderMouseEntered

    private void assignOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignOrderMouseExited
        // TODO add your handling code here:
         assignOrder.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_assignOrderMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignOrder;
    private javax.swing.JButton getFreeDelivery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDeliveryBoy;
    private javax.swing.JTable tblOrders;
    // End of variables declaration//GEN-END:variables

   
}
