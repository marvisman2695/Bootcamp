public enum Direction {
  EAST('E', 1), //
  SOUTH('S', 2), //
  WEST('W', -1), //
  NORTH('N', -2) //
  ; //

  private char value;
  private int label;

  private Direction(char value, int label) {
    this.value = value;
    this.label = label;
  }

  public char getValue() {
    return this.value;
  }

  public int getLabel() {
    return this.label;
  }

  public static Direction valueOf(char value) {
    for (Direction direction : Direction.values()) {
      if (direction.getValue() == value) {
        return direction;
      }
    }
    return null;
  }
  //! Instance method
  public Direction opposite() {
    for (Direction d : Direction.values()) {
      if (d.getLabel()* -1 == this.label) {
        return d;
      }
    }
    return null; // impossible that cannot find
  }

  //!Static method ( check if two diection value are opposite)
  public static boolean isOpposite(Direction d1, Direction d2) {
    return d1.getLabel() * -1 == d2.getLabel();
  }

  public static void main(String[] args) {
    System.out.println(Direction.EAST.opposite()); // WEST
  
  System.out.println(Direction.SOUTH.opposite());//NORTH
  System.out.println(Direction.isOpposite(EAST, WEST));
  System.out.println(Direction.isOpposite(EAST, EAST));
  System.out.println(Direction.isOpposite(SOUTH, NORTH));
  }

}
