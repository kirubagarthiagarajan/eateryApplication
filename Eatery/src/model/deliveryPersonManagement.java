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
public class deliveryPersonManagement {
private ArrayList<DeliveryPerson> deliveryPersonDirectory;  
  
  public deliveryPersonManagement(){
      
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
    
}
