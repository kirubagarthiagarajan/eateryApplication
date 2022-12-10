/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ktkir
 */

public class EateryEnterprise {
  private EateryCustomerManagement eatCusManage;
  private RestaurantEnterprise restaurantEnterprise;
  private DeliveryPartnerEnterprise deliveryEnterPrise;
  private OrderDirectory orderList;
  private GroceryEnterprise groceryEnterprise;

  public EateryEnterprise(EateryCustomerManagement eatCusManage,
      RestaurantEnterprise restaurantManagement, DeliveryPartnerEnterprise deliveryEnterPrise,
      OrderDirectory orderList, GroceryEnterprise groceryEnterprise) {
    this.eatCusManage = eatCusManage;
    this.restaurantEnterprise = restaurantManagement;
    this.deliveryEnterPrise = deliveryEnterPrise;
    this.setGroceryEnterprise(groceryEnterprise);
    this.restaurantEnterprise = new RestaurantEnterprise();
    this.orderList = orderList;
    
     this.addGrocery(123, "rice", 15.00, 10);
      this.addGrocery(456, "banana", 20.00, 20);

  }

  public void addCustomer(int stateId, String name, int mobile, String email, String city,
      String password, String address) {
    Customer cust = new Customer(stateId, name, mobile, email, city, password, address);
    this.eatCusManage.addNewCustomer(cust);
  }

  public Customer customerLogin(int stateId, String password) {
    return this.eatCusManage.loginCustomer(stateId, password);
  }

  public List<Restaurant> getRestaurantByCity(String cityName) {
    List<Restaurant> restaurantListForCity = new ArrayList<>();

    for (Restaurant res : this.restaurantEnterprise.getRestaurantDirectory()) {
      if (res.getCity().equals(cityName)) {
        restaurantListForCity.add(res);
      }
    }

    return restaurantListForCity;
  }

  // food starts
  public void addFoodToRestaurant(String foodName, int price, int restaurantId, int foodId) {
    Food f = new Food(foodName, price, restaurantId, foodId);
    this.restaurantEnterprise.addFoodToRestaurant(f, restaurantId);
  }

  public Boolean isFoodIdUnique(int foodId) {
    return this.restaurantEnterprise.isFoodIdUnique(foodId);
  }
  
  public List<Order> getGroceryOrders()
  {
      return this.groceryEnterprise.getCurrentOrders();
  }
  public Boolean isGroceryIdUnique(int groceryId)
  {
      return this.groceryEnterprise.checkIfGroceryIdIsUnique(groceryId);
  }

  
  public ArrayList<Food> getFoodList() {
    return this.restaurantEnterprise.getFoodList();
  }

  public Food getFoodById(int foodId) {
    return this.restaurantEnterprise.getFoodById(foodId);
  }

  public void removeFood(int restaurantId, int foodId) {
    this.restaurantEnterprise.removeFood(restaurantId, foodId);
  }

  public ArrayList<Food> getFoodListByRestaurant(int restaurantId) {
    return this.restaurantEnterprise.getFoodByRestaurant(restaurantId);
  }

  public void updatefood(int restaurantId, int foodId, String foodName, int price) {
    this.restaurantEnterprise.updateFood(restaurantId, foodId, foodName, price);

  }

  // food ends

  // employee starts
  public void addEmployeeToRestaurant(String name, int employeeId, int restaurantId, String role) {
    Employee emp = new Employee(name, employeeId, restaurantId, role);
    this.restaurantEnterprise.addEmployeeToRestaurant(emp);
  }

  public void removeEmployeeFromRestaurant(int restaurantId, int employeeId) {

    this.restaurantEnterprise.removeEmployeeFromRestaurant(restaurantId, employeeId);
  }

  public Restaurant employeeLogin(String role, int restaurantId) {
    return this.restaurantEnterprise.loginEmployee(role, 123, restaurantId);
  }

  public Restaurant employeeLogin(String role, int employeeId, int restaurantId) {
    return this.restaurantEnterprise.loginEmployee(role, employeeId, restaurantId);
  }

  public ArrayList<Employee> getEmployeesByRestaurant(int restaurantId) {
    return this.restaurantEnterprise.getEmployeeByRestaurant(restaurantId);
  }

  public Employee getEmployeeId(int employeeId) {
    return this.restaurantEnterprise.getEmployeeById(employeeId);
  }

  public void updateEmployee(int restaurantId, int employeeId, String employeeName, String role) {
    this.restaurantEnterprise.updateEmployee(restaurantId, employeeId, employeeName, role);

  }

  public Boolean isEmployeeIdUnique(int employeeId) {
    return this.restaurantEnterprise.isEmployeeIdUnique(employeeId);
  }
  // employee ends

  public void placeOrder(Order order) {
    this.orderList.addOrder(order);
     this.eatCusManage.addOrderToActiveOrdersOfCustomer(order);
    if(order.isGroceryOrder())
    {
        this.groceryEnterprise.assingOrdertoGrocery(order);
    }
    else
    {
         this.restaurantEnterprise.assingOrdertoRestaurant(order, order.getRestaurantId());
    }
   
  }

