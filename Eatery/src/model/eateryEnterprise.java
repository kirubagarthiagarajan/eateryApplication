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


public class eateryEnterprise {
    private eateryCustomerManagement eatCusManage;
    private restarauntManagement restarauntManagement;
    private deliveryPartnerEnterprise deliveryEnterPrise;
    private orderDirectory orderList;
   
  public eateryEnterprise(eateryCustomerManagement eatCusManage,restarauntManagement restarauntManagement,deliveryPartnerEnterprise deliveryEnterPrise,orderDirectory orderList){
      this.eatCusManage=eatCusManage;
      this.restarauntManagement=restarauntManagement;
      this.deliveryEnterPrise=deliveryEnterPrise;
      this.restarauntManagement=new restarauntManagement();
      this.orderList=orderList;
  }
  
  public void addCustomer(int stateId, String name, int mobile, String email, String city, String password, String address)
  {
      Customer cust= new Customer(stateId, name, mobile, email, city, password, address);
      this.eatCusManage.addNewCustomer(cust);
  }
  
  public Customer customerLogin(int stateId, String password)
  {
   return this.eatCusManage.loginCustomer(stateId, password);
  }
  
   public ArrayList<Restaraunt> getRestarauntByCity(String cityName)     
    {
        ArrayList<Restaraunt> restarauntListForCity=new ArrayList<>();
        
        for (Restaraunt res : this.restarauntManagement.getRestarauntDirectory() )  
        {
            if(res.getCity()==cityName);
            restarauntListForCity.add(res);
        }
        
        return restarauntListForCity;
    }
   
    public void addFoodToRestaraunt(String foodName,int price,int restarauntId,int foodId)
    {
        food f= new food(foodName, price, restarauntId, foodId);
        this.restarauntManagement.addFoodToRestaraunt(f, restarauntId);
    }
    
    public void placeOrder(Order order)
    {
        this.orderList.addOrder(order);
//       boolean  this.restarauntManagement.checkIfRestaurantAcceptsOrder()
        this.restarauntManagement.assingOrdertoRestaraunt(order,order.getRestarauntId());
    }
    
    public void cancelOrder(Order order)
    {
        this.orderList.removeOrder(order.getOrderId());
        this.restarauntManagement.removeOrderFromRestaraunt(order.getOrderId(),order.getRestarauntId());
    }
   
    
//    private int stateId;
//private String email;
//private int mobile;
//private String address;
//private String name;
//private String password;
//private String city;
    
     public void addDeliveryPerson(int stateId, String email, int mobile, String address, String name, String password, String city)
  {
      DeliveryPerson delPer= new DeliveryPerson(stateId,email,mobile, address, name,password,city);
      this.deliveryEnterPrise.addDeliveryPerson(delPer);
  }
     
     public DeliveryPerson deliveryPersonLogin(int stateId, String password)
     {
         return this.deliveryEnterPrise.loginDeliveryPerson(stateId, password);
     }
  
 
}
