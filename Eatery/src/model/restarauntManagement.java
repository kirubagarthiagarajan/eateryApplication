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
public class restarauntManagement {
      private ArrayList<Restaraunt> restarauntDirectory;  
  
  public restarauntManagement(){
      this.restarauntDirectory=new ArrayList<Restaraunt>();
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
  
}
