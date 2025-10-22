
import java.util.Scanner;

public class DemoMath {
  public static void main(String[] args) {
    double r = Math.pow(2, 4.0); //16.0
    System.out.println(r);


    System.out.println(Math.ceil(3.1)); //4.0
    System.out.println(Math.floor(3.9)); //3.0

    System.out.println(Math.PI); //3.141592.....


  //In Java, we dont havr byte value and short value
  //assign int value into short value
  short s1 = 1;   //safe
  int x = 1;
  //short s2 = x; // unsafe (risky)


  long l1 = 100L;
  long l2 = 100; // promotion ; int -> long

  //float f2 = 1.5; // double value -> float variable (risky)
  float f1 = 1.5f;
  double d1 = 1.5d;

  System.out.println((Math.abs(-3))); //3
  System.out.println(Math.abs(4));  //4


  int score = -4;
  System.out.println(Math.max(0, score));

  int score1 = 130;
  System.out.println(Math.min(100, score1));

  System.out.println(Math.round(0.11234)); //0
  System.out.println(Math.round(0.6559)); //1

  double d10 = 0.12742;
  System.out.println(Math.round(d10*1000)/ 1000.0); //0.127


  System.out.println(Math.random());

//Scanner
Scanner s = new Scanner(System.in);
System.out.println();
int input = s.nextInt();
int result = input * 3;
System.out.println("result=" + result);
  }
}
  

