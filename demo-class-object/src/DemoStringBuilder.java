
import java.math.BigDecimal;

public class DemoStringBuilder {
  public static void main(String[] args) {
      String name = "John";
      String[] names = new String[] {"Peter", name, "Sally"};

      //PeterJohnSally
      String result = "";
      for (String x : names) {
        result = result.concat(x);
  }
      System.out.println(result);

      //StringBuilder
      StringBuilder sb = new StringBuilder();
      sb.append("hello"); //呢度既append只係修改自己
      sb.append("world");
      System.out.println(sb.toString()); //helloworld
      //Object 個框都依然係同一個

      BigDecimal bd = new BigDecimal("3.5");
      bd.add(BigDecimal.TEN);
      System.out.println(bd);
// difference bd = -> new result
      bd = bd.add(BigDecimal.TEN);
      System.out.println(bd);

      //! Performance of concat (StringBuilder win!)
      long before = System.currentTimeMillis();
      result = "";
      for (int i = 0; i <1000; i++) {
        result += "a";  //! 呢度係create佐1000個新object 
      }
      long after = System.currentTimeMillis();
      System.out.println(after-before); // 1255 (1.255 second)

      before = System.currentTimeMillis();
      sb = new StringBuilder();
      for (int i = 0; i < 1000; i++) {
        sb.append("a");
      }
      after = System.currentTimeMillis();
      System.out.println(after-before); // ~ 2 ms


      // Literal Pool
      String s1 = "hello";
      String s2 = "hello"; //! "hello" -> reuse original string object in string pool
      System.out.println(s1.hashCode()); //99162322
      System.out.println(s2.hashCode()); //99162322
      System.out.println(s1 == s2);

      s1 = new String("hello"); //! Must create a new String object
      System.out.println(s1 == s2); // false
      
      s1 = String.valueOf("hello"); //!Firtly find in String pool
      System.out.println(s1 == s2); //true
    }
}
