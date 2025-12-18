import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoLambda2 {
  public static void main(String[] args) {
    //Java 5
    // Generic -> ArrayList<String>

    //Java 8
    //Lambda -> data Structure advance featucre 
    //Lambda -> ???

    List<Square> squares = List.of(new Square(3.5), new Square(7.0), new Square(2.3));
    //before Lambda
    for (Square square : squares) {
      System.out.println(square.area());
    }
    //Lambda
    squares.forEach(s-> System.out.println(s.area()));

    Map<Charater, String> fruitMap = new HashMap<>();
    fruitMap.put('a', "apple");
    fruitMap.put('b', "banana");

    fruitMap.computeIfAbsent('a', c ->"kiwi");
    System.out.println(fruitMap);
    
      


  }
}
