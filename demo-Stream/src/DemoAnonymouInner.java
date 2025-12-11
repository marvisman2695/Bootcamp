public class DemoAnonymouInner {
  
  public interface Flyable {
    void fly();
  }

public static class Superman implements Flyable {
  @Override
  public void fly() {
    System.out.println("Superman is flying .....");
  }
}

  public static void main(String[] args) {
    Flyable s1 = new Superman();
    s1.fly();

    //Anonymous Inner Class
    // 可以唔寫class, 不過只係one off, 自私用
    Flyable s2 = new Flyable() {
      @Override
      public void fly() {
        System.out.println("superman is Flying....");
      }
    };
    s2.fly();
  }
}
