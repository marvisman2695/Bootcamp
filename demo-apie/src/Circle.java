public class Circle extends Shape {  //Child
  //! By Default, Child's empty constructor would call Parent's empty constructor
  private double radius;

  public Circle () {
    //super();  
    //! implicitly calling parent empty consrtructor
  }

  public Circle(double radius, String color) {
    super(color);
    this.radius = radius;
  }

  public double getradius() {
    return this.radius;
  }

  public void setradius(double radius) {
    this.radius = radius;
  }

  // get area()
  //Skip Bigdecimal
  public double getArea() {
    return this.radius* this.radius * Math.PI;
  }

  public static void main(String[] args) {
      Circle c1 = new Circle(3.5, "RED");
      Circle c2 = new Circle();

      System.out.println(c1.getColor());
  }
}
