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
public class OrderDirectory {
     private ArrayList<Order> orderList; 

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }
     
     public OrderDirectory(){
    this.orderList=new ArrayList<Order>();
    populateOrderList();
}  
     
     public void populateOrderList(){
         
     }
     
     public void addOrder(Order order)
     {
         this.orderList.add(order);
        replaceOrderListInDB();
     }
     
    public void removeOrder(int orderId)
{
          int index = 0;
    for (Order r : this.orderList) {

      if (r.getOrderId()== orderId) {
        this.orderList.remove(index);
        return;
      }
      index++;
    } 
    
    replaceOrderListInDB();

}
    
    public Order getOrderId(int orderId)
    {
      for(Order ord : this.orderList)
      {
          if(ord.getOrderId()==orderId)
          {
              return ord;
          }
      }
      return null;
    }
    
    
   
    
    public void replaceOrderListInDB()
{
    //db replace old list  with new this.orderlist;
    
    populateOrderList();
}

    public  List<Order> getOrdersThatOutForDelivery() {
      List<Order> outForDeliveryOrders = new ArrayList<Order>();
      for(Order order: this.orderList) {
        if(order.getStatus().equals(OrderStatus.OUT_FOR_DELIVERY)) {
          outForDeliveryOrders.add(order);
        }
      }
      return outForDeliveryOrders;
      
    }
     
}