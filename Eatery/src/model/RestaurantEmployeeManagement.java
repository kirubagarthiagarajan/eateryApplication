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
public class RestaurantEmployeeManagement {
    private ArrayList<Employee> employeeList;

public RestaurantEmployeeManagement(){
 this.employeeList=new ArrayList<Employee>();
 populateEmployeeList();
}  
public void populateEmployeeList(){
    
}

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }


    
public void removeEmployee(int employeeId)
{
      int index = 0;
    for(Employee r : this.employeeList) {

      if (r.getEmployeeId()== employeeId) {
        this.employeeList.remove(index);
        return;
      }
      index++;
    }
}    


public ArrayList<Employee> getEmployeeListByRestaraunt(int restarauntId){
    ArrayList<Employee> employeeListByRestaraunt = new ArrayList<>();
    
    for(Employee f:this.employeeList)
    {
        if(f.getRestarauntId()==restarauntId)
        {
            employeeListByRestaraunt.add(f);
        }
    }
    
    return employeeListByRestaraunt;
}

public Boolean isEmployeeIdUnique(int employeeId){
      for(Employee emp : this.employeeList)
        {
            if(emp.getEmployeeId()==employeeId)
            {
                return false;
            }
        }
        return true;
}

public Employee getEmployeeById(int employeeById){
    for(Employee emp : this.employeeList)
    {
       if(emp.getEmployeeId()==employeeById)
            {
                return emp;
            }
        }
        return null;
}

public void updateEmployee(int employeeId,  String employeeName,  String role)
{
    for(Employee emp : this.employeeList)
    {
        if(emp.getEmployeeId()==employeeId)
        {
            emp.setName(employeeName);
            emp.setRole(role);
        }
    }
}

public void addEmployee(Employee emp)
{
    this.employeeList.add(emp);
}

    
}
