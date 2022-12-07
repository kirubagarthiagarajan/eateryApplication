/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ktkir
 */
public class food {
    private int foodId;
    private String name;
    private int price;
    private int restarauntId;
    private int quantity;

 

    
    public food(String foodName,int price,int restarauntId,int foodId){
        this.name=foodName;
        this.price=price;
        this.restarauntId=restarauntId;
        this.foodId=foodId;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setRestarauntId(int restarauntId) {
        this.restarauntId = restarauntId;
    }

    public int getRestarauntId() {
        return restarauntId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    
       public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
