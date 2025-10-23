
import java.math.BigDecimal;

public class DemoLooopII {
  public static void main(String[] args) {
      //Basic
      for (int i = 0; i <5; i++) {
        System.out.println(i);
      }

      // while loop
      //! must not use i, j, k
      int counter = 0;
      while(counter < 5){
      System.out.println(counter);
      counter++;
      }

      //Array //!一定有s
      double[] amounts = new double[4];
      amounts[0] = 10.5;
      amounts[1] = 100.9;
      amounts[2] = 24.33;
      amounts[3] =1010.9;

      //for-each loop //!read only //A simple presentation of loop
      for (double x : amounts) {
        System.out.println(x); //read operation
        //x = 100; //! wrong idea for write operation
      }
      //basic  // !write //萬能
      for (int i = 0; i < amounts.length; i++) {
        System.out.println(amounts[i]);
        //amounts[i] = 100; // ok, write operation
      }

      //!!!!important sum up values
      double total = 0.0;
      for (double amount : amounts) {
        total = BigDecimal.valueOf(total).add(BigDecimal.valueOf(amount)).doubleValue();
       } 
       System.out.println("total=" + total);

  }
}
