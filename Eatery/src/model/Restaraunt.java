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
public class Restaraunt {
    private int restarauntId;
    private String restarauntName;
    private String city;
    private int rating;
    private ArrayList<food> dishes;
    private ArrayList<Order> currentOrders;
    private restarauntBillingDepartment billingDepartment;
    private restarauntKitchenManagement kitchen;
    private restarauntOnlineOrderManagement orderManager;

    public void addToCurrentOrders(Order order) {
        this.currentOrders.add(order);
    }
      public void removeFromCurrentOrders(int orderId) {
       for(Order order :this.currentOrders) {
        if(order.getOrderId()==orderId) {
        this.currentOrders.remove(order);
        return;
      }
    }
    }

    public ArrayList<food> getDishes() {
        return dishes;
    }

    public ArrayList<Order> getCurrentOrders() {
        return currentOrders;
    }

    public void addToDishes(food Food){
        this.dishes.add(Food);
    }
    public void setDishes(ArrayList<food> dishes) {
        this.dishes = dishes;
    }

    public Restaraunt(int restarauntId, String restarauntName,String city)
    {
        
        this.restarauntId=restarauntId;
        this.restarauntName=restarauntName;
        this.city=city;
    }
   
    public void populateFoodForRestaraunt(){
        
    }
    public void setRestarauntName(String restarauntName) {
        this.restarauntName = restarauntName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getRestarauntName() {
        return restarauntName;
    }

    public void setRestarauntId(int restarauntId) {
        this.restarauntId = restarauntId;
    }

    public int getRestarauntId() {
        return restarauntId;
    }

    public String getCity() {
        return city;
    }

    public int getRating() {
        return rating;
    }
    
}
