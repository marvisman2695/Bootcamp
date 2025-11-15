
//! enum is a more powerful class ()
//1. You CANNOT create enum by yourself
//2. All enum values exists in memory withour object refererence
public enum Color {
  RED('R'),     // calling constructor
  YELLOW('Y'), // calling constructor
  WHITE('W'); // calling constructor

  private char  initial;

  //!constructor (private for enum constructor)
  private Color(char initial) {
    this.initial = initial;
  }

  public char getInitial() {
    return this.initial;
  }

  //search enum value by  attribute (char)
  public static Color valueOf(char initial) {
    for (Color color : Color.values()) {
      if (color.getInitial() == initial) {
        return color;
      }
    }
    // throw error
    return null;
  }


  //!Enum Example is real world:
  //1. Monday Tusedat......
  //2. North, West........
  //3. Dimand, Club...............
  //4. Mr., Ms, Miss.......(drop down list)
  //5. Occupation.......(drop down list)
  //6. 

  //Defintion of Enum;
  // 2. Has to be with finite values
  // 3. Not All/remove often;
}
