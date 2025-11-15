public class DemoPolymorphism {
  public static void main(String[] args) {
      //1. Compile Time (java file -> class file)
      //Mainpurpose of Parent Class / Interface
      Shape shape1 = new Circle(3.4, "RED");
      System.out.println(shape1.getArea2());//! Follow the reference type (Shape) to deteremine if the method can be called
      
      System.out.println(((Circle) shape1).getArea2()); //! Risky (Because  the object can be Square in Ling 5);
      //!But we can avoid the risk by using "instaneOf"
      
      // Advantages;
      Shape[] shapes = new Shape[2];
      shapes[0] = new Circle(3.2,"WHITE");
      shapes[1] = new Square(3.2, "YELLOW");
      //! the area calculatihape1.getArea()); //! Because the referene type (Shape) has getArea()
      //System.out.println(son is decoupled. "Open-Close" -> coding prinple
      double total = 0.0;
      for (Shape shape: shapes) {
        total += shape.getArea();
      }
      System.out.println(total);
      
       // 2. Run Time
    // ! shape.getArea() -> runtime polymorphism

    int i1 = (int) 3.3;
    System.out.println(i1);
  }
}