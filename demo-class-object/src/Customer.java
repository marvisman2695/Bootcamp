import java.math.BigDecimal;

public class Customer {
  //Customer has many orders, a order has many items
  // Item :quantity x price
  //!依家係用orders 搵customer

  private Order[] orders; //order係唔知自己係邊個customer

  // Classes : Customer, Order, Item
  
  public Customer() {
    this.orders = new Order[0];
  }

  // ! Presentation

  //is Vip -> total amount of all order >= 10000
  //public boolean Vip() {
  public boolean isVip() {
   BigDecimal total = BigDecimal.ZERO; //!背佐佢
    for (Order order : this.orders) {
      total = total.add(BigDecimal.valueOf(order.totalAmount()));   //if 無佐左邊total就等如你無草起個result 
    }
    return total.doubleValue()>= 10000.0;
  }

  public void addOrder(Order newOrder){
    Order[] newOrders  = new Order [this.orders.length +1];
    int idx = 0;
    for (Order order : this.orders) {
      newOrders[idx] = order;
      idx++;
    }
    newOrders[idx] = newOrder;
    this.orders = newOrders;
  }
  public static void main(String[] args) {
      //Place item into shopping cart
      //checkout -> new order(total amount)
  //"ABC" 2.5 3
  //"DEF" 9.9 10
  //"IJK" 999.9  2
    
  Order o1 = new Order();
  o1.addItem(new Item("ABC", 2.5, 3));
  o1.addItem(new Item("DEF", 9.9, 10));
  o1.addItem(new Item("IJK", 999.9,2));


 // order total amount?
    System.out.println(o1.totalAmount()); // 2016.3
    
    // Given Item name, find the subtotal
    // "DEF" -> 99 (9.9 x 10) 
    System.out.println(o1.getSubtotal("DEF"));

    Customer c1 = new Customer();
    
    // o1.addItem(new Item("XYZ", 9000, 1));
    
    c1.addOrder(o1);
    
    o1.addItem(new Item("XYZ", 9000, 1));

    System.out.println(c1.isVip()); // true
  }
}

