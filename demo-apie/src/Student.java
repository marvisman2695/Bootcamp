
import java.time.LocalDate;

public class Student extends Human { //繼承
  //! Static Variable (靜態變量)
  //! 生存另一世界的variable
  //! Student ID 由另一世界去assign
  public static int counter = 0;

//! Instance variable (物件變量)
  private int id;
  private String name;

  // all args contstructor
  public Student(String name) {
    this.id = ++counter;
    this.name = name;
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }
  public String getName() {
    return this.name;
  }

  public void setName (String name) {
    this.name = name;
  }

  //! By default for Inheritance, child Class ( Student) dont need to rewrite parent method
  // method is 技能,override 係重寫,覆蓋
  @Override
  public double getHeight() {
    System.out.println("Student's getHeight");
    this.getHeight(); 
    return super.getHeight() + this.getHeight();
  }

  public LocalDate getParentDob() {
  return super.dateofBirth; // Parent Container expose dateOfBirth directly (public)
  }


  public static void main(String[] args) {
      Student s1 = new Student("John");
      System.out.println(s1.getId()); //1

      Student s2 = new Student("Vincent");
      System.out.println(s2.getId()); //2
  }
}
