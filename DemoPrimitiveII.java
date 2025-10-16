public class DemoPrimitiveII {
  public static void main(String[] args) {
      //Overflow
      short s1 = 30000;
      short s2 = 31000;
      short s3 = (short) (s1+s2); //short+short ->int, byte +byte ->int, byte +short -> int
      System.out.println(s3); //32xxx -> +1 -> -32xxx
      //overfloat

      int i1 = 2_100_000_000;
      int i2 = 100_000_000;
      int i3 = i1 + i2;
      System.out.println(i3); // -2_0xx_xxx_000

      double k1 = 2_100_000_000;
      double k2 = 100_000_000;
      double k3 = k1 + k2;
      System.out.println(k3); 

      // ! Promotion (upcasting)
      //byte->short -> int -> long -> float -> double
      byte b1 = 10;
      short s4 = b1;
      int i10 = s4;
      long l10 = i10;
      float f10 = l10;
      double d10 = f10;

// ! downcasting
float f11 = (float) 10.5d;
long l12 = 2_200_000_000l;
int i11 = (int)l12; // You confirmed the risk
System.out.println(i11);



//char -> int



  }
}
