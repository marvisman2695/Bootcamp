public class Hotel {

  private String names;
  private int rooms;

  public Hotel() {
    System.out.println("locating the hotel...");
    this.names = "Ritz";
    this.rooms = 171;
  }
  public static void main(String[] args) {

      Hotel h1 = new Hotel();
      System.out.println(h1.names);
      System.out.println(h1.rooms);
      

      Hotel h2 = new Hotel();
      System.out.println(h2.names);
      System.out.println(h2.rooms);

      h2.names = "Cordis";
      h2.rooms = 665;
      
      Hotel[] hotels = new Hotel[] {h1, h2};
      System.out.println(hotels[2].names);
      System.out.println(hotels[2].rooms);
    

      // without Class
      String[] names = new String[] {"Ritz","Cordis"};
      int[] rooms = new int[] {171,665};

    }  
}
