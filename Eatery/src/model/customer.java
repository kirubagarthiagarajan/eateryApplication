/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ktkir
 */

public class Customer {
private int stateId;
private String email;
private int mobile;
private String address;
private String name;
private String password;
private String city;
private List<Order> pastOrders;
private List<Order> activeOrders;
private String deliveryQuery;

public Customer(int stateId, String name, int mobile, String email, String city, String password, String address)
{
    this.stateId=stateId;
    this.name=name;
    this.mobile=mobile;
    this.email=email;
    this.city=city;
    this.password=password;
    this.address=address;
    this.pastOrders = new ArrayList<>();
    this.activeOrders = new ArrayList<>();
}


    public int getStateId() {
        return stateId;
    }

    public String getEmail() {
        return email;
    }

    public int getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getCity() {
        return city;
    }

    public List<Order> getPastOrders() {
        return pastOrders;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPastOrders(ArrayList<Order> pastOrders) {
        this.pastOrders = pastOrders;
    }

    public void setActiveOrders(ArrayList<Order> activeOrder) {
        this.activeOrders = activeOrder;
    }

    public List<Order> getActiveOrders() {
        return activeOrders;
    }


    public boolean checkIfOrderPlacedByCustomer(Order order) {
     return this.activeOrders.contains(order);
      
    }

    void addToPastOrders(Order order) {
        this.pastOrders.add(order);
     }

  
}
