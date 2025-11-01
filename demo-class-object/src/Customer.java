import java.math.BigDecimal;

public class Customer {
  //Customer has many orders, a order has many items
  // Item :quantity x price
  //!依家係用orders 搵customer

  // Classes : Customer, Order, Item
  private Order[] orders; //order係唔知自己係邊個customer

  public Customer() {
    this.orders = new Order[0];
  }

  //is Vip -> total amount of all order >= 10000
  //public boolean Vip() {
  public boolean isVip[] {
   BigDecimal total = BigDecimal.ZERO; //!背佐佢
    for (Order order : this.orders) {
      total = total.add(BigDecimal.valueOf(order.totalAmount()));   //if 無佐左邊total就等如你無草起個result 
    }
    return total.doubleValue()>= 10000;
  }
  //   this.orders = new Order[3];
    //for (Order order : this.orders)
//if (getsubTotal >= 10000) 
//System.out.println("Vip");
//  } else {
//    System.out.println("Not Vip");
//  }

  public void addOrder(Order order){
    Order[] newOrders  = new Order [this.orders.length +1];
    int idx = 0;
    for (Order orders : this.orders) {
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


  //order total amount?
  System.out.println(o1.totalAmount());

  //Given Item Name, find the subtotal
  //"DEF" -> 99(9.9 *10)
  System.out.println(o1.getSubtotal("DEF"));

  Customer c1 = new Customer();

  //o1.addItem(newItem(""))
  }
  }

