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
    private ArrayList<food> dishes;
    private ArrayList<Order> currentOrders;
    private ArrayList<Employee> employeeList;
    private restarauntOnlineOrderManagement orderManager;


    public Restaraunt(int restarauntId, String restarauntName,String city)
    {
        
        this.restarauntId=restarauntId;
        this.restarauntName=restarauntName;
        this.city=city;
        this.dishes=new ArrayList<>();
        this.currentOrders=new ArrayList<>();
        this.employeeList=new ArrayList<>();
    }
   
    public void setRestarauntName(String restarauntName) {
        this.restarauntName = restarauntName;
    }

    public void setCity(String city) {
        this.city = city;
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



    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    
    
    
        

    public void addToCurrentOrders(Order order) {
        this.currentOrders.add(order);
    }
     
    public void removeFromCurrentOrders(int orderId) {
    int index = 0;
    for (Order order :this.currentOrders) {

      if (order.getOrderId()== orderId) {
        this.currentOrders.remove(index);
        return;
      }
      index++;
    } 
  
    }

    public ArrayList<food> getDishes() {
        return dishes;
    }

    public ArrayList<Order> getCurrentOrders() {
        return currentOrders;
    }
    
     public void addToEmployeeList(Employee emp){
        this.employeeList.add(emp);
    }
     
     public void removeFromEmployeeList(int EmployeeId){
         int index = 0;
    for (Employee emp :this.employeeList) {

      if (emp.getEmployeeId()== EmployeeId) {
        this.employeeList.remove(index);
        return;
      }
      index++;
    } 
    }
     
    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    

    public void addToDishes(food Food){
        this.dishes.add(Food);
    }
    
    public void removeFromDishes(int foodId){
                 int index = 0;
    for (food f :this.dishes) {

      if (f.getFoodId()== foodId) {
        this.dishes.remove(index);
        return;
      }
      index++;
    } 
    }
    
    
    public void updateDish( int foodId, String foodName, int price){
        for(food f:this.dishes)
        {
            if(f.getFoodId()==foodId)
            {
                f.setName(foodName);
                f.setPrice(price);
            }
        }
    }
    public void setDishes(ArrayList<food> dishes) {
        this.dishes = dishes;
    }
    
    public void updateEmployee(int employeeId, String employeeName, String role)
    {
         for(Employee emp:this.employeeList)
        {
            if(emp.getEmployeeId()==employeeId)
            {
                emp.setName(employeeName);
                emp.setRole(role);
            }
        } 
    }
    
}
