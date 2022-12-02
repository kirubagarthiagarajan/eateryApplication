/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ktkir
 */
public class Restaraunt {
    private int restarauntId;
    private String restarauntName;
    private String city;
    private int rating;

    public Restaraunt(int restarauntId, String restarauntName,String city)
    {
        this.restarauntId=restarauntId;
        this.restarauntName=restarauntName;
        this.city=city;
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
    private restarauntBillingDepartment billingDepartment;
    private restarauntKitchenManagement kitchen;
    private restarauntOnlineOrderManagement orderManager;
}
