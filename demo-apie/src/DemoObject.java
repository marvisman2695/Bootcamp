public class DemoObject {
  public static void main (String[] args) {
    //!! Parent vs Child
    //! Child object can be assigned to Parent Object reference
  
  // Example :
  String s = "hello";
  // "hello" -. String Object
  Object o1 = "hello";
  Object o2 = new Warrior();
  Circle sh1 = new Circle();

  //Student stu = "hello";
 Object[] things = new Object[3];
    // Warrior
    things[0] = new Warrior();
    // String
    things[1] = new String("hello");
    // Square
    things[2] = new Square(3.4, "BLUE");

  //!!!Polymorphism!!!!!!
  //square -> area
 // things[2].getArea(); // ! runtime OK, but you cannot pass through the compile time
  // things[0].attack(new Warrior());

  //compile time (The time you writing the code)
  Square sq1 = new Square(3.4, "Blue");
  sq1.getArea();
   
 // Shape is an abstract class
    // Object.class -> Shape.class -> Circle.class

  }
}
