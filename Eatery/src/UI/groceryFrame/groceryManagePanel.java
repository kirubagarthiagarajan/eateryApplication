/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.groceryFrame;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.EateryEnterprise;
import model.Food;
import model.Grocery;
import model.GroceryEnterprise;

/**
 *
 * @author HARISH
 */
public class groceryManagePanel extends javax.swing.JPanel {

    /**
     * Creates new form groceryManagePanel
     */
    private EateryEnterprise eatery;
      private List<Grocery> a;
    
    public groceryManagePanel(EateryEnterprise eatery) {
        initComponents();
        this.eatery=eatery;
        a=eatery.getGroceries();
        displayFoodTable();
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfgroceryid = new javax.swing.JTextField();
        tfgroceryname = new javax.swing.JTextField();
        tfquantity = new javax.swing.JTextField();
        tfprice = new javax.swing.JTextField();
        btnaddgrocery = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        searchValue = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        mngMenuTable = new javax.swing.JTable();
        btndeletegrocery = new javax.swing.JButton();
        btnupdategrocery = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfgroceryids = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfgrocerynames = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfquantitys = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfprices = new javax.swing.JTextField();
        btncupdate = new javax.swing.JButton();

        jLabel1.setText("GROCERY ID");

        jLabel2.setText("GROCERY NAME");

        jLabel3.setText("QUANTITY");

        jLabel4.setText("PRICE");

        btnaddgrocery.setText("ADD GROCERY");
        btnaddgrocery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddgroceryActionPerformed(evt);
            }
        });

        jLabel5.setText("SEARCH");

        mngMenuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "GROCERY ID", "GROCERY NAME", "QUANTITY", "PRICE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(mngMenuTable);

        btndeletegrocery.setText("DELETE GROCERY");
        btndeletegrocery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletegroceryActionPerformed(evt);
            }
        });

        btnupdategrocery.setText("UPDATE GROCERY");
        btnupdategrocery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdategroceryActionPerformed(evt);
            }
        });

        jLabel6.setText("GROCERY ID");

        jLabel7.setText("GROCERY NAME");

        jLabel8.setText("QUANTITY");

        tfquantitys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfquantitysActionPerformed(evt);
            }
        });

        jLabel9.setText("PRICE");

        tfprices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpricesActionPerformed(evt);
            }
        });

        btncupdate.setText("CONFIRM UPDATE");
        btncupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncupdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(266, 266, 266)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(277, 277, 277)
                                .addComponent(jLabel5)))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(searchValue, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(tfgroceryid)
                                .addComponent(tfgroceryname)
                                .addComponent(tfquantity)
                                .addComponent(tfprice))
                            .addComponent(btnaddgrocery)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btndeletegrocery)
                                .addGap(119, 119, 119)
                                .addComponent(btnupdategrocery))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfgroceryids, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfgrocerynames)
                                            .addComponent(tfquantitys)
                                            .addComponent(tfprices, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                                        .addGap(42, 42, 42)
                                        .addComponent(btncupdate)))))))
                .addContainerGap(169, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfgroceryid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfgroceryname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tfquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tfprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnaddgrocery)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchValue))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndeletegrocery)
                    .addComponent(btnupdategrocery))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfgroceryids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btncupdate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfgrocerynames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tfquantitys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(tfprices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfquantitysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfquantitysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfquantitysActionPerformed

    private void tfpricesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpricesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfpricesActionPerformed

    private void btncupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncupdateActionPerformed
        // TODO add your handling code here:
         int col=0;
        int row=mngMenuTable.getSelectedRow();
         if (row < 0) {
            JOptionPane.showMessageDialog(this, "You should select atleast 1 row to update!");
        } else {
        int groceryId= Integer.parseInt(mngMenuTable.getModel().getValueAt(row, col).toString());
     if(!tfgrocerynames.getText().equals("") && !tfquantitys.getText().equals("")&& !tfprices.getText().equals("") )
        {
            if(!tfquantitys.getText().matches("[0-9]+"))
                {
                    JOptionPane.showMessageDialog(this, "Quantity should be a number!");
                }
             if(!tfprices.getText().matches("[0-9]+"))
                {
                    JOptionPane.showMessageDialog(this, "Price should be a number!");
                }
           
             if(tfquantitys.getText().matches("[0-9]+") && tfprices.getText().matches("[0-9]+"))
                {
        
                    eatery.updateGrocery(groceryId,tfgrocerynames.getText(),Double.parseDouble(tfprices.getText()),Integer.parseInt(tfquantitys.getText()));
        
        tfgroceryids.setText("");
         tfgrocerynames.setText("");
         tfquantitys.setText("");
         tfprices.setText("");
         displayFoodTable();
                }
        

         }
                }
    }//GEN-LAST:event_btncupdateActionPerformed

    private void btnaddgroceryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddgroceryActionPerformed
        // TODO add your handling code here:
        if(!tfgroceryid.getText().equals("") && !tfgroceryname.getText().equals("") && !tfquantity.getText().equals("")&& !tfprice.getText().equals("") )
        {
            if(!tfquantity.getText().matches("[0-9]+"))
                {
                    JOptionPane.showMessageDialog(this, "Quantity should be a number!");
                }
             if(!tfprice.getText().matches("[0-9]+"))
                {
                    JOptionPane.showMessageDialog(this, "Price should be a number!");
                }
            
                if(!tfgroceryid.getText().matches("[0-9]+"))
                {
                    JOptionPane.showMessageDialog(this, "Grocery ID should be a number!");
                }
                else
                {
                    if(!eatery.isGroceryIdUnique(Integer.parseInt(tfgroceryid.getText())) )
                    {
                        JOptionPane.showMessageDialog(this, "Grocery ID should be unique!");
                    }
                }
                
                if(tfquantity.getText().matches("[0-9]+") && tfprice.getText().matches("[0-9]+") && tfgroceryid.getText().matches("[0-9]+") && eatery.isGroceryIdUnique(Integer.parseInt(tfgroceryid.getText())) )
                {
                 eatery.addGrocery(Integer.parseInt(tfgroceryid.getText()),tfgroceryname.getText(),Double.parseDouble(tfprice.getText()) , Integer.parseInt(tfquantity.getText()));
                JOptionPane.showMessageDialog(this, "Grocery Added to Stock!");
        
                displayFoodTable(); 
                }
        
        }   
        else
        {
             JOptionPane.showMessageDialog(this, "Fields are empty ");
        }
        
    }//GEN-LAST:event_btnaddgroceryActionPerformed

    private void btndeletegroceryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletegroceryActionPerformed
        // TODO add your handling code here:
         int col=0;
        int row=mngMenuTable.getSelectedRow();
        int groceryId= Integer.parseInt(mngMenuTable.getModel().getValueAt(row, col).toString());
        // NEDD to have code here
        // a current =  eatery.getGroceryById(groceryId);
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "You should select atleast 1 row to delete!");
        } 
        else
        {
             eatery.removeGrocery(groceryId);
             displayFoodTable();
          //   a=
           JOptionPane.showMessageDialog(this, "Grocery Deleted");
            
        }
        
    }//GEN-LAST:event_btndeletegroceryActionPerformed

    private void btnupdategroceryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdategroceryActionPerformed
        // TODO add your handling code here:
        int col=0;
        int row=mngMenuTable.getSelectedRow();
        int groceryId= Integer.parseInt(mngMenuTable.getModel().getValueAt(row, col).toString());
        
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "You should select atleast 1 row to update!");
        }
        else
        {
         
         tfgrocerynames.setEnabled(true);
         tfquantitys.setEnabled(true);
         tfprices.setEnabled(true);
         btncupdate.setEnabled(true);
         
         Grocery foo = eatery.getGroceryById(groceryId);
    
         tfgroceryids.setText(Integer.toString(foo.getGroceryId()));
         tfgrocerynames.setText(foo.getGroceryName());
         tfquantitys.setText(Integer.toString(foo.getQuantity()));
         tfprices.setText(Double.toString(foo.getPrice()));
         
        }
        
    }//GEN-LAST:event_btnupdategroceryActionPerformed

     private void searchValueKeyPressed(java.awt.event.KeyEvent evt) {                                       
        // TODO add your handling code here:
        search(searchValue.getText());
    }                                      

    private void searchValueKeyReleased(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
          search(searchValue.getText());
    } 
    
     public void search(String str) {
        DefaultTableModel model = (DefaultTableModel) mngMenuTable.getModel();
        TableRowSorter<DefaultTableModel> trs =new TableRowSorter<>(model);
        mngMenuTable.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
       }
     
    
    private void displayFoodTable() 
     {
         tfgroceryids.setEnabled(false);
         tfgrocerynames.setEnabled(false);
         tfquantitys.setEnabled(false);
         tfprices.setEnabled(false);
         btncupdate.setEnabled(false);
         
         tfgroceryid.setText("");
         tfgroceryname.setText("");
         tfquantity.setText("");
         tfprice.setText("");
         
         mngMenuTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel tableModel = (DefaultTableModel) mngMenuTable.getModel();
        tableModel.setRowCount(0);
        a=eatery.getGroceries();
        if (a!=null) {
            for (int i = 0; i < a.size(); i++) {
                Grocery fo = a.get(i);
                Object[] tableRow = new Object[10];
                tableRow[0] = fo.getGroceryId();
                tableRow[1]= fo.getGroceryName();
                tableRow[2]= fo.getPrice();
                tableRow[3] = fo.getQuantity();
                        
                tableModel.addRow(tableRow);
            }
        }
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddgrocery;
    private javax.swing.JButton btncupdate;
    private javax.swing.JButton btndeletegrocery;
    private javax.swing.JButton btnupdategrocery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mngMenuTable;
    private javax.swing.JTextField searchValue;
    private javax.swing.JTextField tfgroceryid;
    private javax.swing.JTextField tfgroceryids;
    private javax.swing.JTextField tfgroceryname;
    private javax.swing.JTextField tfgrocerynames;
    private javax.swing.JTextField tfprice;
    private javax.swing.JTextField tfprices;
    private javax.swing.JTextField tfquantity;
    private javax.swing.JTextField tfquantitys;
    // End of variables declaration//GEN-END:variables
}
