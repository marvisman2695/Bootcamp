//! If the object has no color, then the object wont a shape

//! 1. Abstract Class double not allow to create object
//!. Abstract Class allows abstract method
public abstract class Shape { // Parent
  private String color;


//constructor, getter, setter
public Shape() {
System.out.println("shape's empty constructor");
}

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

//! abstract method:
// dont need to present the logic
public abstract double getArea();


}