//! If the object has no color, then the object wont a shape

//! 1. Abstract Class double not allow to create object
//!. Abstract Class allows abstract method
public abstract class Shape { // Parent
  private String color;


public Shape() {
System.out.println("shape's empty constructor");
}

//constructor, getter, setter
public Shape(String color) {
  System.out.println("shape's all args constructor");
  this.color = color;
}

public String getColor() {
  return this.color;
}

public void setColor (String color) {
  this.color = color;
}

//! abstract method: dont need to present the logic
public abstract double getArea();

@Override
  public String toString() {
    return "Shape(" //
        + "color=" + this.color //
        + ")";
  }

@Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Shape))
      return false;
    Shape shape = (Shape) o;
    return this.color.equals(shape.getColor());
  }

  // ! Parent Class can be return type.
  public static Shape getShape(int value) {
    if (value == 1) {
      return new Square(1.0, "WHITE");
    } else if (value == 2) {
      return new Circle(2.5, "White");
    }
    return null;
  }
  }
