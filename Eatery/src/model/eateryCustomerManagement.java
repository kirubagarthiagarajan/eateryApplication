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
      populateCustomerFromDb();
  }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    //get customer from db
    public void populateCustomerFromDb()
    {
        
    }
    
     //replace db
    public void replaceCustomerDb(){
        
    }
  

    public void addNewCustomer(Customer cust)
    {
 
        customerDirectory.add(cust);

    }
    public void deleteCustomer(Customer cust)
    {
        customerDirectory.remove(cust);
    }
    
    public Customer loginCustomer(int stateID, String password){
        for(Customer cus:this.customerDirectory)
        {
            if(cus.getStateId()==stateID && cus.getPassword().equals(password))
            {
                return cus;
            }
        }
        return null;
    }
    

}
