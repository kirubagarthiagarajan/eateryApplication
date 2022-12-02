/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ktkir
 */


public class eateryEnterprise {
    private eateryCustomerManagement eatCusManage;
    private restarauntManagement restarauntManagement;
    private deliveryPartnerEnterprise deliveryEnterPrise;
   
  public eateryEnterprise(){
      this.eatCusManage=new eateryCustomerManagement();
      this.restarauntManagement=new restarauntManagement();
      
  }
}
