public class Hotel {

  private String name;
  private int room;
  private double rating;

  public Hotel() {
  }

  public Hotel(String name, int room, double rating) {
    this.name = name;
    this.room = room;
    this.rating = rating;
  }

  public String getName() {
    return this.name;
  }

  public int getRoom() {
    return this.room;
  }

  public double getRating() {
    return this.rating;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRoom(int room) {
    this.room = room;
  }
  public void setRating(double rating) {
    this.rating = rating;
  }

  public static void main(String[] args) {

      Hotel h1 = new Hotel("Cordis",665,4.7);
      System.out.println(h1.name);
      System.out.println(h1.room);
      System.out.println(h1.rating);
      System.out.println(h1.getName()+" "+h1.getRoom()+" " +h1.getRating()+"/5 ");
      
      Hotel h2 = new Hotel("Ritz",171,5.0);
      System.out.println(h2.name);
      System.out.println(h2.room);
      System.out.println(h2.rating);

      Hotel h3 =new Hotel("LM", 228, 4.9);
      System.out.println(h3.getName()+" " + h3.getRoom()+" " + h3.getRating()+"/5 ");

      // without Class
      String[] name = new String[] {"Ritz","Cordis"};
      int[] room = new int[] {171,665};
      double[] rating = new double[] {4.7,5.0};
    }  
}
