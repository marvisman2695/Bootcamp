
import java.math.BigDecimal;

public class Order {
  private Item[] items;

  public Order() {
    this.items = new Item[0]; //可以係0,裝唔到野
  }

  public int size() {
    return this.items.length;
  }
  public void addItem(Item newItem){
    Item[] newItems = new Item [this.items.length +1];
    // copy the original items into the new array
    //for (int i = 0; i <=this.items.length; i++){
    int idx = 0;
    for (Item item :this.items) {//this.items 已包齊
    newItems[idx] = item;
    idx++;
    }
    newItems[idx] = newItem;
    this.items = newItems; //指緊新array
    //
  }


  public double totalAmount() {
    BigDecimal total = BigDecimal.ZERO;
    for (Item item : this.items) {
      //BigDecimal total = BigDecimal.valueOf(price)
      //.multiply(BigDecimal.valueOf(quantity));
      total = total.add(BigDecimal.valueOf(item.totalAmount()));    
    }
  return total.doubleValue();


  }
}
