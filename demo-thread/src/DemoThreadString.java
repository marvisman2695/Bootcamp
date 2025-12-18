public class DemoThreadString {
  private String s = "";

  //! Fix
  public void add(String str) {
    this.s += str;
  }

  public String getS() {
    return this.s;
  }

  public static void main(String[] args) {
    DemoThreadString ts = new DemoThreadString();

    Runnable task = () -> {
      for (int i = 0; i < 200_000; i++) 
          ts.add("a");
    };
  
      Thread t2 = new Thread(task);
      Thread t3 = new Thread(task);

      t2.run();
      t3.run();

      t2.start();
      t3.start();

      try {
          t2.join();
          t3.join();
      } catch (InterruptedException e) {
      
      }

      System.out.println(ts.getS().length());

    
    //task
    //add a 100_000 times

    //2 thread 
    //s.length() ->200_ 000
    
    }
    }