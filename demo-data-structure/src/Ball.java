import java.util.ArrayList;
import java.util.Collections;

public class Ball implements Comparable<Ball> {
  private Color color;
  private int value;

  public Ball(Color color, int value) {
    this.color = color;
    this.value = value;
  }

  public Color getColor() {
    return this.color;
  }

  public int getValue() {
    return this.value;
  }

  // ! this.ball vs ball
  // Yellow -> Blue -> Red
  // -1 (this), 1 (ball)
  @Override
  public int compareTo(Ball ball) {
    if (this.color == Color.YELLOW)
      return -1;
    if (ball.getColor() == Color.YELLOW)
      return 1;
    if (this.color == Color.BLUE)
      return -1;
    if (ball.getColor() == Color.BLUE)
      return 1;
    return -1;
  }

  public static enum Color {
    RED, YELLOW, BLUE,;
  }

  @Override
  public String toString() {
    return "Ball(" //
        + "color=" + this.color //
        + ", value=" + this.value //
        + ")";
  }

  public static void main(String[] args) {
    Ball b1 = new Ball(Color.RED, 10);
    Ball b2 = new Ball(Color.YELLOW, 20);
    Ball b3 = new Ball(Color.BLUE, 8);

    ArrayList<Ball> balls = new ArrayList<>();
    balls.add(b1);
    balls.add(b2);
    balls.addLast(b3);
    System.out.println(balls);

    // Sort
    Collections.sort(balls); // 
    System.out.println(balls); // [Ball(color=YELLOW, value=20), Ball(color=BLUE, value=8), Ball(color=RED, value=10)]

  }
}