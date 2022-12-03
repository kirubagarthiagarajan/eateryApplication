/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SQLConnection.SQLConnection;

/**
 *
 * @author ktkir
 */


public class foodDirectory {
  private ArrayList<food> foodList;

    public void setFoodList(ArrayList<food> foodList) {
        this.foodList = foodList;
    }

    public ArrayList<food> getFoodList() {
        return foodList;
    }
  
public foodDirectory(){
    this.foodList=new ArrayList<food>();
    populateFoodList();
}  

public void addFood(food f)
{
   this.foodList.add(f);
 replaceFoodList();
}

public void replaceFoodList()
{
      try {
          //db replace old list  with new this.foodList;
          Connection con=SQLConnection.dbconnector();
          Statement stmt=con.createStatement();
          String TruncQuery="Truncate table Food";
          stmt.executeUpdate(TruncQuery);
          for (food f: this.foodList)
          {
              String InsertQuery="Insert into Food (FoodId,FoodName,Price,RestaurantId) values ('"+f.getFoodId()+"','"+f.getName()+"','"+f.getPrice()+"','"+f.getRestarauntId()+"')";
              stmt.executeUpdate(InsertQuery);
          }
          stmt.close();
          con.close();
          
          
          populateFoodList();
      } catch (SQLException ex) {
          Logger.getLogger(foodDirectory.class.getName()).log(Level.SEVERE, null, ex);
      }
      populateFoodList();
}

//db connection with getting food
public void populateFoodList(){
      try {
          Connection con=SQLConnection.dbconnector();
          String sql="select * from Food";
          PreparedStatement ps=con.prepareStatement(sql);
          ResultSet st=ps.executeQuery();
          while(st.next())
             {
                 int foodId=(st.getInt("FoodId"));
                 int restaurantId=(st.getInt("RestaurantId"));
                 String Name=(st.getString("FoodName"));
                 int Price=st.getInt("Price");
                 food f= new food(Name,Price,restaurantId,foodId);
                 foodList.add(f);
                 
             }
      } catch (SQLException ex) {
          Logger.getLogger(foodDirectory.class.getName()).log(Level.SEVERE, null, ex);
      }
      
}

public void removeFood(int foodId)
{
          int index = 0;
    for (food r : this.foodList) {

      if (r.getFoodId()== foodId) {
        this.foodList.remove(index);
        return;
      }
      index++;
    } 
    replaceFoodList();
}

public ArrayList<food> getFoodByRestaraunt(int restarauntId){
    ArrayList<food> foodByRestaraunt = new ArrayList<>();
    
    for(food f:this.foodList)
    {
        if(f.getRestarauntId()==restarauntId)
        {
            foodByRestaraunt.add(f);
        }
    }
    
    return foodByRestaraunt;
}



}
