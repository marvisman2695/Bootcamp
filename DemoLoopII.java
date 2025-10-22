
public class DemoLoopII {
  public static void main(String[] args) {
    // flow -> if-else
    // loop (for-loop, while)

    int x = 3;
    x *= 3;
    x *= 3;
    System.out.println(x);

    // for-loop
    // (initialization; continue criteria; modifier)
    for (int i = 0; i < 3; i++) { // 3次
      System.out.println("Hello");
    }
    // Step 1: int i = 0
    // Step 2: i < 3 ? Yes
    // STep 3: print hello
    // Step 4: i++ (i=1)
    // Step 5: i < 3 ? Yes
    // STep 6: print hello
    // Step 7: i++ (i=2)
    // Step 8: i < 3 ? Yes
    // STep 9: print hello
    // Step 10: i++ (i=3)
    // Step 11: i < 3 ? NO
    // Step 12: Exit

    // loop -> 0,1,2,3,4,5 -> total=15
    int total = 0;
    for (int i = 0; i < 6; i++) {
      total = total + i; // total += i
    }
    System.out.println("total=" + total);

    // for loop + if (1-10, print odd number only)
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 1) {
        System.out.println(i);
      }
    }

    // sum up all even numbers between 0-20
    int sum = 0;
    for (int i = 0; i < 21; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    System.out.println(sum); // 110
    
    // 0-100, sum up all number that is divided by 3
    sum = 0;
    for (int i = 0; i < 101; i++) {
      if (i % 3 == 0) {
        sum += i;
      }
    }
    System.out.println(sum); // 1683

    // 0-50, the difference between the sum of all even number and the sum of all odd number
    int evenSum = 0;
    int oddSum = 0;
    for (int i = 0; i < 51; i++) {
      if (i % 2 == 0) {
        evenSum += i;
      } else {
        oddSum += i;
      }
    }
    int evenOddDiff = evenSum - oddSum;
    System.out.println(evenOddDiff); // 25

    // 0-20, sum up all even numbers; 21-50, sum up all odd numbers
    // Find the product of both total numbers
    evenSum = 0;
    oddSum = 0;
    for (int i = 0; i < 51; i++) { // non-business meaning (the number of times)
      if (i <= 20) { // business meaning, explicit numbers aligns the requirements.
        if (i % 2 == 0) {
          evenSum += i;
        }
      } else if (i >= 21 && i <= 50) {
        if (i % 2 == 1) {
          oddSum += i;
        }
      }
    }
    System.out.println(evenSum * oddSum); // 57750
  }
}

