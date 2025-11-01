public class Person {
  private Eye[] eyes;

  // API "E" (Encapsulation)
  public Person() {
    this.eyes = new Eye[2]; // !Array Object
    this.eyes[0] = new Eye("BlACK");
    this.eyes[1] = new Eye("BlACK");
  }

  public void setLeftEye(Eye eye) {
    this.eyes[0] = eye;
  }


//getLeftEye
public Eye getLeftEye() {
  return this.eyes[0];
}

  public static void main(String[] args) {
    Person p1 = new Person();
    Eye e1 = new Eye("RED");
    p1.setLeftEye(e1);

    //p1.setLeftEye(new Eye("YELLOW"));
    e1.setColor("ORANGE");

    System.out.println(p1.getLeftEye().getColor()); //YELLOW

  }
}
