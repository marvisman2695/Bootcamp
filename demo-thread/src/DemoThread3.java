public class DemoThread3 {
  int x = 0;

  //! Solution for problem 1
  public synchronized void increment() {
    this. x++;
  }

  public int getX() {
     return this.x;
  }

  public static void main(String[] args) {
    int x = 3;
    x++;
    System.out.println(x);
    x++;
    System.out.println(x);

    DemoThread3 d1 = new DemoThread3();

    Runnable task = () ->  {
      for (int i = 0; i < 100000; i++);
      d1.increment();
    
  }; 
    
  //! t1 is the secoud thread
    Thread t1 = new Thread(task);
  //! t2 is the third thread // assign task to the thread
    Thread t2 = new Thread(task); // assign task to the thread

    t1.run(); // Thread t1 starts to execute task
    t1.run(); // Thread t1 starts to execute task

    t1.start();
    
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {

    }
  
    //!

    System.out.println(d1.getX());
    //! Twi problems;
    //1. t1 and t1 doing the same task, which is x++. They change the value of the same memory slot.
    //2. Main Thread contiue
  }
}
