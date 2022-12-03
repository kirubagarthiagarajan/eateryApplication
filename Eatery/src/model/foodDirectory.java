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
    //db replace old list  with new this.foodList;
    populateFoodList();
}

//db connection with getting food
public void populateFoodList(){
    
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
