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
    private ArrayList<customer> customerList;

    public void setCustomerList(ArrayList<customer> customerList) {
        this.customerList = customerList;
    }

    public ArrayList<customer> getCustomerList() {
        return customerList;
    }
    public void addNewCustomer()
    {
        customer cust=new customer();
        customerList.add(cust);
        
    }
    public void deleteCustomer(customer cust)
    {
        customerList.remove(cust);
    }
    
}
