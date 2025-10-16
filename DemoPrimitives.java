public class DemoPrimitives {
  // Raw Type
  // We have 8 Primitives (byte, short, int, long, float, double, char, boolean)
  
  // short cut: main
  public static void main(String[] args) {
    // ! Integer
    // int, long, short, byte
    int x = 3;
    System.out.println(x); // 3
    
    x = 10; // Re-assignment
    System.out.println(x); // 10

    byte b1 = 3;
    byte b2 = 127; // max value of byte
    byte b3 = -128; // min value of byte
    // byte b4 = -129;
    // byte b4 = 128;

    short s1 = 32767; // max
    short s2 = -32768; // min
    // short s3 = 32768;
    // short s4 = -32769;

    // ! By Default, we use int for 99% scenario.
    int i1 = 2147483647; // max
    int i2 = -2147483648; // min

    // 2^63 - 1 (max)
    // -2^63 (min)
    long l1 = 10;
    long l2 = -21;

    // ! Decimal
    // double, float

    // 10.123456789 -> double value
    // double > float (precision)
    double d1 = 10.123456789;

    // ! Java (Assign double value to float variable -> error)
    // float f1 = 10.123456789;

    // 10.123456789f -> float value
    float f1 = 10.123456789f;
    double d2 = 10.123456789f;

    double d10 = 10.3;

    // error, not because of the actual value, but the type
    // float f10 = d10; // risk -> error (Step1: risky)


    // ! char (single character)
    // 'a' is a char value
    // assign char value into char variable
    // single quote '' for char value
    char c1 = 'a';
    String s10 = "a ";

    char gender = 'F';
    char grade = 'A';

    // For primitives comparison, ==, >=, <=, !=, >, <
    System.out.println(gender == grade); // false
    System.out.println(gender != 'M'); // true
    
    int score = 73;
    System.out.println(score > 70); // true

    double savingAmount = 400.5;
    System.out.println(savingAmount > 100); // true

    // boolean
    int age = 19;

    // age >= 18 -> event
    boolean isAdult = age >= 18;
    boolean b10 = false;

  }
}