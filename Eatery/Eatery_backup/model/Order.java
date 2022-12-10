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
    private int restaurantId;
    private int customerId;
    private int deliveryPersonId;
    private OrderStatus status;
    private String devlieryAddress;
    private String city;
    private String deliveryInstructions;
    private int totalPrice;
      private ArrayList<Food> orderedFoodList;
      
      public Order(int orderId, int customerId, int restaurantId, OrderStatus status, String devlieryAddress, String deliveryInstructions,int totalPrice,ArrayList<Food>foodList, String city)
      {
          this.orderId=orderId;
          this.customerId=customerId;
          this.status=status;
          this.devlieryAddress=devlieryAddress;
          this.deliveryInstructions=deliveryInstructions;
          this.totalPrice=totalPrice;
          this.orderedFoodList=foodList;
          this.restaurantId=restaurantId;
          this.city=city;
      }

    public int getOrderId() {
        return orderId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getDeliveryPersonId() {
        return deliveryPersonId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public String getDeliveryInstructions() {
        return deliveryInstructions;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

 

    public ArrayList<Food> getOrderedFoodList() {
        return orderedFoodList;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setDeliveryPersonId(int deliveryPersonId) {
        this.deliveryPersonId = deliveryPersonId;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setDeliveryInstructions(String deliveryInstructions) {
        this.deliveryInstructions = deliveryInstructions;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }


    public void setOrderedFoodList(ArrayList<Food> orderedFoodList) {
        this.orderedFoodList = orderedFoodList;
    }

    public String getCity() {
      return this.city;
    }
    
  
}
