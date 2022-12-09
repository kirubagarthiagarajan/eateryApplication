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

public class Customer {
private int stateId;
private String email;
private String mobile;
private String address;
private String name;
private String password;
private String city;
private ArrayList<Order> pastOrders;
private ArrayList<Order> activeOrders;

public Customer(int stateId, String name, String mobile, String email, String city, String password, String address)
{
    this.stateId=stateId;
    this.name=name;
    this.mobile=mobile;
    this.email=email;
    this.city=city;
    this.password=password;
    this.address=address;
}


    public int getStateId() {
        return stateId;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
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

    public ArrayList<Order> getPastOrders() {
        return pastOrders;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
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

    public ArrayList<Order> getActiveOrders() {
        return activeOrders;
    }

  
}