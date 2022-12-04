/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ktkir
 */
public class Employee {
    private String name;
    private int employeeId;
    private int restarauntId;
    private String role;
    
    public Employee( String name,int employeeId,int restarauntId,String role)
    {
        this.name=name;
        this.employeeId=employeeId;
        this.restarauntId=restarauntId;
        this.role=role;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getRestarauntId() {
        return restarauntId;
    }

    public String getRole() {
        return role;
    }
   
    
    
    
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setRestarauntId(int restarauntId) {
        this.restarauntId = restarauntId;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
    
}
