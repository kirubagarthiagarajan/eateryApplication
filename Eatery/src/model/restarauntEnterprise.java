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
public class restarauntEnterprise {
       private ArrayList<Restaraunt> restarauntDirectory;  
       private RestaurantFoodManagement foodDirect;
       private RestaurantEmployeeManagement employeeList;
       public restarauntEnterprise(){
       this.restarauntDirectory=new ArrayList<Restaraunt>();
       this.foodDirect=new RestaurantFoodManagement();
//       populateDishesInRestaraunt();
       this.employeeList=new RestaurantEmployeeManagement();
  }

  


   
   
    public ArrayList<Restaraunt> getRestarauntDirectory() {
        return restarauntDirectory;
    }

    public void setRestarauntDirectory(ArrayList<Restaraunt> restarauntDirectory) {
        this.restarauntDirectory = restarauntDirectory;
    }
    
    public void addRestaraunt(Restaraunt rest)
    {
        this.restarauntDirectory.add(rest);
    }
    
    public void removeRestaraunt(int restId)
    {
           int index = 0;
    for (Restaraunt r : this.restarauntDirectory) {

      if (r.getRestarauntId()== restId) {
        this.restarauntDirectory.remove(index);
        return;
      }
      index++;
    } 
    }
    
    
    void updateRestaraunt(int restarauntId,String restarauntName, String cityName) {
    for (Restaraunt r : this.restarauntDirectory) {

      if (r.getRestarauntId()== restarauntId) {
          r.setRestarauntName(restarauntName);
          r.setCity(cityName);
        return;
      }
    }

  }
    
    //food starts
    
    void addFoodToRestaraunt(food f, int restarauntId){
        this.foodDirect.addFood(f);
                
        for(Restaraunt res: this.restarauntDirectory)
        {
            if(res.getRestarauntId()==restarauntId)
            {
                res.addToDishes(f);
            }
        } 
    }
    
    public ArrayList<food> getFoodList()
    {
        return this.foodDirect.getFoodList();
    }
    
       public void populateDishesInRestaraunt(){
       
       if(this.foodDirect.getFoodList().size() > 0 )
       {
         
        for(Restaraunt res: this.restarauntDirectory)
        {
         res.setDishes(this.foodDirect.getFoodByRestaraunt(res.getRestarauntId()));  
        } 
       }
   }
       
       public Boolean isFoodIdUnique(int foodId)
       {
             for(food food:this.foodDirect.getFoodList()) {
          if(food.getFoodId()== foodId) {
            return false;
          }
        }
        return true;   
       }
       
       public void removeFood(int restId, int foodId)
       {
           this.foodDirect.removeFood(foodId);
           removeFoodFromRestaraunt(restId,foodId);
       }
       
           public void removeFoodFromRestaraunt(int restarauntId,int foodId)
    {
        for(Restaraunt res :this.restarauntDirectory)
        {
            if(res.getRestarauntId()==restarauntId)
            {
               res.removeFromDishes(foodId);
            }
        }
    }
           
           public food getFoodById(int foodId){
               return this.foodDirect.getFoodById(foodId);
           }
           
           public ArrayList<food> getFoodByRestaraunt(int restId)  
           {
              return this.foodDirect.getFoodByRestaraunt(restId);
           }
       
           public void updateFood(int restarauntId, int foodId, String foodName, int price)
           {
               this.foodDirect.updateFood( foodId,  foodName,  price);
                 updateFoodinRestaraunt( restarauntId,  foodId,  foodName,  price);
           }
       
           public void updateFoodinRestaraunt(int restarauntId, int foodId, String foodName, int price)
           {
               for(Restaraunt res: this.restarauntDirectory)
               {
                   if(res.getRestarauntId()==restarauntId)
                   {
                       res.updateDish(foodId,foodName,price);
                   }
               }
           }
       
       //food ends
       
