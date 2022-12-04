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
      private foodDirectory foodDirect;
       private EmployeeDirectory employeeList;
  public restarauntEnterprise(){
      this.restarauntDirectory=new ArrayList<Restaraunt>();
      this.foodDirect=new foodDirectory();
      populateDishesInRestaraunt();
      this.employeeList=new EmployeeDirectory();
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
    
       public void populateDishesInRestaraunt(){
       
       if(this.foodDirect.getFoodList().size() > 0 )
       {
         
        for(Restaraunt res: this.restarauntDirectory)
        {
         res.setDishes(this.foodDirect.getFoodByRestaraunt(res.getRestarauntId()));  
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
    
    
     
   
  
}
