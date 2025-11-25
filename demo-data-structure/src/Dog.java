public class Dog extends Animal {
  private String name;
  private Dog dog;
  
  public Dog(String name) {
  this.name = name;
}

  private  void setNextDog(Dog newDog){
    this.dog = newDog;
  }

  // remove(int index) dog -> dog -> dog
  
  public void add(Dog newDog){ //要用while loop
    //Find the last one (getDog -> null), then setDog(newDog)
  Dog currentDog = this;
    while (currentDog != null) {
      if (currentDog.getNextDog() == null){
        currentDog.setNextDog(newDog);
        break; // break the while loop
      }
   currentDog = currentDog.getNextDog() ;
  }
  }

  public Dog getDog() {
    return this.dog;
  }

  public int size(){
    //loop linkedList structure.
    Dog currentDog = this;
    int count = 0;
    while (currentDog != null) {
      count ++;
   currentDog = currentDog.getDog() ;
  }
  return count;
  }

  public static void main(String[] args) {
      Dog d1 = new Dog("John");
      d1.add(new Dog("Mary"));
      System.out.println(d1.getDog().getName()); //mary
      System.out.println(d1.getDog().getName()); //null
      System.out.println(d1.size()); //2

       d1.add(new Dog("Tommy"));
      System.out.println(d1.getDog().getNextDog().getName()); //mary
      System.out.println(d1.getDog().getName()); //null
      System.out.println(d1.size());
      }
    }
