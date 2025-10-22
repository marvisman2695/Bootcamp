public class DemoWrapperClassII {
  public static void main(String[] args) {
      //! Dont use == for Wrapper Class

      //! -120 to 127 ->cache
      Integer i10 = Integer.valueOf(127);
      Integer i11 = Integer.valueOf(127);
      System.out.println(i10 == i11);// true
      System.out.println(i10.equals(i11)); //true

      Integer i12 = Integer.valueOf(128);
      Integer i13 = Integer.valueOf(128);
      System.out.println(i12 == i13); //f
      System.out.println(i12.equals(i13)); //t

      //!!Integer 永遠要用equals,compareTo, 不要用==
      // ! Integer -120 - 127

      //Short, Byte, Long
      Long l10 = Long.valueOf(128);
      Long l11 = Long.valueOf(128);
      System.out.println(l10 == l11);
      System.out.println(l10.equals(l11));

      Boolean b10 = true; // auto - box
      Boolean b11 =  new Boolean(true); // 一定開新盒
      Boolean b12 = Boolean.valueOf(true); 
      Boolean b13 = Boolean.valueOf(true);

      System.out.println(b12 == b11); // f 不應用== 因為已assign
      System.out.println(b12 == b13); //t 不應用==

  }
}
