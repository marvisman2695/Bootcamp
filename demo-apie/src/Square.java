
import java.math.BigDecimal;


public class Square extends Shape {
  private double length;
  

  public Square(double length, String color) {
    super(color);
    this.length = length;
  }

  public double getLength(){
    return this.length;
  }


  //! As a child class, you have to implement parent's abstract method
  @Override
  public double getArea() {
    return this.length * this.length;
  }

  @Override
  public String toString() {
    return "Square(" //
        + "length=" + this.length //
        // + ",color=" + super.getColor() //
        + ",shape=" + super.toString() + ")";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Square))
      return false;
    Square square = (Square) o;
    return this.length == square.getLength() //
        && super.equals(square);
  }


  public static void main(String[] args) {
      //!why do we need parent class(inheritane)?
      //1 share common attribute
      //2 Shape[], but not only Circle[] or Square[]

      //The type of array can be Parent Class;
      //which allows storing the child object
      Shape[] shapes = new Shape[3];
      shapes[0] = new Circle(3.5, "WHITTE");
      shapes[1] = new Square(5.0, "BLACK");
      shapes[2] = new Circle(2.3,"YELLOW");
      

      //calculate the total area of all shapes
      BigDecimal total = BigDecimal.ZERO;
      for (Shape shape : shapes) {
      // ! Java just look at the class, see if there is the method (getArea)
      // In other words, Shape.class has no getArea (Originally)
      // shape.getArea()

      // ! After having abstract method in Parent Class,
      total = total.add(BigDecimal.valueOf(shape.getArea()));
    }
    System.out.println(total); // ~80.1

    Square s1 = new Square(3.4, "BLACK");
    System.out.println(s1); // Square(length=3.4,shape=Shape(color=BLACK))

    }
}
