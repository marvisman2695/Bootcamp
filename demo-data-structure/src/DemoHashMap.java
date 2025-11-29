
import java.lang.management.ClassLoadingMXBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class DemoHashMap {
  /**
   * @param args
   */
  public static void main(String[] args) {
      //Key and value
      //fruit organe apple,banana
      // Animal: rabbit, monkey

      ArrayList<String> fruits = new ArrayList<>(List.of("orange", "apple", "banana"));
      ArrayList<String> animals = new ArrayList<>(List.of("rabbit", "monkey"));
      
      //<Key,value>
      HashMap<String, ArrayList<String>> dictionary1 = new HashMap<>();
      dictionary1.put("fruit", fruits);
      dictionary1.put("animal", animals);

      //We use the Key to find corresponding values
      ArrayList<String> listOfFruits = dictionary1.get("fruits");
      System.out.println(listOfFruits);
      ArrayList<String> listOfAnimals = dictionary1.get("animals");
      System.out.println(listOfFruits);

      //Add a new nimal "tiger"
      dictionary1.get("animals").add("tiger");
      //animals.add("tiger");

      animals.add("lion");
      System.out.println(dictionary1.get("anaimals"));
      System.out.println(listOfAnimals);
      ArrayList<String> newArrayList;

      //The definitaion of put()
      //hashMap.put()->if they exists, overraif the value, otherwise, add an new entry
      dictionary1.put("fruits", newArrayList<>(ListOf("Lemon")));
      System.out.println(dictionary1);

      System.out.println(fruits);

      //Exmaple2 : key = Integer, Value=String
      HashMap<Integer,String> classmates = new HashMap<>();
      //
      classmates.put(1,"John");
      classmates.put(2,"Peter");
      
      System.out.println(classmates.get(2)); //Peter
      classmates.put(2, "Mary");
      //
      System.out.println(classmates.get(3));

      System.out.println(classmates.size());
      System.out.println(classmates.isEmpty());
      System.out.println(classmates.get(2));
      System.out.println(classmates.size());

      System.out.println(classmates.remove(0));
      
      //Integer X =1 ;
      //int y = Integer.valueOf(1);

      //For Loop 就係為了做if else, 淘汰
      //:Loop HashMap (loop entries)
      for (Map.Entry<Integer, String> student : classmates.entrySet()) {
        System.out.println("student no=" + student.getKey() + ", student name =" + student.getValue());
      }

      System.out.println(classmates.containsKey(2));
      System.out.println(classmates.containsKey(1));

      System.out.println(classmates.containsValue("Mary"));
      System.out.println(classmates.containsValue("mary"));



    }

}
