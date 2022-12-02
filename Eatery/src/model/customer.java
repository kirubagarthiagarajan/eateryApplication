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
private Order activeOrder;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public void setCity(String city) {
        this.city = city;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

private String coupon;

    public int getCustomerId() {
        return customerId;
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

    public String getCity() {
        return city;
    }

    public String getCoupon() {
        return coupon;
    }
}
