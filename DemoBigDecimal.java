
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {

    System.out.println(0.2+0.1); //
    System.out.println(0.3-0.1);
    System.out.println(0.1*0.2);
    System.out.println(0.3/0.1);

    System.out.println(0.1+0.3); // 0.4

    //Solution (BigDecimal)
BigDecimal bd = BigDecimal.valueOf(0.2);
BigDecimal bd2 = BigDecimal.valueOf(0.1);
BigDecimal bd3 = bd.add(bd2);
System.out.println(bd3.doubleValue()); //0.3

// subtract
BigDecimal d1 = BigDecimal.valueOf(0.3);
BigDecimal d2 = BigDecimal.valueOf(0.1);
BigDecimal d3 = d1.subtract(d2);
System.out.println(d3.doubleValue());

//eg
double x = 0.3;
double y = 0.1;
double result =  BigDecimal.valueOf(x).subtract(BigDecimal.valueOf(y)).doubleValue();
System.out.println(result);

//mulitply
double a = 0.1;
double b = 0.2;
double result2 = BigDecimal.valueOf(a).multiply(BigDecimal.valueOf(b)).doubleValue();
System.out.println(result2);

result4 = BigDecimal.valueOf(0.125).multiply(BigDecimal.valueOf(0.35)).setScale(2,RoundingMode.HALF_UP)
System.out.println(result4);


//divide (non-terminated decimal place)
double e = 10.0;
double f = 3.0;

double result3 = BigDecimal.valueOf(e) 
    .divide(BigDecimal.valueOf(f),2, RoundingMode.HALF_UP) // Half = 5
    .doubleValue();
    System.out.println(result3);



  }
}
