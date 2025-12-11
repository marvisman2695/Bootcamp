import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoBigO {
  public static void main(String[] args) {
    //O(n2 + n ) -> O(n2)
    int n = 10;
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            // if else
        }
    }
    for (int i = 0; i < 10; i++) {
        
    }
  // DSA 
  List<String> names = new ArrayList<>();
  names.add("Mary");
  names.add("Tommy");
  names.add("Jenny");
  System.out.println(names.get(2));

  Queue<String> nickNames = new LinkedList<>();
  //Queue<String> nickNames = new ArrayDeque<>();
  nickNames.add("Leo");
  nickNames.add("Johnny");
  nickNames.add("Oscar");
  nickNames.poll();
  
  }
}
