
import java.util.Objects;



public class Bird {
  private String name;
  private int age;

  public Bird(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
   return this.name;
  }

  public void setAge(int age) {
  this.age = age;
  }
  
  public void setName(String name) {
    this.name = name;
  }

 // ! Three -> MUST Override instance Methods
  @Override
  public String toString () {
    return "Bird(" //
    +"name=" + this.name //
    +",age=" + this.age //
    +")";
}

//! Method Signature = method name + paremeter list
@Override //@override -> verify if parent has this method
public boolean equals(Object o) { //== object 地址
  // ! this vs o
  // if name and age are same. then must be the same bird
  if (this == o) { // if memory object are same,
    return true;
  }
  if (!(o instanceof Bird)) {
    return false;
  }
  // this -> bird object, o -> bird object
  Bird bird = (Bird) o;
  return this.name.equals(bird.getName())//
  && this.age == bird.getAge();
}

//! The definition of equals() and hashCode() must be SAME.
// int -2.1b -> 2.1b
// "hello" vs "hello1" -> they have a different hash code.
@Override
public int hashCode() { //Jave case sensitive "C" not "c"
  return Objects.hash(this.name, this.age);
}
//!!有s class 係代表static method

public static void main(String[] args) {
    Bird b1 = new Bird("John", 3);
    Bird b2 = new Bird("John", 3);
    System.out.println(b1.equals(b2)); // t
    System.out.println(b1.hashCode() == b2.hashCode()); //t

    b2.setAge(10);
    System.out.println(b1.equals(b2)); //f
    System.out.println(b1.hashCode() == b2.hashCode()); //f


}

}
