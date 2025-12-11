
import java.math.BigDecimal;
import java.util.Arrays;

//!Purposr: String 1 vs String (Try to simulate String Design)
public class String1 {
  private char[] values; //我點草都可以
   
  //constructor
  public String1(String str) {
    this.values = new char[str.length()];
    int idx = 0;
    for (char c : str.toCharArray()){
      this.values[idx++] = c;
    }
  }
 
  //! Control / Presentation
  //length()
  public int length() {
    return this.values.length;
  }


  //charArt(int index) return char
  public char charAt(int index){
    return this.values[index];
  }
  
  //substring(...)
  //! revise this.value?? NO!!!
  public String1 substring(int fromIndex, int endIndex) {
    String str = "";
    for (int i = fromIndex; i < endIndex; i++) {
      str +=this.values[i]; //String + char -> Strin //!String 加任何野都係string
      //記住唔好改變自己this value
    }
    return new String1(str);
  }

  // replace(...)
  //! Revise itself?? NO!
  public String1 replace(char fromChar, char byChar) {
    String str = "";
    for (char c :this.values) {
      if (c == fromChar) {
        str += byChar;
      } else {
        str += c;
      }
    }
    return  new String1(str);
  }



  //equals(String1 s)
  //!!Early Return (coding pattern)
  public boolean equals(String s) {
    //1.different length -> false
    if (this.values.length != s.length()) {
      return false;
    }
    //2.compare their char values, if any of them are not same -> return false
    int idx = 0;
    for (char c : s.toCharArray()) {
      if (this.values[idx++] !=c) {
        return false;
      }
    }
    return true;
  }

  public char[] getValues() {
    return this.values;
  }

  public String toString() {
    return new String(this.values);
  }



public static void main(String[] args) {
  BigDecimal bd = new BigDecimal("2.5");

    String1 s1 = new String1("hello");
    String s2 = "hello";
    

    System.out.println(s1.equals(s2)); //t
    System.out.println(s1.equals("hello")); //f
    System.out.println(s1.equals("Hxllo")); //f

    System.out.println(Arrays.toString(s1.substring(1, 3).getValues())); //e, l
    System.out.println(s1.substring(1, 5)); //el

    System.out.println(Arrays.toString(s1.replace('e', 'x').getValues())); //[h, x, l, l, o]
    System.out.println("hello".replace('e', 'x')); // hxllo


    //!system.out.println() -> call object's toString ()
    System.out.println(s1.replace('e', 'x')); //hxllo
    System.out.println(BigDecimal.valueOf(3.5)); //3.5
 }
}
