
import java.util.LinkedList;

public class DemoLinkedList {
  
  public static void main(String[] args) {
    //!LinkedList vs ArrayList
    //1.add() (add to tail) : LinkList has little advantage
    //2.size, should store the current size
    //3. get(), ie.find the 10th elements in the list .(ArrayList should be faster)
    //4.contains(), loop ->similar
    //5. remove(), ie. remove "John" -.similar


    LinkedList<Cat> cats = new LinkedList<>();
    cats.add(new Cat("John"));
    cats.add(new Cat("Mary"));
    cats.remove(new Cat("John"));

    System.out.println(cats.size()); //1
    System.out.println(cats);

    System.out.println(cats.contains("Mary")); // false
    System.out.println(cats.contains("John")); // t

  }
}
