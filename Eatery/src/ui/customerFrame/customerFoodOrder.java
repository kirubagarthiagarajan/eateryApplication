/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.customerFrame;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.Customer;
import model.Employee;
import model.Order;
import model.Restaurant;
import model.EateryEnterprise;
import model.Food;
import model.OrderStatus;

/**
 *
 * @author ktkir
 */
public class customerFoodOrder extends javax.swing.JPanel {

    /**
     * Creates new form customerFoodOrder
     */
    
    EateryEnterprise eatery;
    List<Restaurant> currentRestaruntList;
    List<Food> currentFoodList;
    Customer currentCustomer;
    ArrayList<Food> orderFoodList;
    int currentRestarautId;
    int orderTotalprice;

    public customerFoodOrder(EateryEnterprise eatery, Customer currentCustomer) {
        initComponents();
        this.eatery=eatery;
        this.currentRestaruntList=new ArrayList<>();
        this.currentFoodList=new ArrayList<>();
        this.orderFoodList=new ArrayList<>();
        this.currentCustomer=currentCustomer;
        cityDropDown.setSelectedItem(null);
        quantity.setText("");
        labelConfirmAddress.setVisible(false);
        textConfirmAddress.setVisible(false);
        confirmOrder.setVisible(false);
        couponsDropdown.setSelectedItem(null);
        
        btnpdf.setVisible(false);
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
        cityDropDown = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        restarauntsTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        foodTable = new javax.swing.JTable();
        chooseRestaraunt = new javax.swing.JButton();
        addToCart = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        placeOrder = new javax.swing.JButton();
        labelConfirmAddress = new javax.swing.JLabel();
        confirmOrder = new javax.swing.JButton();
        quantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textOrderTotal = new javax.swing.JTextField();
        textDeliveryInstructions = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        couponsDropdown = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        textConfirmAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnpdf = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Choose City");

        cityDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOSTON", "NEW YORK", "VIRGINIA", "NEW JERSEY", "BUFFALO" }));
        cityDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityDropDownActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Restaraunts in your City");

        restarauntsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Restaraunt Id", "Restaraunt Name", "City"
            }
        ));
        jScrollPane1.setViewportView(restarauntsTable);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Your cart");

        foodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Food Id", "Food Name", "Food Price"
            }
        ));
        jScrollPane2.setViewportView(foodTable);

        chooseRestaraunt.setText("Choose Restaraunt");
        chooseRestaraunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseRestarauntActionPerformed(evt);
            }
        });

        addToCart.setText("Add to Cart");
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Choose your order");

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Food Name", "Food Price", "Quantity"
            }
        ));
        jScrollPane3.setViewportView(orderTable);

        placeOrder.setText("Checkout");
        placeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderActionPerformed(evt);
            }
        });

        labelConfirmAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelConfirmAddress.setText("Address in selected City");

        confirmOrder.setText("Confirm and Place Order");
        confirmOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmOrderActionPerformed(evt);
            }
        });

        jLabel6.setText("Quantity");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Order Total ($):");

        jLabel5.setText("Delivery Instructions");

        couponsDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "50OFF", "25OFF" }));

        jLabel8.setText("Coupons");

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ORDER YOUR FOOD");

        btnpdf.setText("GENERATE PDF");
        btnpdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cityDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(chooseRestaraunt)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(couponsDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textDeliveryInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(placeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(186, 186, 186)
                                        .addComponent(btnpdf))))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textOrderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(confirmOrder))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelConfirmAddress)
                                .addGap(18, 18, 18)
                                .addComponent(textConfirmAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 724, Short.MAX_VALUE))
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(chooseRestaraunt))
                    .addComponent(addToCart))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textDeliveryInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(couponsDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(placeOrder)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textOrderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(confirmOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelConfirmAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textConfirmAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnpdf)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed
        // TODO add your handling code here:
//          JOptionPane.showMessageDialog(this, "in addTocart!");

        int row=foodTable.getSelectedRow();
        int col=0;
        
           if (row < 0) {
            JOptionPane.showMessageDialog(this, "You should select atleast 1 row to update!");
        } else {
               int foodId= Integer.parseInt(foodTable.getModel().getValueAt(row, col).toString());
        Food foo= eatery.getFoodById(foodId);
        System.out.print(foodId);
        if(quantity.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter the quantity of the selected food item, to add it toi your cart!");
        }
        
         if(!quantity.getText().matches("[0-9]+"))
        {
            JOptionPane.showMessageDialog(this, "The quantity should be a number!");
        }
        else if(!quantity.getText().equals(""))
        {
              changefoodQuantity(foo,Integer.parseInt(quantity.getText()));
              populateOrderTable();
        }
           }
        
        
        
    }//GEN-LAST:event_addToCartActionPerformed

    public void changefoodQuantity(Food f,int quantity)
    {   
        
        
        for(Food food : this.orderFoodList)
        {
            if(food.getFoodId()==f.getFoodId())
            {
                food.setQuantity(quantity);
                return;
            }
        }
        f.setQuantity(quantity);
        this.orderFoodList.add(f);
        
    }
 
     private void displayRestarauntTable() 
     {
        restarauntsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel tableModel = (DefaultTableModel) restarauntsTable.getModel();
        tableModel.setRowCount(0);
        if (currentRestaruntList!=null) {
            for (int i = 0; i < currentRestaruntList.size(); i++) {
                Restaurant res = currentRestaruntList.get(i);
                Object[] tableRow = new Object[10];
                tableRow[0] =res.getRestaurantId();
                tableRow[1] =res.getRestaurantName();
                tableRow[2]= res.getCity();
                tableModel.addRow(tableRow);
            }
        }
         
     }
    
     
     public void populateOrderTable(){
             orderTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel tableModel = (DefaultTableModel) orderTable.getModel();
        tableModel.setRowCount(0);
        if (orderFoodList!=null) {
            for (int i = 0; i < orderFoodList.size(); i++) {
                Food Food = orderFoodList.get(i);
                Object[] tableRow = new Object[10];
                tableRow[0] =Food.getName();
                tableRow[1]= Food.getPrice();
                tableRow[2]= Food.getQuantity();
                tableModel.addRow(tableRow);
            }
        }
     }
    
    private void cityDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityDropDownActionPerformed
        // TODO add your handling code here:
        if(cityDropDown.getSelectedItem()!=null)
        {
           currentRestaruntList= eatery.getRestaurantByCity(cityDropDown.getSelectedItem().toString());
        displayRestarauntTable();  
        }
       
    }//GEN-LAST:event_cityDropDownActionPerformed

    private void chooseRestarauntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseRestarauntActionPerformed
        // TODO add your handling code here:
                                            
        int col= 0;
        int row=restarauntsTable.getSelectedRow();
        int restarauntId= Integer.parseInt(restarauntsTable.getModel().getValueAt(row, col).toString());
        currentRestarautId=restarauntId;
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "You should select atleast 1 row to update!");
        } else {
         this.currentFoodList=eatery.getFoodListByRestaurant(restarauntId);
         populateFoodTable();
        }
    }//GEN-LAST:event_chooseRestarauntActionPerformed

    private void placeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderActionPerformed
        // TODO add your handling code here:
        int price=0;
        for(Food f : orderFoodList)
        {
            price+=(f.getPrice()* f.getQuantity());
        }

        if(couponsDropdown.getSelectedItem()!=null)
        {
            if(couponsDropdown.getSelectedItem().toString()=="50OFF")
            {
                price=price/2;
            }
            else if(couponsDropdown.getSelectedItem().toString()=="25OFF")
            {
                price=(int) ((int)price*0.75);
            }
        }
        orderTotalprice=price;
        textOrderTotal.setText(String.valueOf(orderTotalprice));
        if(!currentCustomer.getCity().equals(cityDropDown.getSelectedItem().toString()))
        {
            JOptionPane.showMessageDialog(this, "The chosen City, does not match with your registered city. Please enter an alternate address in the chosen city!");
            labelConfirmAddress.setVisible(true);
            textConfirmAddress.setVisible(true);
            confirmOrder.setVisible(true);
            placeOrder.setEnabled(false);
        }
        else
        {
            if(!textDeliveryInstructions.getText().equals(""))
            {
                placeOrder(currentCustomer.getAddress());
                JOptionPane.showMessageDialog(this, "Order placed with restaraunt!");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Please enter the delivery instructions, to palce your order!");
            }

        }

    }//GEN-LAST:event_placeOrderActionPerformed

    private void confirmOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmOrderActionPerformed
        // TODO add your handling code here:

        if(textConfirmAddress.getText().equals("") || textDeliveryInstructions.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter the delivery instructions, and alternate address to place your order!");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Order Placed in restaraunt!");
            placeOrder(textConfirmAddress.getText().toString());
        }
        
        btnpdf.setVisible(true);
        
    }//GEN-LAST:event_confirmOrderActionPerformed

    private void btnpdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpdfActionPerformed
        // TODO add your handling code here:
        String path="";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x=j.showSaveDialog(this);
        
        if(x==JFileChooser.APPROVE_OPTION)
        {
            path=j.getSelectedFile().getPath();
            
        }
        
        Document doc = new Document();
        
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"order123.pdf"));
            
            doc.open();
            
            
             PdfPTable tb1 = new PdfPTable(3);
             PdfPTable tb2 = new PdfPTable(2);
              PdfPTable tb3 = new PdfPTable(2);
              
             tb1.setSpacingAfter(10f);
              tb2.setSpacingAfter(10f);
              tb3.setSpacingAfter(10f);
              
             tb1.addCell("Food Name");
            tb1.addCell("Food Price");
            tb1.addCell("Quantity");
            
            tb3.addCell("Offer Applied");
            if(couponsDropdown.getSelectedItem()==null)
            {
                 tb3.addCell("No Coupons applied!");
            }else 
            {
                tb3.addCell(couponsDropdown.getSelectedItem().toString());
            }
            
              tb2.addCell("Total Amount");
            tb2.addCell(textOrderTotal.getText());
            //tb2.addCell("");
          
           // tb2.addCell(image);
            for(int i=0;i<orderTable.getRowCount();i++)
            {
                String Foodname = orderTable.getValueAt(i,0).toString();
                String Foodprice = orderTable.getValueAt(i,1).toString();
                String Quantity = orderTable.getValueAt(i,2).toString();
                
                tb1.addCell(Foodname);
                tb1.addCell(Foodprice);
                tb1.addCell(Quantity);
                
                
            }
            doc.add(tb1);
            doc.add(tb3);
            doc.add(tb2);
            
            
            
            //  tb2.addCell("Bill");
          
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(customerFoodOrder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(customerFoodOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           
        
           
            doc.close();
    }//GEN-LAST:event_btnpdfActionPerformed
public void placeOrder(String deliveryAddress){
    Random random = new Random();
        int randomOrderId = random.nextInt(900) + 100;
        String status="Ordered";
        String delAddress=deliveryAddress;
        String instructions=textDeliveryInstructions.getText();

    Order ord= new Order(randomOrderId,currentCustomer.getStateId(),currentRestarautId,OrderStatus.ORDER_PLACED,delAddress,instructions,orderTotalprice,orderFoodList,cityDropDown.getSelectedItem().toString(),false,null,-1);  
    
    if(eatery.checkIfRestaurantAcceptsOrder(currentRestarautId)){
         JOptionPane.showMessageDialog(this, "Your total order price is $"+orderTotalprice +"!");
         eatery.placeOrder(ord); 
         
         //PDF CODE
         
         btnpdf.setVisible(true);
         
         
         //CODE DONE
         
         
         
    }
    else
    {
        JOptionPane.showMessageDialog(this, "This restaraunt is not accepting orders right now. Please choose a different restaraunt!");
    }
  
}
    
    public void populateFoodTable(){
     foodTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel tableModel = (DefaultTableModel) foodTable.getModel();
        tableModel.setRowCount(0);
        if (currentFoodList!=null) {
            for (int i = 0; i < currentFoodList.size(); i++) {
                Food foo = currentFoodList.get(i);
                Object[] tableRow = new Object[10];
                tableRow[0] = foo.getFoodId();
                tableRow[1] = foo.getName();
                tableRow[2]= foo.getPrice();
                tableModel.addRow(tableRow);
            }
        }
        
         
    }
    public void displayRestaraunts(){
                  restarauntsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel tableModel = (DefaultTableModel) restarauntsTable.getModel();
        tableModel.setRowCount(0);
        if (currentRestaruntList!=null) {
            for (int i = 0; i < currentRestaruntList.size(); i++) {
                Restaurant res = currentRestaruntList.get(i);
                Object[] tableRow = new Object[10];
                tableRow[1] =res.getRestaurantName();
                tableRow[2]= res.getCity();
                tableModel.addRow(tableRow);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCart;
    private javax.swing.JButton btnpdf;
    private javax.swing.JButton chooseRestaraunt;
    private javax.swing.JComboBox<String> cityDropDown;
    private javax.swing.JButton confirmOrder;
    private javax.swing.JComboBox<String> couponsDropdown;
    private javax.swing.JTable foodTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelConfirmAddress;
    private javax.swing.JTable orderTable;
    private javax.swing.JButton placeOrder;
    private javax.swing.JTextField quantity;
    private javax.swing.JTable restarauntsTable;
    private javax.swing.JTextField textConfirmAddress;
    private javax.swing.JTextField textDeliveryInstructions;
    private javax.swing.JTextField textOrderTotal;
    // End of variables declaration//GEN-END:variables
}
