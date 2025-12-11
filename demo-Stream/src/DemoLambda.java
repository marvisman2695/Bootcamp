public class DemoLamda {
  public static void main(String[] args) {
    //input -> output (method)

    //! Lamda Expression( Fomula)
    MathOperation addition = (x, y) -> x + y;
    MathOperation subtraction = (x, y) -> x - y;

    int result = addition.operate(3, 10);
    System.out.println(result); //13

    System.out.println(subtraction.operate(40, 12)); // 28

    //before java8
    MathOperation.additionFormula = new AdditionFormula();
    System.out.println(additionFormula.operate(3, 10)); //13
  }
}
