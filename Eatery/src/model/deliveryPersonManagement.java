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
public class DeliveryPersonManagement {
private ArrayList<DeliveryPerson> deliveryPersonDirectory;  
  
  public DeliveryPersonManagement(){
      
      this.deliveryPersonDirectory=new ArrayList<DeliveryPerson>();
      populateDeliveryPersonFromDb();
  }

    public ArrayList<DeliveryPerson> getDeliveryPersonDirectory() {
        return deliveryPersonDirectory;
    }

    public void setDeliveryPersonDirectory(ArrayList<DeliveryPerson> deliveryPersonDirectory) {
        this.deliveryPersonDirectory = deliveryPersonDirectory;
    }
    
    //get deliveryPerson from db
    public void populateDeliveryPersonFromDb()
    {
        
    }
    
     //replace db
    public void replaceDeliveryPersonDb(){
        
    }
  

    public void addNewDeliveryPerson(DeliveryPerson delPerson)
    {
 
        deliveryPersonDirectory.add(delPerson);

    }
    public void deleteDeliveryPerson(DeliveryPerson delPerson)
    {
        deliveryPersonDirectory.remove(delPerson);
    }
    
    public DeliveryPerson loginDeliveryPerson(int stateID, String password){
        for(DeliveryPerson delPerson:this.deliveryPersonDirectory)
        {
            if(delPerson.getStateId()==stateID && delPerson.getPassword().equals(password))
            {
                return delPerson;
            }
        }
        return null;
    }

    public List<DeliveryPerson> getDeliveryPersonThatAreFree() {
      List<DeliveryPerson> freeDeliveryPersons =  new ArrayList<DeliveryPerson>();
      for(DeliveryPerson dp:this.deliveryPersonDirectory) {
        if(dp.isAvailable()) {
          freeDeliveryPersons.add(dp);
        }
      }
      return freeDeliveryPersons;
    }

    public boolean assignOrderToDeliveryPerson(Order order, int deliveryPersonId) {
      for(DeliveryPerson del:this.deliveryPersonDirectory) {
        if(del.getStateId() == deliveryPersonId) {
          return del.setActiveOrder(order);
        }
      }
      return false;
      
    }

    public List<DeliveryPerson> getDeliveryBoyThatAreFreeInSameCity(String city) {
      List<DeliveryPerson> freeDeliveryPersons =  new ArrayList<DeliveryPerson>();
      for(DeliveryPerson dp:this.deliveryPersonDirectory) {
        if(dp.isAvailable() && dp.getCity().equals(city)) {
          freeDeliveryPersons.add(dp);
        }
      }
      return freeDeliveryPersons;
    }

    public void deliveryBoyCompleteOrder(int deliveryBoyId) {
      
     for(DeliveryPerson dp : this.deliveryPersonDirectory) {
       if(deliveryBoyId == dp.getStateId()) {
         dp.completeActiveOrder();
         return;
       }
     }
      
    }
    
     public DeliveryPerson getDeliveryPersonById (int deliverBoyId)
    {
       
          for(DeliveryPerson res:this.deliveryPersonDirectory) {
          if(res.getStateId()== deliverBoyId) {
            return res;
          }
        }
          return null;
    }
    
    public void deleteDeliveryPerson(int deliveryBoyId)
    {
        int index=0;
        for (DeliveryPerson res:this.deliveryPersonDirectory) {

      if (res.getStateId()== deliveryBoyId) {
        this.deliveryPersonDirectory.remove(index);
        return;
      }
      index++;
    }     
        
    }
    
    public void updateDeliveryBoy(int deliveryBoyId,String name,String city,int phno,String email,String address)
    {
         for (DeliveryPerson res:this.deliveryPersonDirectory) {
             
             if(res.getStateId()== deliveryBoyId)
             {
                 res.setName(name);
                 res.setCity(city);
                 res.setMobile(phno);
                 res.setEmail(email);
                 res.setAddress(address);
                 
             }
         }
    }
    
}
