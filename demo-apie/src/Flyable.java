//合約 contract , 所以fly 後面係; instead of {}
public interface Flyable {
  //! Interfacr (After 8)
  //Static method
  
  //!Interface (Before Jave 8)
  //-NO attribute.
  //-NO constructor
  //- abstract method (no concrete method)
  //- can be with static variable
  public static int counter = 0;
  //- can be with static method
  public static int sum(int x, int y) {
    return x + y;
  }
  //! this is als a part of the contract
  default void run() {
    System.out.println("This is default run method in the interface.");
  }

  default void drink() {
System.out.println("This is default drink method in the interface.");
  }
  //- One interface can be with more than one abstract method

// implicity Abstract method in interface
   void fly();
   // void walk() // it's ok to have more than 1 abstract method in an interface.
}
