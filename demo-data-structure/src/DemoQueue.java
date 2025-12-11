
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.print.DocFlavor;

public class DemoQueue {
  public static void main(String[] args) {
    Queue<Integer> q1 = new LinkedList<>();
    q1.add(10);
    q1.add(3);
    q1.add(300);
    System.out.println(q1.size()); //3
    //q1. get(10);

    System.out.println(q1.poll()); //
    System.out.println(q1.size()); //

    System.out.println(q1.contains(250)); //
    System.out.println(q1.peek()); //
    System.out.println(q1. size()); //

    //COMMNON USAGE
    while(!q1.isEmpty());
    System.out.println(q1.poll());




    List<Integer> l1 = new LinkedList<>();
    l1.add(10);
    l1.add(3);
    l1.add(250);
    System.out.println(l1. get(1)); //3
    l1.addFirst(50);

    Queue<String> q2 = new ArrayDeque<>();
    q2.add(20);
    q2.add(11);

  
  }
  }


  