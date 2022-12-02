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
public class order {
    private int orderId;
    private int restarauntId;
    private int customerId;
    private int deliveryPersonId;
    private ArrayList<food> foodList;
    private String status;
    private String deliveryInstructions;
    private int totalPrice;
    private String coupon;
}
