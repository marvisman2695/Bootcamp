
import java.util.ArrayList;

public class DemoArrayList {
  
  public static void main(String[] args) {
      
    String[] names = new String[2];
    names[0] = "John";
    names[1] = "Peter";

    //Array Disadavantages:
    //1. Fixed length (Know the required length before using it)
    //2. Same type of values in the array

    //ArrayList has variable length
    ArrayList<String> names2 = new ArrayList<String>();
    names2.add("John");
    names2.add("Peter");
    names2.add("Susan");

    System.out.println(names2);  // [John, Peter, Susan]
    names2.remove("Peter"); 
    System.out.println(names2); //[John, Susan]
    
    System.out.println(names2.size());//2
    System.out.println(names2.get(1)); // Susan
    System.out.println(names2.get(0)); // John

    System.out.println(names2.isEmpty()); //false
    System.out.println(names2.indexOf("Susan")); //1
    System.out.println(names2.contains("John")); // true
    System.out.println(names2.contains("Peter")); // false

    System.out.println(names2.contains("John") || names2.contains("Susan")); // true



    //Cat class -> ArrayList<Cat>
    //Animal.java ( Cat extends Animanl) ->ArrayList<Animal>
  }
}
