/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.systemAdmin;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Restaurant;
import model.EateryEnterprise;

/**
 *
 * @author ktkir
 */
public class restarauntManagePanel extends javax.swing.JPanel {

    /**
     * Creates new form restarauntManagePanel
     */
       private EateryEnterprise eatery;
       private ArrayList<Restaurant> currentRestarauntList;
    public restarauntManagePanel(EateryEnterprise eatery) {
        initComponents();
        this.eatery=eatery;
        this.currentRestarauntList=eatery.getAllrestaurants();
        displayRestaraunts();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateRestaraunt = new javax.swing.JButton();
        btnAddCity = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mngRestarauntTable = new javax.swing.JTable();
        textRestarauntId = new javax.swing.JTextField();
        searchValue = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        deleteRestaraunt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        confirmUpdate = new javax.swing.JButton();
        textRestarauntName = new javax.swing.JTextField();
        cityDropDown = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        editCity = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        editRestarauntName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        updateRestaraunt.setBackground(new java.awt.Color(255, 255, 0));
        updateRestaraunt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateRestaraunt.setText("Update Restaraunt");
        updateRestaraunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRestarauntActionPerformed(evt);
            }
        });

        btnAddCity.setBackground(new java.awt.Color(255, 255, 0));
        btnAddCity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddCity.setText("Add Restaraunt");
        btnAddCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCityActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Restaraunt Id");

        mngRestarauntTable.setBackground(new java.awt.Color(255, 255, 0));
        mngRestarauntTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mngRestarauntTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaraunt Id", "Restaraunt Name", "City"
            }
        ));
        jScrollPane1.setViewportView(mngRestarauntTable);

        textRestarauntId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        searchValue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchValueActionPerformed(evt);
            }
        });
        searchValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchValueKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchValueKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Restaraunts");

        deleteRestaraunt.setBackground(new java.awt.Color(255, 255, 0));
        deleteRestaraunt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteRestaraunt.setText("Delete Restaraunt");
        deleteRestaraunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRestarauntActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Restaraunt Name");

        confirmUpdate.setBackground(new java.awt.Color(255, 255, 0));
        confirmUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirmUpdate.setText("Confirm Update");
        confirmUpdate.setEnabled(false);
        confirmUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmUpdateActionPerformed(evt);
            }
        });

        textRestarauntName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textRestarauntName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRestarauntNameActionPerformed(evt);
            }
        });

        cityDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOSTON", "NEW YORK", "VIRGINIA", "NEW JERSEY", "BUFFALO" }));
        cityDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityDropDownActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("City");

        editCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOSTON", "NEW YORK", "VIRGINIA", "NEW JERSEY", "BUFFALO" }));
        editCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCityActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("City");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Restaraunt Name");

        editRestarauntName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editRestarauntName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editRestarauntNameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1600, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchValue, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAddCity)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(30, 30, 30))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(50, 50, 50)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textRestarauntName)
                                    .addComponent(cityDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textRestarauntId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(deleteRestaraunt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateRestaraunt)))
                        .addGap(560, 560, 560))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(editRestarauntName)
                            .addComponent(editCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(652, 652, 652))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(confirmUpdate)
                        .addGap(691, 691, 691))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textRestarauntId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textRestarauntName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addComponent(btnAddCity)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(searchValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateRestaraunt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteRestaraunt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(editRestarauntName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(confirmUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateRestarauntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRestarauntActionPerformed
        int col= 0;
        int row=mngRestarauntTable.getSelectedRow();
       

        if (row < 0) {
            JOptionPane.showMessageDialog(this, "You should select atleast 1 row to update!");
        } else {
             int restarauntId= Integer.parseInt(mngRestarauntTable.getModel().getValueAt(row, col).toString());
            editRestarauntName.setEnabled(true);
            editCity.setEnabled(true);
            confirmUpdate.setEnabled(true);
            Restaurant res =eatery.getRestaurantById(restarauntId);
            editRestarauntName.setText(res.getRestaurantName());
            editCity.setSelectedItem(res.getCity());
        }
    }//GEN-LAST:event_updateRestarauntActionPerformed

    private void btnAddCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCityActionPerformed
        // TODO add your handling code here:
        if(!textRestarauntName.getText().equals("") && !textRestarauntId.getText().equals("") && cityDropDown.getSelectedItem()!=null)
        {
             if(!textRestarauntId.getText().matches("[0-9]+"))
            {
                JOptionPane.showMessageDialog(this, "Restaraunt id should be all numbers!");
            }
            
            if(!eatery.isRestaurantIdUnique(Integer.parseInt(textRestarauntId.getText())))
            {
                JOptionPane.showMessageDialog(this, "Restaraunt id should be unique!");
            }


            else if(textRestarauntId.getText().matches("[0-9]+") && eatery.isRestaurantIdUnique(Integer.parseInt(textRestarauntId.getText())))
            {
                eatery.addRestaurantToDirectory(textRestarauntName.getText(),Integer.parseInt(textRestarauntId.getText()),cityDropDown.getSelectedItem().toString());
              JOptionPane.showMessageDialog(this, "Restaraunt Created!");
                displayRestaraunts();
            }

        }
        else
        JOptionPane.showMessageDialog(this, "Fill all the details to create a Restaraunt!");
    }//GEN-LAST:event_btnAddCityActionPerformed

     private void displayRestaraunts() 
     {
         editCity.setEnabled(false);
         editRestarauntName.setEnabled(false);
         confirmUpdate.setEnabled(false);
         textRestarauntId.setText("");
         textRestarauntName.setText("");
         cityDropDown.setSelectedItem(null);
         editCity.setSelectedItem(null);
         mngRestarauntTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel tableModel = (DefaultTableModel) mngRestarauntTable.getModel();
        tableModel.setRowCount(0);
        if (currentRestarauntList!=null) {
            for (int i = 0; i < currentRestarauntList.size(); i++) {
                Restaurant res = currentRestarauntList.get(i);
                Object[] tableRow = new Object[10];
                tableRow[0] = res.getRestaurantId();
                tableRow[1]= res.getRestaurantName();
                tableRow[2] = res.getCity();
                tableModel.addRow(tableRow);
            }
        }
         
     }
    
    private void deleteRestarauntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRestarauntActionPerformed
        // TODO add your handling code here:
        int col=0;
        int row=mngRestarauntTable.getSelectedRow();
        int restarauntId= Integer.parseInt(mngRestarauntTable.getModel().getValueAt(row, col).toString()); 

        if (row < 0) {
            JOptionPane.showMessageDialog(this, "You should select atleast 1 row to delete!");
        } else {
            if(eatery.getRestaurantById(restarauntId).getDishes()!=null &&eatery.getRestaurantById(restarauntId).getDishes().size()>0  )
            {
                JOptionPane.showMessageDialog(this, "This restaraunt has some food dishes inside it. Please delete them first, and then delete the restaraunt!");

            }
            else if(eatery.getRestaurantById(restarauntId).getEmployeeList()!=null &&  eatery.getRestaurantById(restarauntId).getEmployeeList().size()>0 )
            {
        JOptionPane.showMessageDialog(this, "This restaraunt has some employees inside it. Please delete them first, and then delete the restaraunt!");         
            }
            
            else
            {
                eatery.removeRestaurant(restarauntId);
                currentRestarauntList=eatery.getAllrestaurants();
                displayRestaraunts();
                JOptionPane.showMessageDialog(this, "City Deleted");
            }

        }
    }//GEN-LAST:event_deleteRestarauntActionPerformed

    private void confirmUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmUpdateActionPerformed
        // TODO add your handling code here:
        int col= 0;
        int row=mngRestarauntTable.getSelectedRow();
        int restarauntId= Integer.parseInt(mngRestarauntTable.getModel().getValueAt(row, col).toString());
        if(!editRestarauntName.getText().equals("") && editCity.getSelectedItem()!=null)
        {
                eatery.updateRestaurant(restarauntId, editRestarauntName.getText(), editCity.getSelectedItem().toString());
                editRestarauntName.setText("");
                editRestarauntName.setEnabled(false);
                editCity.setSelectedItem(null);
                editCity.setEnabled(false);
                editRestarauntName.setEnabled(false);
                displayRestaraunts();
            
        }
        else
        JOptionPane.showMessageDialog(this, "Fill all the details to update City");
    }//GEN-LAST:event_confirmUpdateActionPerformed

    private void textRestarauntNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRestarauntNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRestarauntNameActionPerformed

    private void cityDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityDropDownActionPerformed

    private void editCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editCityActionPerformed

    private void editRestarauntNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editRestarauntNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editRestarauntNameActionPerformed

    private void searchValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchValueActionPerformed

    private void searchValueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchValueKeyPressed
        // TODO add your handling code here:
                search(searchValue.getText());
    }//GEN-LAST:event_searchValueKeyPressed

    private void searchValueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchValueKeyReleased
        // TODO add your handling code here:
          search(searchValue.getText());
    }//GEN-LAST:event_searchValueKeyReleased

       public void search(String str) {
        DefaultTableModel model = (DefaultTableModel) mngRestarauntTable.getModel();
        TableRowSorter<DefaultTableModel> trs =new TableRowSorter<>(model);
        mngRestarauntTable.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
       }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCity;
    private javax.swing.JComboBox<String> cityDropDown;
    private javax.swing.JButton confirmUpdate;
    private javax.swing.JButton deleteRestaraunt;
    private javax.swing.JComboBox<String> editCity;
    private javax.swing.JTextField editRestarauntName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mngRestarauntTable;
    private javax.swing.JTextField searchValue;
    private javax.swing.JTextField textRestarauntId;
    private javax.swing.JTextField textRestarauntName;
    private javax.swing.JButton updateRestaraunt;
    // End of variables declaration//GEN-END:variables
}
