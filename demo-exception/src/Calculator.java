

public class Calculator {
  
  public static char firstChar(String str) { //String as parameter, you should consider null, ""
    if (str == null  || str.equals("")) // || if ("".equals(str)); -> able to handle. str is null or ""
      throw new RuntimeException("The parameter cannot be null");  
    else if ("".equals(str)) 
       throw new RuntimeException("The parameter cannot be empty string"); // throw 後面一定係object
      return str.charAt(0);
  }

  public static void main(String[] args) {
    //"" -> Length 0 array
    String input = "";
    
    char result;
    try {    
     result = firstChar(input);
     System.out.println("Check Point 1 ...");
     result = firstChar(null);
    } catch (RuntimeException e) { //! re-cover
      //do something else
        System.out.println("RuntimeException:" + e.getMessage());
    }

    System.out.println("Check Point 2 ...");
     

     try {    
      result = firstChar(null);
    } catch (RuntimeException e) { //! re-cover
      //do something else
        System.out.println("RuntimeException:" + e.getMessage());
    }
    System.out.println(firstChar(null)); // Not Hit
    System.out.println("End of Program.");
  }
}
