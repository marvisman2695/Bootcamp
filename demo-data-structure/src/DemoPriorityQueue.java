
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
  Queue<String> pq = new PriorityQueue<>();
  pq.add("steven");
  pq.add("Alex");
  pq.add("Cathy");

  //Priority Queue hs no ordering during add proess
System.out.println(pq); //alex

System.out.println(pq.poll()); // Alex
pq.add("Ben");
System.out.println(pq.poll()); // Ben
System.out.println(pq.poll()); // Cathy
System.out.println(pq.poll()); // Steven

//Example 2
  Queue<Integer> integers = new PriorityQueue<>(new DemoArraySort.SortByDesc());
   integers.add(100);
   integers.add(120);
   integers.add(50); // 50,100,120
   System.out.println(integers.poll()); // 120
   integers.add(80);
   System.out.println(integers.poll()); //100
   System.out.println(integers.poll()); //80
   System.out.println(integers.poll());//50
  }

  public static class SortByDesc implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
      return i1> i2? -1 : 1;
    }
  }
}
