// ! Class -> blueprint(模), file (harddisk)
// ! Object
public class Cat { //形容緊class 有咩特徵
  // ! Attribute
  private String name;
  private int age;

  //! Constructor
  public Cat() { 
    System.out.println("creating a cat ...");
    this.name = "John"; // 過程中一定會經過此地, 有this 一定要寫
    this.age = 10;
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
  }
}