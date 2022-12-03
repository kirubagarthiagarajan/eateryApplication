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

public class deliveryPartnerEnterprise {
private deliveryPersonManagement deliveryPersonManagement; 
//private orderHandlingDepartment 
public deliveryPartnerEnterprise()
{
    this.deliveryPersonManagement=new deliveryPersonManagement();
}


public void addDeliveryPerson(DeliveryPerson delPer ){
    this.deliveryPersonManagement.addNewDeliveryPerson(delPer);
}

   public DeliveryPerson loginDeliveryPerson(int stateID, String password){
  return this.deliveryPersonManagement.loginDeliveryPerson(stateID, password);
    }
}
