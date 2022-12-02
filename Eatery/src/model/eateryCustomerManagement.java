/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ktkir
 */

public class eateryCustomerManagement {
  private ArrayList<Customer> customerDirectory;  
  
  public eateryCustomerManagement(){
      
      this.customerDirectory=new ArrayList<Customer>();
  }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
  

    public void addNewCustomer()
    {
        Customer cust=new Customer();
        customerDirectory.add(cust);
        
    }
    public void deleteCustomer(Customer cust)
    {
        customerDirectory.remove(cust);
    }
    

}
