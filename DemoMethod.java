public class DemoMethod {
  public static void main(String[] args) {
      //method (function)\
      int x = 10;
      int y = x + 3; // f(x) = y
      System.out.println(y); //13

     //! Method Caller
     int result = sum(50,99);
     System.out.println("result=" + result); // 149

     //-3 + 99
     //100+20000
     //!有機會overflow as String + String

     // Testing
       System.out.println(totalLength("hello","leo")); // 8
       System.out.println(isValidString("hello world")) ; // true
       System.out.println(isValidString("helloworld")); // false
       System.out.println(multiplyResult(10)); //30
       System.out.println(multiplyResult(11)); //22

       int[] arr = new int[] {100,-4, 999, 40};
       System.out.println(findMax(arr)); //999

       String[] names = new String[] {"Allen", "Steven", "Jennie"};
       System.out.println(countStringPattern(names)); //1
  }

 //! metheod
  //method
  //1. sum -> method name
  //2.(int x, int y) -> parameter, function 入口
  //3. int -> return type 出口類型
  public static int sum(int x, int y) {
    int result = x + y;
    // return result; 
    return x+y;
    }

    // Design Method : Given two String. sum up their legnth, ant return it
    public static int totalLength(String s1, String s2) {
      // String s1 = "Steven";
      // String s2 = "Vincent";
      // int totalLength = s1.length() + s2.length();
      return s1. length() + s2. length();
      // return totalLength;
    }
   
    // Design Method; Given a String Value, check if its length > 10, return true/ false
    //if it is even number, reutrn this number *3
    // boolean use "is, has"
    public static boolean isValidString(String s1) {
      // boolean result;
      // if (s1.length() > 10) {
      // result = true;
      // } else if {      
      // return result; or
      return s1.length() >10;
    }
    
    //Design Method : Given an int value, if it is odd number, reutnr this number = 2;
    // if it is even number, return this number * 3
    public static int multiplyResult(int x) {
      // int result;
      // if (x % 2 == 1) {
      // result = x *2;
      // } else {
      // result = x * 3;
      //}
      // return result;
      return x % 2 == 1 ? x * 2 : x * 3; //! statement -> true, return x * 2, otherwise x * 3
    }

    // Design Method: Given an int array. find and retun the max value.
    public static int findMax(int[] arr) {
      int max = arr[0];
      for (int i = 0; i < arr.length; i++) {
      // if (arr[i] > max) {
         //max = arr[i] ;
        // }
        max = Math.max(arr[i], max);
      }
      return max;
    }

    // Design Method: Given a String array, count the number of String value that contain "ll"
    public static int countStringPattern(String[] arr) { // 要count 數
      int count = 0;
      for (String s : arr) {
        if (s.contains("ll")) {
          count++;
        }
      }
      return count;
    }
}
