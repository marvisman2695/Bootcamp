public class Customer {
  //Customer has many orders, a order has many items
  // Item :quantity x price

  // Classes : Customer, Order, Item
  private double price;
  private int quantity;
  private String name;
  
  

  public static void main(String[] args) {
      //Place item into shopping cart
      //checkout -> new order(total amount)
  }
  public Customer() {

  }
  public Customer(int orders, double items) {
    this.orders = orders;
    this.items = items;
  }
}