  public Boolean checkIfRestaurantAcceptsOrder(int restaurantId) {
    return this.restaurantEnterprise.checkIfRestaurantAcceptsOrder(restaurantId);
  }


  public void addDeliveryPerson(int stateId, String email, int mobile, String address, String name,
      String password, String city) {
    DeliveryPerson delPer = new DeliveryPerson(stateId, name, mobile, address, city, password,
        address);
    this.deliveryEnterPrise.addDeliveryPerson(delPer);
  }

  public DeliveryPerson deliveryPersonLogin(int stateId, String password) {
    return this.deliveryEnterPrise.loginDeliveryPerson(stateId, password);
  }

  public ArrayList<Restaurant> getAllrestaurants() {
    return this.restaurantEnterprise.getRestaurantDirectory();
  }

  public void addRestaurantToDirectory(String restaurantName, int restaurantId, String cityName) {
    Restaurant res = new Restaurant(restaurantId, restaurantName, cityName, 0);
    this.restaurantEnterprise.addRestaurant(res);

  }

  public Boolean isRestaurantIdUnique(int restaurantId) {
    return this.restaurantEnterprise.isRestaurantIdUnique(restaurantId);
  }

  public Restaurant getRestaurantById(int restaurantId) {
    return this.restaurantEnterprise.getRestaurantById(restaurantId);

  }

  public void removeRestaurant(int restaurantId) {
    this.restaurantEnterprise.removeRestaurant(restaurantId);
  }

  public void updateRestaurant(int restaurantId, String editCity, String cityName) {
    this.restaurantEnterprise.updateRestaurant(restaurantId, editCity, cityName);
  }

  public Boolean isCustomerIdUnique(int CustomerId) {
    return this.eatCusManage.isCustomerIdUnique(CustomerId);
  }

  public void updateCustomer(int CustomerId, String name, int mobile, String email, String City,
      String password, String address) {
    this.eatCusManage.updateCustomer(CustomerId, name, mobile, email, City, password, address);

  }

  public Customer getCustomerById(int CustomerId) {
    return this.eatCusManage.getCustomerById(CustomerId);

  }

  public void removeCustomer(Customer Cust) {
    this.eatCusManage.removeCustomer(Cust);
  }

  public ArrayList<Customer> getCustomerList() {
    return this.eatCusManage.getCustomerDirectory();
  }

  // nandhini
  public List<Order> getOrdersThatOutForDelivery() {
    return this.orderList.getOrdersThatOutForDelivery();
  }
  
    public List<Order> getOrdersThatReadyForDelivery() {
    return this.orderList.getOrdersThatOutForDelivery();
  }

  public List<DeliveryPerson> getDeliveryPersonThatAreFree() {
    return this.deliveryEnterPrise.getDeliveryPersonThatAreFree();
  }

  public boolean assignOrderToDeliveryBoy(int orderId, int deliveryPersonId) {
    Order currOrder = this.orderList.getOrderId(orderId);
    currOrder.setDeliveryPersonId(deliveryPersonId);
    currOrder.setStatus(OrderStatus.OUT_FOR_DELIVERY);
    if (currOrder != null) {
      return this.deliveryEnterPrise.assignOrderToDeliveryPerson(currOrder, deliveryPersonId);
    } else {
      return false;
    }
  }

  public List<DeliveryPerson> getDeliveryBoyThatAreFreeInSameCity(String city) {
    return this.deliveryEnterPrise.getDeliveryBoyThatAreFreeInSameCity(city);
  }

  public void deliveryBoyCompleteOrder(int deliveryBoyId, int orderId) {
    this.deliveryEnterPrise.deliveryBoyCompleteOrder(deliveryBoyId);

    Order order = this.orderList.getOrderId(orderId);
    order.setStatus(OrderStatus.DELIVERED);
    this.eatCusManage.removeFromActiveOrdersOfCustomer(order);
    this.eatCusManage.addOrderToPastOrdersOfCustomer(order);
  }

  public void cancelOrderByCustomer(int custId, int orderId) {

    Order order = this.orderList.getOrderId(orderId);
    if (order != null && order.getCustomerId() == custId
        && !(order.getStatus().equals(OrderStatus.DELIVERED)
            || order.getStatus().equals(OrderStatus.CANCELLED)))
      if(this.eatCusManage.cancelOrderByCustomer(custId, order))
      {
              order.setStatus(OrderStatus.CANCELLED);
    this.restaurantEnterprise.setOrderStatusCancelled(order.getRestaurantId(), orderId);
    this.eatCusManage.removeFromActiveOrdersOfCustomer(order);
    this.eatCusManage.addOrderToPastOrdersOfCustomer(order);
      }

  }

