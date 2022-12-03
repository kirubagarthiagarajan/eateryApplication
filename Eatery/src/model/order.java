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
public class Order {
    private int orderId;
    private int restarauntId;
    private int customerId;
    private int deliveryPersonId;
    private String status;
    private String devlieryAddress;
    private String deliveryInstructions;
    private int totalPrice;
    private String coupon;
      private ArrayList<food> orderedFoodList;
      
      public Order(int orderId, int customerId, int restarauntId, String status, String devlieryAddress, String deliveryInstructions,int totalPrice,String coupon,ArrayList<food>foodList)
      {
          this.orderId=orderId;
          this.customerId=customerId;
          this.status=status;
          this.devlieryAddress=devlieryAddress;
          this.deliveryInstructions=deliveryInstructions;
          this.totalPrice=totalPrice;
          this.coupon=coupon;
          this.orderedFoodList=foodList;
          this.restarauntId=restarauntId;
      }

    public int getOrderId() {
        return orderId;
    }

    public int getRestarauntId() {
        return restarauntId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getDeliveryPersonId() {
        return deliveryPersonId;
    }

    public String getStatus() {
        return status;
    }

    public String getDeliveryInstructions() {
        return deliveryInstructions;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public String getCoupon() {
        return coupon;
    }

    public ArrayList<food> getOrderedFoodList() {
        return orderedFoodList;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setRestarauntId(int restarauntId) {
        this.restarauntId = restarauntId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setDeliveryPersonId(int deliveryPersonId) {
        this.deliveryPersonId = deliveryPersonId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDeliveryInstructions(String deliveryInstructions) {
        this.deliveryInstructions = deliveryInstructions;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public void setOrderedFoodList(ArrayList<food> orderedFoodList) {
        this.orderedFoodList = orderedFoodList;
    }
    
  
}
