public class Panda {
  private Color color;

  //!ENUM AS Parameter is contstructor -> Enscapsulation
  private Panda(Color color) {
    this.color = color;
    }

    public Color getColor() {
      return this.color;
    }

    public static void main(String[] args) {
       Panda p1 =  new Panda(Color.RED);
       Panda p2 =  new Panda(Color.WHITE);
        //new Panda("RED");
      
        //check if p2 is RED?
        //! we use == for comparing enum volue
        if (p2.getColor() == Color.RED) {
          System.out.println("the Panda p2 is RED.");
        }

        //搵返RED個location, 個
        Color color = Color.valueOf('R');
        System.out.println(color); //RED

          // Direction
        Direction direction = Direction.valueOf('N');
        System.out.println(direction); //North
      }
}