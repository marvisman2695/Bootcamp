public class DemoWrapperClass {
  public static void main(String[] args) {
    // 8 Primitives
    //Each Primitive Type has its corresponding Wrapper Class

    //int -> Integer
    //short -> Short
    //long -> Long /
    //byte -> Byte
    //char -> Charater /
    //boolean -> Boolean /
    //float -> Float/
    // dobule -> Double /

    Integer x = 3; //this is the box
    int y = 3; // ! storing the value itself only

    double x2 = x. doubleValue();
    System.out.println(x2); //3.0
    System.out.println(x); //3
    String x3 = x.toString(); 

    x = null; //null value 
    // byte b1 = x. byteValue();
    //  x. toString();

    // y = null;
    int k;
    //System.out.println(k); // ! assign value before reading the variable
    // !! Naver use i , j , k as local variable 
    Integer i1 =7;
    Integer i2 = 8;
    System.out.println(i1 == i2); // Interger == Integer -> int ==int
    System.out.println(i1.equals(i2));
    System.out.println(i1.compareTo(i2));
    //i1係有功能,物件來的,而不是數字

    //只要係Primitive, 可以大細過
    // >=, >
    System.out.println('a' >95); // true

    i1 = 200;
    byte b2 = i1.byteValue(); // similar to down casting
    System.out.println(b2); // -56

    // Character
    Character c1 = 'a'; // auto - box (prmitive value -> wrapper class object)
    char c2 = c1; //un - box

    System.out.println('a'); //0
    System.out.println('c'); //-2
    System.out.println('a'); //true

System.out.println(c1.compareTo('a'));
System.out.println(c1.compareTo('c'));
System.out.println('x');


// check Lowercase
char c3 ='a';
// approach 1
if (c3 >= 97 && c3 <= 122) {
System.out.println("c3 is  a lowaercase letter.");
}
  // approach 2
  System.out.println(Character.isLowerCase(c3)); // true
  
// Doble 
Double d1 = 1.5;
Double d2 = d1;


// conver into int? Interger?
int i10 = d1.intValue();
System.out.println(i10);


// 3 ways to create an obj of Integer
Integer i20 = Integer.valueOf(9);
Integer i21 = new Integer(9);
Integer i22 = 9;

//Primitive
//int x-=3
// we call "x" as varaible, while 3 is int vale\ue

//not- Primirtive (Class)
// string s = hello
// we call "s" as broject reference, while "hello" is an String ibject



 }
}
