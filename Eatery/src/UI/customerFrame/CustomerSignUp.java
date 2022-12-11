/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.customerFrame;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.SQLConnection.SQLConnection;
import model.EateryEnterprise;
import java.util.Properties;
import javax.mail.PasswordAuthentication;
import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Session;
import javax.mail.Transport;
import java.lang.Math;   
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author BARATHI
 */
public class CustomerSignUp extends javax.swing.JPanel {

    /**
     * Creates new form CustomerSignUp
     */
    EateryEnterprise eatery;
    int randomNumber;
    public CustomerSignUp(EateryEnterprise eatery) {
        initComponents();
        this.eatery=eatery;
          btnSignup.setVisible(false);
          tfvemail.setVisible(false);
          lbvemail.setVisible(false);
           btnverify.setVisible(false);
           txtCity.setSelectedItem(null);
           randomNumber=ThreadLocalRandom.current().nextInt(1000, 9998 + 1);
           
           
           
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtName = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtStateId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtCpassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        btnSignup = new javax.swing.JButton();
        txtCity = new javax.swing.JComboBox<>();
        btncemail = new javax.swing.JButton();
        lbvemail = new javax.swing.JLabel();
        tfvemail = new javax.swing.JTextField();
        btnverify = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setText("Name");

        jLabel2.setText("Contact Number");

        jLabel3.setText("E-Mail");

        jLabel4.setText("City");

        jLabel5.setText("Customer Id");

        jLabel6.setText("Address");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jLabel7.setText("Password");

        jLabel8.setText("Confirm Password");

        btnSignup.setText("Sign Up");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        txtCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOSTON", "NEW YORK", "VIRGINIA", "NEW JERSEY", "BUFFALO" }));

        btncemail.setText("CONFIRM DETAILS");
        btncemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncemailActionPerformed(evt);
            }
        });

        lbvemail.setText("VERIFY EMAIL");

        btnverify.setText("VERIFY EMAIL");
        btnverify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverifyActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CUSTOMER SIGNUP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(478, 478, 478)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(lbvemail))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfvemail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCpassword, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStateId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addComponent(btnverify))
                            .addComponent(btncemail)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btnSignup)))
                .addContainerGap(650, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtStateId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btncemail)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbvemail)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfvemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnverify)))
                .addGap(38, 38, 38)
                .addComponent(btnSignup)
                .addContainerGap(198, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        
     
        eatery.addCustomer(Integer.parseInt(txtStateId.getText()), txtName.getText(), txtNumber.getText(), txtEmail.getText(), txtCity.getSelectedItem().toString(), txtPassword.getText(), txtAddress.getText());
       
        JOptionPane.showMessageDialog(this, "Customer Signed up Sucessfully! Welcome "+txtName.getText()+"!", "Sign Up Sucess", HEIGHT);
        txtName.setText("");
         txtNumber.setText("");
        txtEmail.setText("");
        txtCity.setSelectedItem(null);
        txtAddress.setText("");
        
        txtStateId.setText("");
           txtPassword.setText("");
        txtCpassword.setText("");
        txtAddress.setText("");
        tfvemail.setText("");
        tfvemail.setText("");
        tfvemail.setVisible(false);
         lbvemail.setVisible(false);
          btnSignup.setVisible(false);
          btnverify.setVisible(false);  
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btncemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncemailActionPerformed
        // TODO add your handling code here:
 
        
         String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        
        if(!txtName.getText().equals("") && !txtEmail.getText().equals("") && !txtAddress.getText().equals("") && !txtNumber.getText().equals("") && !txtPassword.getText().equals(""))
        {
        if(!txtStateId.getText().matches("[1-9]{1}[0-9]+"))
        {
            JOptionPane.showMessageDialog(this, "Customer Id should Number", "Customer Id", HEIGHT);
      
        }
        
         if(!eatery.isCustomerIdUnique(Integer.parseInt(txtStateId.getText())))
        {
           JOptionPane.showMessageDialog(this, "Customer Id should be unique", "Customer Id", HEIGHT);

        }
         if(!txtPassword.getText().equals(txtCpassword.getText()))
        {
             JOptionPane.showMessageDialog(this, "Password doesn't match", "Password Error", HEIGHT);

        }
         if(!txtName.getText().matches("^[a-zA-Z]+ [a-zA-Z]+$"))
        {
            JOptionPane.showMessageDialog(this, "Enter a Valid Full Name", "Invalid Name", HEIGHT);

        }
         if(!txtNumber.getText().matches("^(1\\s?)?(\\d{3}|\\(\\d{3}\\))[\\s\\-]?\\d{3}[\\s\\-]?\\d{4}$"))
        {
            JOptionPane.showMessageDialog(this, "Enter a Valid Phone Number", "Invalid Phone Number", HEIGHT);

        }
         if(!txtEmail.getText().matches(regexPattern))
        {
            JOptionPane.showMessageDialog(this, "Enter a Valid Email", "Invalid Email", HEIGHT);

        }
         if(txtStateId.getText().matches("[1-9]{1}[0-9]+") && eatery.isCustomerIdUnique(Integer.parseInt(txtStateId.getText())) && txtPassword.getText().equals(txtCpassword.getText()) && txtName.getText().matches("^[a-zA-Z]+ [a-zA-Z]+$") && txtNumber.getText().matches("^(1\\s?)?(\\d{3}|\\(\\d{3}\\))[\\s\\-]?\\d{3}[\\s\\-]?\\d{4}$") && txtEmail.getText().matches(regexPattern))
        {
        
        tfvemail.setVisible(true);
         lbvemail.setVisible(true);
          btnSignup.setVisible(false);
          btnverify.setVisible(true);     
        String ToEmail = txtEmail.getText();
        String FromEmail = "vaithyannhk@gmail.com";//studyviral2@gmail.com
        String FromEmailPassword = "cvciuvsihnrlpdeg";//You email Password from you want to send email

       
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        properties.put("mail.smtp.starttls.required", "true");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
        properties.put("mail.debug", "true");
       
       
           
       
       Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(FromEmail, FromEmailPassword);
            }
     
        });
       try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(FromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(ToEmail));
            message.setSubject("Eatery Customer E-mail Verfication!");
           
            message.setText("\n" +"Thank You for considering Eatery, as your go to food delivery up. To continue to Sign up to our app, please use this passcode to verify you E-mail."+"\n"+"Passcode: "+randomNumber);
            Transport.send(message);
    
                JOptionPane.showMessageDialog(this, "Verification code sent to your E-mail! Please enter it to Sign up!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
       
        }        
        }
        else
        {
             JOptionPane.showMessageDialog(this, "Enter all fields", "Fields", HEIGHT);
        }
    }//GEN-LAST:event_btncemailActionPerformed

    private void btnverifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverifyActionPerformed
        // TODO add your handling code here:
         int c=Integer.parseInt(tfvemail.getText());
             if(randomNumber == c)
              {                  
                  JOptionPane.showMessageDialog(this, "Email verified Successfully");           
                   btnSignup.setVisible(true);
              }
             else
              {
                  JOptionPane.showMessageDialog(this, "Please enter the correct verification code sent in mail!");
              }
        
        
    }//GEN-LAST:event_btnverifyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignup;
    private javax.swing.JButton btncemail;
    private javax.swing.JButton btnverify;
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
    private javax.swing.JLabel lbvemail;
    private javax.swing.JTextField tfvemail;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JComboBox<String> txtCity;
    private javax.swing.JPasswordField txtCpassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtStateId;
    // End of variables declaration//GEN-END:variables
}
