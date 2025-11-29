import javax.swing.Box;

public class StringBox {
  private String value;  //private Object (可以直接Call個object, 唔理佢係咩"string, double, byte")

  public StringBox(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }

  public static void main(String[] args) {
    // Box of String
    // Box of Integer

    //Background
    //1.
    //2.

    Box<String> stringBox = new Box<>("hello");
    Box<Integer> integerBox = new Box(100);


    Box<Object> superBox = new Box<>("hello");
    superBox.setValue(Double.valueOf(10.5));

    superBox.setValue("args");
    //Polymorphism
    //

  }
}
