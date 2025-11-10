import java.util.Arrays;
import java.util.Random;

public class Teacher {
  public static int candyCount = 23;
  private static final String[] CANDY_COLORS = new String[] {"RED", "BLUE", "YELOW"}; // 0,1,2

  //Bonus Question
  private Candy[] candies;

  public Teacher(int candyCount) { // new Teacher(23)
    //random color -> BLUE, RED, YELLOW
    this.candies = new Candy[candyCount];
    for (int i = 0; i< this.candies.length; i++) {
      String randomColor = CANDY_COLORS[new Random().nextInt(3)];
      this.candies[i] = new Candy(randomColor);
    }
    // System.out.println("Candies=" + Arrays.toString(this.candies));
  }


  public void distributionAll(Student[] student) { // ! given Students array
    int candyIdx = 0;
    while(candyIdx < this.candies.length) { // teacher's candy (0 - 36)
    for (Student student : students) {
       Candy candy = this.candies[candyIdx];
      this.candies[candyIdx] = null;  // removed teacher's candy
      this.distribute(student, candy);
      if (++candyIdx >= this.candies.length){
        break;
           // teaher's candy?
    //remove the teacher's candy
    //call distrube
      }
    }
  }
    this.candies= new Candy[0];  // clear teacher's candy array
  }  
    
    //!Studnet hold住student array
   // student.receiveCandy(candy);
   public void distribute(Student student, Candy candy) {
    student.receiveCandy(candy);
  }

  public static void main(String[] args) {
      //OOP
      //5 Students, 23 Candy
      // 5.5.5.4.4
       // Algorithm (算法) -> loop + if + break -> Performance (Time Complexity) / Space Complexity
      Student[] students = new Student[] {new Student(), new Student(), new Student(), new Student(), new Student()};
      while(candyCount >= 0) { // counting 22-> 0) -> 23times
        //System.out.println(candyCount);//22
        for (int i = 0; i < students.length; i++) {
            if(--candyCount < 0) { // 23->1
              break; // break 個for loop
            }
            students[i].addCandy();
        }
        //after break
        // while(candyCount > 0){
        // for (int i = 0; i <students.length; i++) {
        //     if (candyCount-- <= 0) 
        //     break;
        // }
      }
      System.out.println(students[0].getCandyCount()); //5
      System.out.println(students[1].getCandyCount()); //5
      System.out.println(students[2].getCandyCount()); //5
      System.out.println(students[3].getCandyCount()); //4
      System.out.println(students[4].getCandyCount()); //4 
      
      //Student id = 3rd, candy count?

      //!Bonus (Teacher.java, Candy.Java, Student.Java)
      //Without using static candyCount, we use teacher object to hold 23 candy
      // candy Object with color, distributr to 5 students

      //!Candy.java (color), Teacher (candy) -> distrubute , Student (candy) -> receive Candy
      //Candy (ownership)
      // Answer: Finally, teacher no candy. Each Student has his own Candy with different color  }
      Student[] students2 = new Student[] {new Student(), new Student(), new Student(), new Student()};
      Teacher t1 = new Teacher(37);
      t1.distributionAll(students2);
      System.out.println(Arrays.toString(students2[0].getCandies()));
      System.out.println(Arrays.toString(students2[1].getCandies()));
      System.out.println(Arrays.toString(students2[2].getCandies()));
      System.out.println(Arrays.toString(students2[3].getCandies()));
  }
}

