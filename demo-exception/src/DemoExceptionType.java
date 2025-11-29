public class DemoExceptionType {
  public static void main(String[] args) {
    //Math
    int count = 0;

    char result;
    try {
      double average = 10 / count; // we should use  if-else to avoid
    } catch (ArithmeticException e) {
    System.out.println("cannot / by Zero");
    }

    //array
    int[] arr = new int[2];
    arr[0] = 100;
    arr[1] = 300;

    int idx = 2;

    try {
        arr[idx] = 1000;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array Index Out of Bound");
    }

    //Example 3
    try {
        String s = "hellosss";
        s.charAt(s.length());
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("String Index Out of Bound");
    }
  }
}
