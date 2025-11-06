
import java.awt.Label;
import java.time.LocalDate;
import java.time.chrono.ThaiBuddhistEra;

public class Human { //呀媽
  //priviate Double weight;v// Object (can be null)
  private double weight; // primiate vaule (default value = 0.0)
  private double height; // primiate vaule (default value = 0.0)

public LocalDate dateofBirth;


public Human() {

}
public Human(double weight, double height, LocalDate dateofBirth){
  this.weight = weight;
  this.height = height;
  this.dateofBirth = dateofBirth;
}

public double getWeight() {
  System.out.println("Human's getWeight");
  return this.weight;
}
public double getHeight() {
  System.out.println("Human's getHeight");
  return this.weight;
}
public LocalDate getDateOfBirth() {
  return this. dateofBirth;
}

public void setWeight(double weight) {
  this.weight = weight;
}
public void setHeight(double height) {
  this.height = height;
}
public void setDateOfBirth(LocalDate dateoofBirth) {
  this.dateofBirth = dateoofBirth;
}

public static void main(String[] args) {
  Human h1 = new Human(73.0, 176.0);
  Human h2 = new Human();
  System.out.println(h2.getHeight()); //0.0

  Student s1 = new Student("John");
  s1.setHeight(180);
  s1.setWeight(72.5);
  s1.setName("jennie");
  System.out.println(s1.getHeight());
  System.out.println(s1.getWeight());
  System.out.println(s1.getName());

  Human h3 = new Human(78,181, LocalDate.of(2024,10,31)); //年月日
  System.out.println(h3.getDateOfBirth() .getMonth());
  
  LocalDate ld1 = LocalDate.of(2000, 1, 31);
  System.out.println(ld1.plusWeeks(2L));
  System.out.println();

  //!! Most of the clasee design wont revise itself value(i.e)
  //!!abstract, 無得new 呢個class- Human
}
}