         //employee starts 
     public void populateEmployeeInRestaraunt(){
       
       if(this.employeeList.getEmployeeList().size() > 0 )
       {
         
        for(Restaraunt res: this.restarauntDirectory)
        {
         res.setEmployeeList(this.employeeList.getEmployeeListByRestaraunt(res.getRestarauntId()));  
        } 
       }
   }
     
     
     public void addEmployeeToRestaraunt(Employee emp){
         this.employeeList.addEmployee(emp);
      for(Restaraunt res :this.restarauntDirectory)
      {
          if(res.getRestarauntId()==emp.getRestarauntId())
          {
              res.addToEmployeeList(emp);
          }
      }
     }
     
     
        public void removeEmployeeFromRestaraunt(int restarauntId,int employeeId){
      for(Restaraunt res :this.restarauntDirectory)
      {
          if(res.getRestarauntId()==restarauntId)
          {
              res.removeFromEmployeeList(employeeId);
          }
      }
     }
        
        public Restaraunt loginEmployee(String role,int employeeId, int restarauntId)
        {
            if(role=="Employee Manager")
            {
                for(Restaraunt res: this.restarauntDirectory)
                {
                    if(res.getRestarauntId()==restarauntId)
                    {
                        return res;
                    }
                }
            }
            else
            {
            for(Restaraunt res : this.restarauntDirectory)
            {
                if(res.getRestarauntId()==restarauntId)
                {
                    for(Employee emp : res.getEmployeeList())
                    {
                        if(emp.getEmployeeId()==employeeId && emp.getRole()==role )
                        {
                            return res;
                        }
                    }
                }
            }
            }
            return null;
        }
        
        public ArrayList<Employee> getEmployeeByRestaraunt(int restarauntId)
        {
           
            for(Restaraunt res :this.restarauntDirectory)
            {
                if(res.getRestarauntId()==restarauntId)
                {
                   return res.getEmployeeList();
                }
            }
            
            
            
            return null;
        }
     
        public Employee getEmployeeById(int employeeId){
            return this.employeeList.getEmployeeById(employeeId);
        }
        
               
           public void updateEmployee(int restarauntId, int employeeId, String employeeName, String role)
           {
               this.employeeList.updateEmployee( employeeId,  employeeName,  role);
                 updateEmployeeInRestaraunt( restarauntId, employeeId,  employeeName,  role);
           }
       
           public void updateEmployeeInRestaraunt(int restarauntId, int employeeId, String employeeName, String role)
           {
               for(Restaraunt res: this.restarauntDirectory)
               {
                   if(res.getRestarauntId()==restarauntId)
                   {
                       res.updateEmployee(employeeId,employeeName,role);
                   }
               }
           }
     //employee ends 
    
    
    public void assingOrdertoRestaraunt(Order order, int restarauntId){
        for(Restaraunt res : this.restarauntDirectory)
        {
            if(res.getRestarauntId()==restarauntId)
            {
                res.addToCurrentOrders(order);
            }
        }
        
    }
    
    public void removeOrderFromRestaraunt(int orderId, int restarauntId)
    {
        for(Restaraunt res :this.restarauntDirectory)
        {
            if(res.getRestarauntId()==restarauntId)
            {
               res.removeFromCurrentOrders(orderId);
            }
        }
    }
    
    public Boolean isRestarauntIdUnique(int restId){
      for(Restaraunt res:this.restarauntDirectory) {
          if(res.getRestarauntId()== restId) {
            return false;
          }
        }
        return true;   
    }
    
    public Restaraunt getRestarauntById (int restarauntId)
    {
          for(Restaraunt res:this.restarauntDirectory) {
          if(res.getRestarauntId()== restarauntId) {
            return res;
          }
        }
          return null;
    }
    
    public Boolean isEmployeeIdUnique(int employeeId)
    {
      return this.employeeList.isEmployeeIdUnique(employeeId);
    }
    
     
   
  
}
