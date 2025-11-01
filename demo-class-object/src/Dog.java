//! Class 作者 write down the ways to access(read-getter & write-setter) the attribute values
// ! Method Defintion: Presentation
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dog {
//! Attribute
private double weight;
private double height;

//!constructor - 一定係public
//! empty constructor, all args constructor
public Dog() {

}

//! What is the meaning og "this"?
public Dog(double weight, double height) {
  this.weight = weight; //任你define的過程
  this.height = height; //任你define的過程
}
//! java 認參數,
//! Duplicated : the number of parameter and the type of the parameters of them are same
//public Dog(double weight) {
//  this.weight = weight;
//}

public Dog(double height) {
  this.height = height;
}

//! getter for weight and height
public double getWeight() {
  return this.weight;
}

public double getHeight() {
  return this.height;
}

// ! Method 都一定係public
// ! A presentation of weight and height
public double getBmi() {
  BigDecimal heightSquare = BigDecimal.valueOf(height) //
  .multiply(BigDecimal.valueOf(height)) //
  .setScale(2, RoundingMode.HALF_UP);

  return BigDecimal.valueOf(this.weight) //
  .divide(heightSquare, 2, RoundingMode.HALF_UP)
  .doubleValue();
}


//! setter (update attribute values)
//! setWeight and setHeight method name are difference, thus they can exist tgt
public void setWeight(double weight) {
  this.weight = weight;
}

public void setHeight(double height) {
  this.height = height;
}


public static void main(String[] args) {
    Dog d1 = new Dog(11,23);
    System.out.println(d1.getWeight());
    System.out.println(d1.getHeight());

    Dog d2 = new Dog(78, 102);
    System.out.println(d2.getWeight());
    System.out.println(d2.getHeight());


    //! double primitive default value = 0.0
    Dog d3 = new Dog();
    System.out.println(d3.getHeight()); //0.0
    System.out.println(d3.getWeight()); // 0.0


    System.out.println(d1.getBmi());
    System.out.println(d2.getBmi());


}
}