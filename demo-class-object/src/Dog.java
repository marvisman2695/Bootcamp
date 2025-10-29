//! Class 作者 write down the ways to access(read-getter & write-setter) the attribute values

public class Dog {
//! Attribute
private double weight;
private double height;

//!constructor
//! empty constructor, all args constructor
public Dog() {

}

public Dog(double weight, double height) {
  this.weight = weight; //任你define的過程
  this.height = height; //任你define的過程
  this.bmi = (weight * height)/2;
}

//! getter for weight and height
public double getWeight() {
  return this.weight;
}

public double getHeight() {
  return this.height;
}
public double getBmi() {
  return this.bmi;
}


//! setter (update attribute values)
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

    d2.weight = 102;
    d2.height = 78;

    //! double primitive default value = 0.0
    Dog d3 = new Dog();
    System.out.println(d3.getHeight()); //0.0
    System.out.println(d3.getWeight()); // 0.0

}

}
