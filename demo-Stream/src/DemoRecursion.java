

public class DemoRecursion {
  public static void main(String[] args) {
    //n =5
    // 1+2 +3 + 4 +5
    int sum = 0;
    for (int i = 0; i <= 100; i++) {
      sum += i;
    }
    System.out.println(sum);

    System.out.println(sum(100));

    System.out.println(sum2(10));
    // positive  Number
  }

  // ! Tail Recursion (method call itself)
  public static int sum(int n) { 
    //!Extra Criteria
    if(n<= 1)
      return 1;
    return n+ sum (n-1); //! call itself
  }
  // 100 + sum (99)
  //99 + sum (98)
  //....
  //2 + sum (1)
  // return 1

}
   public static void order (String[] customrs )
if (idx <0)
  int indx = customrs.lengtth - 
  return ;
  } 

  public static void order (String;{} customers) {
    // ! recursion
    order (customers. idwx -1)

  }
}
