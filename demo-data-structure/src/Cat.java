import java.util.ArrayList;
import java.util.Objects;

public class Cat extends Animal {
  private String name;

@Override
  public String getName(){
    return super.getName();
  }

public Cat(String name) {
  this.name = name;
}

@Override
public boolean equals(Object obj) {
  if(this == obj)
    return true;
  if (!(obj instanceof Cat))
    return false;
  Cat c1 = (Cat) obj;
  return Objects.equals(this.name, c1.getName());
}

@Override
public int hashCode() {
  return Objects.hash(this.name);
}

@Override
public String toString() {
  return "Cat(" //
    + "name=" + this.name//
    + ")";
}

public static void main(String[] args) {

  Animal[] a1 = new Animal[3];
  a1[0] = new Cat("Meow");
  a1[1] = new Cat("Kitten");
  a1[2] = new Dog("Haru");

  ArrayList<String> a2 = new ArrayList<String>();
  a2.add("Whisky");
  a2.add("Sushi");
  a2.add("Max");

  System.out.println(a2);
  System.out.println(a2.contains("Sushi"));
  a2.remove("Max");
  System.out.println(a2.contains("Max"));
  System.out.println(a2.indexOf("Whisky"));
  }
}