  public void cancelOrderByRestaurant(int restaurantId, int orderId) {
    Order order = this.orderList.getOrderId(orderId);
    if (order != null && order.getRestaurantId() == restaurantId
        && !(order.getStatus().equals(OrderStatus.DELIVERED)
            || order.getStatus().equals(OrderStatus.CANCELLED)))
      this.restaurantEnterprise.cancelOrderByRestaurant(restaurantId, orderId);
    order.setStatus(OrderStatus.CANCELLED);
    if(this.eatCusManage.cancelOrderByCustomer(order.getCustomerId(), order))
    {
        this.eatCusManage.removeFromActiveOrdersOfCustomer(order);
         this.eatCusManage.addOrderToPastOrdersOfCustomer(order);
    }
   
  }
  
    public void cancelOrderByGrocery(int orderId) {
    Order order = this.orderList.getOrderId(orderId);
    if (order != null 
        && !(order.getStatus().equals(OrderStatus.DELIVERED) || order.getStatus().equals(OrderStatus.CANCELLED)))
        this.groceryEnterprise.cancelOrderByGrocery(orderId);
       order.setStatus(OrderStatus.CANCELLED);
     if(this.eatCusManage.cancelOrderByCustomer(order.getCustomerId(), order))
    {
        this.eatCusManage.removeFromActiveOrdersOfCustomer(order);
        this.eatCusManage.addOrderToPastOrdersOfCustomer(order);
    }
   
  }

  public ArrayList<DeliveryPerson> getAllDeliveryPerson() {
    return this.deliveryEnterPrise.getDeliveryPersonDirectory();
  }

  public DeliveryPerson getDeliveryBoyById(int deliveryBoyId) {
    return this.deliveryEnterPrise.getDeliveryBoyById(deliveryBoyId);
  }

  public void deleteDeliveryPerson(int deliveryBoyId) {
    this.deliveryEnterPrise.deleteDeliveryPerson(deliveryBoyId);
  }

  public void updateDeliveryBoy(int deliveryBoyId, String name, String city, int phno, String email,
      String address) {
    this.deliveryEnterPrise.updateDeliveryBoy(deliveryBoyId, name, city, phno, email, address);
  }

  public void addGrocery(int groceryId, String name, double price, int quantity) {
    this.groceryEnterprise.addGrocery(new Grocery(groceryId, name, price, quantity));
  }

  public Grocery getGroceryById(int groceryId) {
    return this.groceryEnterprise.getGroceryById(groceryId);
  }

  public void removeGrocery(int groceryId) {
    this.groceryEnterprise.removeGrocery(groceryId);
  }

  public void updateGrocery(int groceryId, String name, double price, int quantity) {
    this.groceryEnterprise.updateGrocery(groceryId, name, price, quantity);
  }

  public void checkIfQuantityStoreHasGroceryQuantity(int groceryId, int quantity) {
    this.groceryEnterprise.checkIfQuantityStoreHasGroceryQuantity(groceryId, quantity);
  }

  public GroceryEnterprise getGroceryEnterprise() {
    return groceryEnterprise;
  }

  public void setGroceryEnterprise(GroceryEnterprise groceryEnterprise) {
    this.groceryEnterprise = groceryEnterprise;
  }

  public void replaceCustomerDb() {
    this.eatCusManage.replaceCustomerDb();
  }

  public void replaceRestaurantDb() {
    this.restaurantEnterprise.replaceRestaurantDb();
  }

  public void replaceDeliveryPersonDb() {

    this.deliveryEnterPrise.replaceDeliveryPersonDb();
  }

  public void replaceEmployeeDb() {
    this.restaurantEnterprise.replaceEmployeeDb();
  }

  public void replacefoodDb() {
    this.restaurantEnterprise.replacefoodDb();
  }

  public void replaceOrderDb() {
    this.orderList.replaceOrderListInDB();
  }

  public List<Order> getPastOrdersOfCustomer(int custId) {
    return this.eatCusManage.getPastOrdersOfCustomer(custId);
  }

  public void processOrderByRestaurant(int orderId) {
    Order order = this.orderList.getOrderId(orderId);
    order.setStatus(OrderStatus.READY_FOR_DELIVERY);
    this.restaurantEnterprise.removeOrderFromRestaurant(orderId, order.getRestaurantId());
  }
  
   public void processOrderByGrocery(int orderId) {
    Order order = this.orderList.getOrderId(orderId);
    order.setStatus(OrderStatus.READY_FOR_DELIVERY);
    this.groceryEnterprise.removeOrderFromGrocery(orderId);
  }
  
  public List<Order> getOrdersByRestaurant(int restaurantId){
   return this.orderList.getOrdersFromRestaurant(restaurantId);
  }
  
  public List<Grocery> getGroceries(){
    return this.groceryEnterprise.getGroceryDirectory();
  }
  
  public List<Order> getOrderByDeliveryBoyId(int deliveryBoyId){
      return this.orderList.getOrderByDeliveryBoyId(deliveryBoyId);
  }
  
  public Order getOrderWithOrderId(int orderId)
  {
      return this.orderList.getOrderId(orderId);
  }
  
  public void sendQueryToCustomer(String query,  int deliveryPersonId) {
    this.deliveryEnterPrise.sendQueryToCustomer(deliveryPersonId,  query);
  }

}