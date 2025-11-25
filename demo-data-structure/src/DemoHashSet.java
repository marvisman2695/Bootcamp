import java.util.HashSet;

public class DemoHashSet {
  
  public static void main(String[] args) {
    HashSet<Cat> cats = new HashSet<>();
    
    cats.add(new Cat("John"));
    cats.add(new Cat("Mary"));
    cats.add(new Cat("Tommy"));
    
    //!HashSet is from"Hash" family, most of the method from Hash Data Structure use both equals() & hashCode()
    cats.remove(new Cat("John"));
    
    System.out.println(cats.size()); //2

    System.out.println(cats.contains("John")); //false

    System.out.println(new String("hello").equals(new String("hello"))); // t
    
    //!why do we nees HashSet?
    //-Avoid duplicated
    //at the same time, remove duplicated

    //equals() and hashCode()
    boolean result = cats.add(new Cat("Tommy"));
    System.out.println(result); //f

    result = cats.add(new Cat("Steven")); //! HashSet add -> loop
    System.out.println(result);// t
  }
}
