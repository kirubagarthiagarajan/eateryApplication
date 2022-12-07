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
    private restarauntEnterprise restarauntEnterprise;
    private deliveryPartnerEnterprise deliveryEnterPrise;
    private orderDirectory orderList;
   
   
  public eateryEnterprise(eateryCustomerManagement eatCusManage,restarauntEnterprise restarauntManagement,deliveryPartnerEnterprise deliveryEnterPrise,orderDirectory orderList){
      this.eatCusManage=eatCusManage;
      this.restarauntEnterprise=restarauntManagement;
      this.deliveryEnterPrise=deliveryEnterPrise;
      this.restarauntEnterprise=new restarauntEnterprise();
      this.orderList=orderList;
      this.addRestarauntToDirectory("restaraunt1", 12345, "BOSTON");
      this.addEmployeeToRestaraunt( "Kiruba",123, 12345, "Menu Manager");
      
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
        
        for (Restaraunt res : this.restarauntEnterprise.getRestarauntDirectory() )  
        {
            if(res.getCity()==cityName);
            restarauntListForCity.add(res);
        }
        
        return restarauntListForCity;
    }
   
   //food starts
    public void addFoodToRestaraunt(String foodName,int price,int restarauntId,int foodId)
    {
        food f= new food(foodName, price, restarauntId, foodId);
        this.restarauntEnterprise.addFoodToRestaraunt(f, restarauntId);
    }
    
    public Boolean isFoodIdUnique(int foodId)
    {
         return this.restarauntEnterprise.isFoodIdUnique(foodId);
    }
    
    public ArrayList<food> getFoodList(){
        return this.restarauntEnterprise.getFoodList();
    }
    
     public food getFoodById(int foodId)
     {
         return this.restarauntEnterprise.getFoodById(foodId);
     }
    public void removeFood(int restarauntId, int foodId)
    {
        this.restarauntEnterprise.removeFood(restarauntId,foodId);
    }
    
    public ArrayList<food> getFoodListByRestaraunt(int restarauntId){
        return this.restarauntEnterprise.getFoodByRestaraunt(restarauntId);  
    }
            
    public void updatefood(int restarauntId, int foodId, String foodName, int price )
    {
        this.restarauntEnterprise.updateFood(restarauntId,foodId,foodName,price);
      
    }
    

    
            //food ends
      
    //employee starts
    public void addEmployeeToRestaraunt(String name,int employeeId, int restarauntId, String role)
    {
        Employee emp= new Employee(name, employeeId, restarauntId, role);
        this.restarauntEnterprise.addEmployeeToRestaraunt(emp);
    }
    
     public void removeEmployeeFromRestaraunt(int restarauntId, int employeeId)
    {
        
     
        this.restarauntEnterprise.removeEmployeeFromRestaraunt(restarauntId,employeeId);
    }
     
      public Restaraunt employeeLogin(String role, int restarauntId)
     {
         return this.restarauntEnterprise.loginEmployee(role,123, restarauntId);
     }
     
      public Restaraunt employeeLogin(String role,int employeeId, int restarauntId)
     {
         return this.restarauntEnterprise.loginEmployee(role,employeeId, restarauntId);
     }
      
      
      
      public ArrayList<Employee> getEmployeesByRestaraunt(int restarauntId){
          return this.restarauntEnterprise.getEmployeeByRestaraunt(restarauntId);
      }
      
      
       public Employee getEmployeeId(int employeeId)
     {
         return this.restarauntEnterprise.getEmployeeById(employeeId);
     }
       
       
       
          public void updateEmployee(int restarauntId, int employeeId, String employeeName, String role )
    {
        this.restarauntEnterprise.updateEmployee(restarauntId,employeeId,employeeName,role);
      
    }
          
           public Boolean isEmployeeIdUnique(int employeeId)
     {
         return this.restarauntEnterprise.isEmployeeIdUnique(employeeId);
     }
     //employee ends
    
    
    public void placeOrder(Order order)
    {
        this.orderList.addOrder(order);
//       boolean  this.restarauntEnterprise.checkIfRestaurantAcceptsOrder()
        this.restarauntEnterprise.assingOrdertoRestaraunt(order,order.getRestarauntId());
    }
    
    public void cancelOrder(Order order)
    {
        this.orderList.removeOrder(order.getOrderId());
        this.restarauntEnterprise.removeOrderFromRestaraunt(order.getOrderId(),order.getRestarauntId());
    }
   
    
     public void addDeliveryPerson(int stateId, String email, int mobile, String address, String name, String password, String city)
  {
      DeliveryPerson delPer= new DeliveryPerson(stateId,email,mobile, address, name,password,city);
      this.deliveryEnterPrise.addDeliveryPerson(delPer);
  }
     
     public DeliveryPerson deliveryPersonLogin(int stateId, String password)
     {
         return this.deliveryEnterPrise.loginDeliveryPerson(stateId, password);
     }
     
     public ArrayList<Restaraunt> getAllrestaraunts()
     {
         return this.restarauntEnterprise.getRestarauntDirectory();
     }
     
     public void addRestarauntToDirectory(String restarauntName, int restarauntId, String cityName){
         Restaraunt res= new Restaraunt(restarauntId, restarauntName, cityName);
         this.restarauntEnterprise.addRestaraunt(res);
         
     }
     
     public Boolean isRestarauntIdUnique(int restarauntId)
     {
        return this.restarauntEnterprise.isRestarauntIdUnique(restarauntId);
     }
     
     public Restaraunt getRestarauntById(int restarauntId){
         return this.restarauntEnterprise.getRestarauntById(restarauntId);
  
     }
     
     public void removeRestaraunt(int restarauntId)
     {
         this.restarauntEnterprise.removeRestaraunt(restarauntId);
     }
     
     public void updateRestaraunt(int restarauntId,String editCity,String cityName)
     {
         this.restarauntEnterprise.updateRestaraunt(restarauntId,editCity,cityName);
     }
     
    public Boolean isCustomerIdUnique(int CustomerId)
    {
        return this.eatCusManage.isCustomerIdUnique(CustomerId);
    }
    
     public void updateCustomer(int CustomerId,String name,int mobile,String email,String City,String password,String address)
     {
         this.eatCusManage.updateCustomer(CustomerId, name, mobile, email, City, password, address);
         
     }
     
     public Customer getCustomerById(int CustomerId)
     {
         return this.eatCusManage.getCustomerById(CustomerId);
                 
     }
    public void removeCustomer(Customer Cust)
    {
        this.eatCusManage.removeCustomer(Cust);
    }
    public ArrayList<Customer> getCustomerList()
    {
        return this.eatCusManage.getCustomerDirectory();
    }
     
  
}
  
 

