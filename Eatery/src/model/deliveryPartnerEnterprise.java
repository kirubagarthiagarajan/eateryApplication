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

public class DeliveryPartnerEnterprise {
private DeliveryPersonManagement deliveryPersonManagement; 
//private orderHandlingDepartment 
public DeliveryPartnerEnterprise()
{
    this.deliveryPersonManagement=new DeliveryPersonManagement();
}


public void addDeliveryPerson(DeliveryPerson delPer ){
    this.deliveryPersonManagement.addNewDeliveryPerson(delPer);
}

   public DeliveryPerson loginDeliveryPerson(int stateID, String password){
  return this.deliveryPersonManagement.loginDeliveryPerson(stateID, password);
    }


  public List<DeliveryPerson> getDeliveryPersonThatAreFree() {
  return this.deliveryPersonManagement.getDeliveryPersonThatAreFree();
    
  }


  public boolean assignOrderToDeliveryPerson(Order order, int deliveryPersonId) {
  return this.deliveryPersonManagement.assignOrderToDeliveryPerson(order, deliveryPersonId);
    
  }


  public List<DeliveryPerson> getDeliveryBoyThatAreFreeInSameCity(String city) {
    
    return this.deliveryPersonManagement.getDeliveryBoyThatAreFreeInSameCity(city);
  }


  public void deliveryBoyCompleteOrder(int deliveryBoyId) {
    this.deliveryPersonManagement.deliveryBoyCompleteOrder(deliveryBoyId);
    
  }
  
  
   public ArrayList<DeliveryPerson> getDeliveryPersonDirectory()
   {
       return this.deliveryPersonManagement.getDeliveryPersonDirectory();
   }
   
    public DeliveryPerson getDeliveryBoyById (int deliveryBoyId)
    {
        return this.deliveryPersonManagement.getDeliveryPersonById(deliveryBoyId);
         
    }
    public void deleteDeliveryPerson(int deliveryBoyId)
    {
        this.deliveryPersonManagement.deleteDeliveryPerson(deliveryBoyId);
    }
    public void updateDeliveryBoy(int deliveryBoyId,String name,String city,int phno,String email,String address)
    {
        this.deliveryPersonManagement.updateDeliveryBoy(deliveryBoyId,name,city,phno,email,address);
    }
    
    public void replaceDeliveryPersonDb()
   {
       this.deliveryPersonManagement.replaceDeliveryPersonDb();
   }
    
    
}
