import java.math.BigDecimal;

public class Order {
  private Item[] items;

  public Order() {
    this.items = new Item[0]; //可以係0,裝唔到野
  }

  public int size() {
    return this.items.length;
  }
  
  // public double subtotal(String itemName) {
  // this.subtotal = subtotal;
    public double getSubtotal(String itemName) {
for (Item item : this.items) {
  if (item.getName().equals(itemName)) {
    return item.subtotal();
  }
}
return 0.0;
}
  public void addItem(Item newItem){  //!背佐佢
    Item[] newItems = new Item [this.items.length +1];
    // copy the original items into the new array
    //for (int i = 0; i <=this.items.length; i++){
    int idx = 0;
    for (Item item :this.items) {//this.items 已包齊 item只係個名,因為只有array會落s,this.item referred to actruibute
    newItems[idx] = item;
    idx++;
    }
    newItems[idx] = newItem;
    this.items = newItems; //指緊新array
    //
  }


  public double totalAmount() {
    BigDecimal total = BigDecimal.ZERO; //!背佐佢
    for (Item item : this.items) {
      //BigDecimal total = BigDecimal.valueOf(price)
      //.multiply(BigDecimal.valueOf(quantity));
      total = total.add(BigDecimal.valueOf(item.subtotal()));   //if 無佐左邊total就等如你無草起個result 
    }
  return total.doubleValue();


  }
}
