//! extends can be used once per class, but class can implement multiple interfaces
public class Superman extends Human implements Flyable, Eatable{
  //implement 後面一定係verb, 
  //只有parent and child 會用noun

  // When you explicity write a contrustot, iimplies that you dont need the empty contrustor;
  public Superman(double weight, double height) {
    super(weight, height);
  }
  
  // Verb
  @Override
  public void fly() {
  System.out.println("superman is flying..");
  }

  @Override
  public void eat(){
    System.out.println("superman is eating..");
  }

  public static void main(String[] args) {
      Eatable[] things = new Eatable[2];
      // ! Those Class, implemented Eatable, can be assigned into Eatable[]
      things[0] = new Superman(3.4, 71);
      things[1] = new Student("John");
      
      for (Eatable e: things) {
        e.eat();
      }

    Flyable[] things2 = new Flyable[2];
    things2[0] = new Superman(3, 7);
    // things2[1] = new Student("Peter");

    Flyable[] things3 = new Flyable[2];
    things3[0] = new Superman(10, 90);
    things3[1] = new Superman(9, 23);

    for (Flyable thing : things3) {
      thing.fly();
      thing.run();
    }  
  } 
}
