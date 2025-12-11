
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
  private Queue<String> hkids;

  private Queue1(Queue<String> hkids) {
    this.hkids = hkids;
  }

  public static Queue1 ofArray() {
    return new Queue1(new ArrayDeque<>());
  }

  
  public static Queue1 ofLinkedList() {
    return new Queue1(new LinkedList<>());
  }

  public boolean add(String hkid) {
    return this.hkids.add(hkids);
  }
  }

