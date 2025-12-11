
// ! Object
public class Cat { //形容緊class 有咩特徵
  // ! Attribute
  private String name;
  private int age;

  //! Constructor (一旦打New 就會觸發佢行一次)
  //!一個class 可以唔只一個constructor
  //! Empty Constructor (No Parameter)
  public Cat() { 
    System.out.println("creating a cat ...");
    this.name = "John"; // 過程中一定會經過此地, 有this 一定要寫
    this.age = 10;
  }
// Method 名唔會同class 名一樣
//! All Arguement Constructor
  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  //!Object Method (instance Method)
  //c1.getName
  public String getName() {
    return this.name;
  }

//! Object Method (intstance Method)
  public int getAge() {
    return this.age;
  }

  public static void main(String[] args) {
    //! Create a cat object (作者,用家都是你)
    // "new" -> create
    //"Cat()" -> calling a constructor
    // "new Cat()" -> create a cat object

    Cat c1 = new Cat();
    System.out.println(c1.name); // John
    System.out.println(c1.age); // 10
    // 全靠c1搵返隻Cat

    new Cat(); //You no longer able to fint the cat object, after creating it.


    Cat c2 = new Cat();
    System.out.println(c2.name); // John
    System.out.println(c2.age); // 10

    c2.name = "Jennie";
    c2.age = 12;

    Cat[] cats = new Cat[] {c1, c2}; //(要放數字)
    System.out.println(cats[1].name); // Jennie
    System.out.println(cats[1].age); //12

    //! Without Class
    String[] names = new String[] {"John", "Jennie"}; // excel colume
    int[] ages = new int[] {10,12}; // excel colum

    //! excel row -> object

    // int, double, boolean, String

    Cat c3 = new Cat("Mary", 8);
    Cat c4 = new Cat(); //John 10
    System.out.println(c3.getAge()); //8
    System.out.println(c4.getAge()); // 10

    System.out.println(c3.getName()); //Mary
    System.out.println(c4.getName()); //John
    
  }
}