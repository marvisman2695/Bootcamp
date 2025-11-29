
import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
  
  abstract double area();

  public static double totalArea(ArrayList<Shape> shapes) {
  double total = 0;
    for(Shape shape : shapes) {
      total += shape.area();
    }
    return total;
  }

  //! for static mathod of generic,
  //! we have to define the range of T
public static<T extends Shape> double totalArea2(ArrayList<T> shapes) {
    double total = 0;
    for(Shape shape : shapes) {
      total += shape.area();
    }
    return total;
}

  public static void main(String[] args) {
    ArrayList<Shape> shapes = new ArrayList<>();
    shapes.add(new Circle(3));

    for (Shape shape : shapes) {
      System.out.println(shape.area());
  } 

    System.out.println(totalArea(shapes));

    System.out.println(totalArea2(shapes));
 
    //! The difference between totalArea() and totalArea2()
    ArrayList<Circle> circles =
    new ArrayList<>(List.of(new Circle(3), new Circle(4)));
    System.out.println(totalArea2(circles));

    //System.out.println(totalArea(circles)); // complie time error
    //! because ArrayList<Shape> has different type. comparing to ArrayList<Circle>
   //The de
  }
}
