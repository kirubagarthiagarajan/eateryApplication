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
public class EmployeeDirectory {
    private ArrayList<Employee> employeeList;

public EmployeeDirectory(){
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


    
}
