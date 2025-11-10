public class Candy {
  public final String color; //有final 代表呢一世都無得改

  public Candy(String color) {
    this.color = color;
  }
  
  public String getColor() {
    return this.color;
  }

  public String toString() {
    return " Candy(" //
    + "color=" + this.color
    + ")";
  }
}
