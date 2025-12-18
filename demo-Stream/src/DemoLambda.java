import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoLambda {
  public static void main(String[] args) {
    //input -> output (method)

    // ! Java 8
    //! Lamda Expression( Fomula)
    // "->" implement the only required  method
    //! "->" is only for Function Interface
    //object 前身係class, 但JAVA8 後就可能唔洗
    MathOperation addition = (x, y) -> x + y;
    MathOperation subtraction = (x, y) -> x - y;

    int result = addition.operate(3, 10);
    System.out.println(result); //13

    System.out.println(subtraction.operate(40, 12)); // 28

    //before java8
    MathOperation additionFormula = new AdditionFormula();
    System.out.println(additionFormula.operate(3, 10)); //13

    //! Built in Lambda Expression
    //1. Function
    //apply(x) method: x * x 
    Function<Integer, Integer>squareArea = (x) ->x * x ;
    System.out.println(squareArea.apply(3));

    Function<String, String>upperFunction = (s) -> s.toUpperCase();
    System.out.println(upperFunction.apply("hello"));

    //! if more than one line, need to use "{}" ad "return" to present implementation
    Function<List<Integer>, Integer> findMaxFunction = (integers) -> {
      int max = integers.get(0);
      for(Integer x : integers) {
        if(x > max)
          max = x;
      }
      return max;
    };

    List<Integer> integers = new ArrayList<>(List.of(9, -8, 100, 4, -55));
    System.out.println(findMaxFunction.apply(integers));

    //2.BiFunction
    BiFunction<String , String, Integer> totalLength = (s1, s2) -> s1. length() + s2. length();
    System.out.println(totalLength.apply("abc", "bootcamp"));

    //3. Consumer
    Consumer<List<String>> printOutStrings = strings -> {
    for (String s : strings) {
      System.out.println(s);
      // In real world, send email / put data into database/ call API, etc.
    }
  };
  printOutStrings.accept(List.of("John", "Mary", "Leo"));

  // 4. Supplier
  Supplier<Integer>markSixGenerater = () -> new Random().nextInt(49) +1;
  System.out.println(markSixGenerater.get()); //1-49

  //1-100
  Function<Integer, Integer> numberGenerator = range -> new Random().nextInt(range) +1;
  System.out.println(numberGenerator.apply(100));

  //5. Predicate (A kinf of Funtion)
  Predicate<Integer> isElderlyFunction = age -> age > 65;
  System.out.println(isElderlyFunction.test(70)); //true

  //6. BiPredicate (A Kind of BiFunction)
  //accept 2 parmeters, return Boolean

  //! What if we have 3 parameters ? and 1 output?
  // Self- build SuperFunction
  SuperFunction<String, String, String> firstCharFunction = (s1, s2, s3) -> {
    return "" + s1.charAt(0) + s2.charAt(0) + s3.charAt(0); 
  };
  System.out.println(firstCharFunction.apply("abc", "ijl", "cde"));

  }
}


