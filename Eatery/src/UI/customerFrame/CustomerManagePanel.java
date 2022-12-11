/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.customerFrame;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Customer;
import model.Employee;
import model.EateryEnterprise;
import model.Food;

/**
 *
 * @author BARATHI
 */
public class CustomerManagePanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerManagePanel
     */
    EateryEnterprise eatery;
    List<Customer> custList;
    public CustomerManagePanel(EateryEnterprise eatery) {
        initComponents();
        this.eatery=eatery;
        this.custList=eatery.getCustomerList();
        displayCustomerTable();
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtStateId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtCpassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtCity = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        searchValue = new javax.swing.JTextField();
        btnUpdateCustomer = new javax.swing.JButton();
        btnDeleteCustomer = new javax.swing.JButton();
        txtCustomerName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        txtNumber1 = new javax.swing.JTextField();
        txtEmail1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAddress1 = new javax.swing.JTextArea();
        txtCity1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("Contact Number");

        jLabel10.setText("Password");

        jLabel3.setText("E-Mail");

        jLabel4.setText("City");

        jLabel5.setText("Customer Id");

        jLabel11.setText("Confirm Password");

        jLabel6.setText("Address");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane2.setViewportView(txtAddress);

        txtCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose City", "BOSTON", "NEW YORK", "VIRGINIA", "NEW JERSEY", "BUFFALO" }));

        setBackground(new java.awt.Color(0, 153, 204));

        tblCustomer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Id", "Customer Name", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

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

        btnUpdateCustomer.setBackground(new java.awt.Color(102, 102, 102));
        btnUpdateCustomer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdateCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow.png"))); // NOI18N
        btnUpdateCustomer.setText("Update Customer");
        btnUpdateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCustomerActionPerformed(evt);
            }
        });

        btnDeleteCustomer.setBackground(new java.awt.Color(102, 102, 102));
        btnDeleteCustomer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDeleteCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove-friend.png"))); // NOI18N
        btnDeleteCustomer.setText("Delete Customer");
        btnDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustomerActionPerformed(evt);
            }
        });

        txtCustomerName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerNameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Customer Name");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Search");

        btnConfirm.setBackground(new java.awt.Color(102, 102, 102));
        btnConfirm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow.png"))); // NOI18N
        btnConfirm.setText("Confirm Update");
        btnConfirm.setEnabled(false);
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Contact Number");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("E-Mail");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("City");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Address");

        txtAddress1.setColumns(20);
        txtAddress1.setRows(5);
        jScrollPane3.setViewportView(txtAddress1);

        txtCity1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose City", "BOSTON", "NEW YORK", "VIRGINIA", "NEW JERSEY", "BUFFALO" }));

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE CUSTOMERS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(583, 583, 583)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchValue, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDeleteCustomer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdateCustomer))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18)
                                .addComponent(jLabel12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(jLabel8))
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(txtNumber1)
                                .addComponent(txtEmail1)
                                .addComponent(txtCity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnConfirm)))))
                .addContainerGap(651, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(searchValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDeleteCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(txtCity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnUpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCustomerActionPerformed
        int col= 0;
        int row=tblCustomer.getSelectedRow();
        int CustomerId= Integer.parseInt(tblCustomer.getModel().getValueAt(row, col).toString());

        if (row < 0) {
            JOptionPane.showMessageDialog(this, "You should select atleast 1 row to update!");
        } else {
            txtCustomerName.setEnabled(true);
            txtNumber1.setEnabled(true);
            txtEmail1.setEnabled(true);
            txtAddress1.setEnabled(true);
            txtCity1.setEnabled(true);
            btnConfirm.setEnabled(true);
            Customer c=eatery.getCustomerById(CustomerId);
            txtCustomerName.setText(c.getName());
            txtNumber1.setText(String.valueOf(c.getMobile()));
            txtEmail1.setText(c.getEmail());
            txtAddress1.setText(c.getAddress());
            txtCity1.setSelectedItem(c.getCity());
            
        }
    }//GEN-LAST:event_btnUpdateCustomerActionPerformed
    public void search(String str) {
        DefaultTableModel model = (DefaultTableModel) tblCustomer.getModel();
        TableRowSorter<DefaultTableModel> trs =new TableRowSorter<>(model);
        tblCustomer.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
       }
    private void btnDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCustomerActionPerformed
        // TODO add your handling code here:
        int res=JOptionPane.showConfirmDialog(this, "Do you want to delete this Customer?", "Confirm" , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (res==JOptionPane.YES_OPTION)
        {
        int col=0;
        int row=tblCustomer.getSelectedRow();
        int CustomerId= Integer.parseInt(tblCustomer.getModel().getValueAt(row, col).toString());
         Customer c= eatery.getCustomerById(CustomerId);
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "You should select atleast 1 row to delete!");
        }
        else
        {
            eatery.removeCustomer(c);
            custList=eatery.getCustomerList();
            displayCustomerTable();
            
            JOptionPane.showMessageDialog(this, "Customer Deleted");
        }
        }

    }//GEN-LAST:event_btnDeleteCustomerActionPerformed

    private void txtCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerNameActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        int col= 0;
        int row=tblCustomer.getSelectedRow();
        int CustomerId= Integer.parseInt(tblCustomer.getModel().getValueAt(row, col).toString());
        if(!txtCustomerName.getText().equals(""))
        {
            Customer c=eatery.getCustomerById(CustomerId);
            eatery.updateCustomer(c.getStateId(), txtCustomerName.getText(), txtNumber1.getText(),txtEmail1.getText(), String.valueOf(txtCity1.getSelectedItem()), c.getPassword(), txtAddress1.getText());
            //eatery.updatefood(currentRestarauntId,foodId,txtCustomerName.getText(), Integer.parseInt(editFoodPrice.getText()));
            //            eatery.updateRestaraunt(restarauntId, editRestarauntName.getText(), editCity.getSelectedItem().toString());
            txtCustomerName.setText("");
            txtCustomerName.setEnabled(false);
            txtEmail1.setText("");
            txtEmail1.setEnabled(false);
            txtCity1.setSelectedItem(null);
            txtCity1.setEnabled(false);
            txtAddress1.setEnabled(false);
            txtAddress1.setText("");
            txtNumber1.setText("");
            txtNumber1.setEnabled(false);
            
            displayCustomerTable();

        }
        else
        JOptionPane.showMessageDialog(this, "Fill all the details to update Food");
    }//GEN-LAST:event_btnConfirmActionPerformed
    private void displayCustomerTable() 
     {
         txtCustomerName.setEnabled(false);
         txtEmail1.setEnabled(false);
         txtNumber1.setEnabled(false);
         txtAddress1.setEnabled(false);
         tblCustomer.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel tableModel = (DefaultTableModel) tblCustomer.getModel();
        tableModel.setRowCount(0);
        if (custList!=null) {
            for (int i = 0; i < custList.size(); i++) {
                Customer c = custList.get(i);
                Object[] tableRow = new Object[10];
                tableRow[0] = c.getStateId();
                tableRow[1]= c.getName();
                tableRow[2] = c.getCity();
                tableModel.addRow(tableRow);
            }
        }
         
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDeleteCustomer;
    private javax.swing.JButton btnUpdateCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField searchValue;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextArea txtAddress1;
    private javax.swing.JComboBox<String> txtCity;
    private javax.swing.JComboBox<String> txtCity1;
    private javax.swing.JPasswordField txtCpassword;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtNumber1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtStateId;
    // End of variables declaration//GEN-END:variables
}