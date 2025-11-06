

public class DemoStatic {
  //! static variable
  public static String content = "";

//! Final variable,
public final String https = "https";

//!Static Final variable(常數/定義)
// Name convention : snake case + capital letter
public static final int HOUR_PER_DAY = 24;

// ! Object's method can access static variable & method
  // ! Static method CANNOT access objects

  private int x;
  private int y;

  public DemoStatic(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public DemoStatic () {

  }

  public static void main(String[] args) {
      // Call Static Variable
      content += "abc";
      content += "def";
      System.out.println(content);// abcdef
      //formally call static variable
      System.out.println(DemoStatic.content); //abcdef
  

    //!Call static method
  
  System.out.println(DemoStatic.sum(10, 3));//13

  //!Call instance method
  DemoStatic ds = new DemoStatic();
  System.out.println(ds.subtract(10, 3)); //7

  //!Call instance method
  DemoStatic ds2 = new DemoStatic();
  System.out.println(ds2.multiply());

  //! Call Final Variable 
  DemoStatic ds3 = new DemoStatic();
  System.out.println(ds3.https); // "https"
  //Final Variable cannot bee re- assigned.
  //ds3.https = "hello";

}

//!Call instance method
  public static int sum(int x, int y) { //最簡單, 數字係另一邊
    //return x + y + this.x; //! Static method doesnt make sense to call "this",
    //! because static method belongs to Class. but not object
  return x + y ;
}

public int subtract(int x, int y) {  //10個substract method 掛在身上//沒this
  return x-y;
}
public int multiply() { // formla 一樣但笞案不一
  return this.x * this.y; // this
}

}

