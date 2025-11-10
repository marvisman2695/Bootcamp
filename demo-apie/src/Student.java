
import java.time.LocalDate;

public class Student extends Human { //繼承
  //! Static Variable (靜態變量)
  //! 生存另一世界的variable
  //! Student ID 由另一世界去assign
  //! Static 永遠同object 無關係
  public static int counter = 0;

//! Instance variable (物件變量)
  private int id;
  private String name;
  private int candyCount;
  
  // Bonus Question
  private Candy[] candies;
  
  public Student() {
    this.id = ++counter;
    this.candyCount = 0; //果絛友hold住0
    this.candies = new Candy[0];
  }

  // all args contstructor
  public Student(String name) {
    this.id = ++counter;
    this.name = name;
    this.candyCount = 0; //果絛友hold住0
  }

  //Getter
  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public Candy[] getCandies() {
    return this.candies;
  }

  public int getCandyCount() {
    return this.candyCount;
  }

  //Setter
  public void addCandy() {
    this.candyCount++;
  }

  public void setName (String name) {
    this.name = name;
  }

  public void receiveCandy(Candy newCandy) {
    Candy[] newCandies = new Candy[this.candies.length +1];
    int idx = 0;
    for (int i = 0; i <this.candies.length; i++) {
        newCandies[idx++] = this.candies[i];
    }
    newCandies[idx] = newCandy;
    this.candies = newCandies;
  }

  //! By default for Inheritance, child Class ( Student) dont need to rewrite parent method
  // method is 技能,override 係重寫,覆蓋
  @Override
  public double getHeight() {
    System.out.println("Student's getHeight");
    return super.getHeight() /100.0;
  }

  //Access parent's public field
  public LocalDate getParentDob() {
  return super.dateofBirth; // Parent Container expose dateOfBirth directly (public)
  }

  public static void main(String[] args) {
    Student s1 = new Student("John");
    // sysout
    System.out.println(s1.getId()); // 1

    //
    Student s2 = new Student("Steven");
    System.out.println(s2.getId()); // 2
  }

}
