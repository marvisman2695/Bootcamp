





public class DemoArray {
  public static void main(String[] args) {
      //The way to store value: Primitives, Wrapper Class, String(17types)

      // New way to store a set of same type of values
      
      // new int[4] -> array object
      int[] arr = new int [4]; //連續4個整數, 前面有[] 先係declare 連續
      //assign values into an array
      arr[0] = 100;
      arr[1] = 70;
      arr[2] = 2_100_000_000;
      arr[3] = -200;

      //! ArrayIndeOutOfBound
     // arr[-1] = -200
     // arr[4] = -200

     // for loop to read array
     for (int i = 0; i < 4; i++) {
         System.out.println(arr[i]);
     }

     // for loop to array 配合得好好

     // long array, with length 3
     long[] arr2 = new long[3];
     //99
     arr2[0] = 99l;
     //5
     arr2[1] = 5l;
     //45
     arr2[2] = 45l;
    for (int i = 0; i < 3; i++) {
      if(arr2[i] % 2 == 0) // 余數係0,意思搵緊even no.
        System.out.println(arr2[i]);
    }
    System.out.println(arr2.length); //3

    //boolean array, with length 4
    boolean [] arr3 = new boolean[4];
    // false
    arr3[0] = false;
    // true
    arr3[1] = true;
    //false
    arr3[2] = false;
    // true
    arr3[3] = true;

    //for loop -> count number of false
    int falseCounter = 0;
    for (int i = 0; i < 4; i++) {
      if (arr3[i] == false) {
        falseCounter++;
      }
    }
    System.out.println("False Count=" + falseCounter);    
   
  
  
    int[] arr4 = new int[5];
    arr4[0] = 10;
    arr4[1] = -4;
    arr4[2] = 90;
    arr4[3] = 100;
    arr4[4] = -20;

    //for lop -. find the max value in arr4
    int max = arr4[0];

    for (int i = 0; i < arr4.length; i++) {
      if(arr4[i] > max) {
        max = arr4[i];
      }
    }
    System.out.println("max=" + max); //100


    // find the index of the max value
    int idxMaxValue = 0;
    int min = arr4[0];
    int idxMinValue = 0;

    for (int i = 0; i < arr4.length; i++) {
      if (arr4[i] > max) {
        max = arr4[i];
        idxMaxValue = i;        
      }
      if (arr4[i]<min){
        min = arr4 [i];
        idxMinValue = i;
      }
    }
    System.out.println("min=" + min);
    System.out.println("minValue=" + idxMinValue);


    // find the min value
    


    // String[]
    String[] names = new String[3];
    names[0] = "John";
    names[1] = "Jennie";
    names[2] = "Steve";
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
        
    }
    // loop: Find name startWith J, print their name
    //startsWith()
    //names -> Array
    //names[i] -> String
       for (int i = 0; i < 10; i++) {
        if (names[i].startsWith("j"));
       }
      for (int i = 0; i < names.length; i++) {
       if (names[i]; indexOf("nn"); f(!= -1));
       }
       System.out.println(names[i]);

       // charAt

       //loop: Find the index of "e" for each name, put them for array
       for (int i = 0; i < names.length; i++) { // Loop Every String (i))
           for (int J = 0; i < names[i].length(); i++) // Loop every Charater in a String (j)
           if(names[i].charAt(J)=='e') 
            
            
            
          // search + count
          String n1 = "Mandy";
          // Count the number of "d"
          int dCount = 0;
          for (int i = 0; i <n1.length(); i++) {
            if (n1.charAt(i) == "d"){
              dCount++;
            }
          }

            
           

      }
  }