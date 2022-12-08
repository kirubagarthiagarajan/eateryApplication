package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ktkir
 */
public class GroceryEnterprise {
  private List<Grocery> groceryDirectory;
  private boolean isAcceptingOrders;
  private List<Order> currentOrders;

  public GroceryEnterprise() {
    this.groceryDirectory = new ArrayList<Grocery>();
    this.isAcceptingOrders = true;
    this.currentOrders = new ArrayList<Order>();
  }

  public List<Grocery> getGroceryDirectory() {
    return groceryDirectory;
  }

  public void setGroceryDirectory(List<Grocery> groceryDirectory) {
    this.groceryDirectory = groceryDirectory;
  }

  public void addGrocery(Grocery grocery) {
    this.groceryDirectory.add(grocery);
  }

  public void removeGrocery(int groceryId) {
    int index = 0;
    for (Grocery grocery : this.groceryDirectory) {

      if (grocery.getGroceryId() == groceryId) {
        this.groceryDirectory.remove(index);
        return;
      }
      index++;
    }
  }

  void updateGrocery(int groceryId, String groceryName, double price, int quantity) {
    for (Grocery r : this.groceryDirectory) {

      if (r.getGroceryId() == groceryId) {
        r.setGroceryName(groceryName);
        r.setPrice(price);
        r.setQuantity(quantity);
        return;
      }
    }

  }

  public Boolean isGroceryIdUnique(int groceryId) {
    for (Grocery grocery : this.groceryDirectory) {
      if (grocery.getGroceryId() == groceryId) {
        return false;
      }
    }
    return true;
  }

  public Boolean checkIfGroceryStoreAcceptsOrder() {
    return this.isAcceptingOrders;
  }

  public void setGroceryStoreAcceptsOrder(boolean isAcceptingOrder) {
    this.isAcceptingOrders = isAcceptingOrder;
  }

  public Grocery getGroceryById(int groceryId) {
    for (Grocery grocery : this.groceryDirectory) {
      if (grocery.getGroceryId() == groceryId) {
        return grocery;
      }
    }
    return null;
  }

  public Grocery getGroceryByName(String grocery) {
    for (Grocery g : this.groceryDirectory) {
      if (g.getGroceryName().equals(grocery)) {
        return g;
      }
    }
    return null;
  }

  public void assingOrdertoGrocery(Order order) {
    this.currentOrders.add(order);
  }

  public void cancelOrderByGrocery(int orderId) {
    int index = 0;
    for (Order order : this.currentOrders) {
      if (order.getOrderId() == orderId) {
        this.currentOrders.remove(index);
        order.setStatus(OrderStatus.CANCELLED);
      }
      index++;
    }
  }

  public boolean checkIfQuantityStoreHasGroceryQuantity(int groceryId, int quantity) {
for(Grocery grocery: this.groceryDirectory) {
  if(grocery.getGroceryId() == groceryId) {
     return grocery.getQuantity() >=quantity;
  } 
}
return false;
    
  }

}
