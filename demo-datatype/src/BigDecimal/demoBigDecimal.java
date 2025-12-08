package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class demoBigDecimal {
  
  public static void main(String[] args) {
    
    // 0.2 + 0.1
    System.out.println(0.2 + 0.1);

    BigDecimal bd1 = BigDecimal.valueOf(0.2);
    BigDecimal bd2 = BigDecimal.valueOf(0.1);
    BigDecimal result = bd1.add(bd2);

    System.out.println(result);
    System.out.println(result.doubleValue()); // 0.3
    System.out.println(result.longValue()); //0

    //0.3 - 0.1

    System.out.println(0.3 - 0.1); // 0.19999999999999998
    
    //subract()
    bd1 = BigDecimal.valueOf(0.3);
    bd2 = BigDecimal.valueOf(0.1);
    System.out.println(BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1)));
    result = bd1.subtract(bd2);
    System.out.println(result);

    //0.1 * 0.2
    System.out.println(0.1 * 0.2); //0.020000000000000004
    //Multiply()

    result = BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(0.2));
    System.out.println(result); //0.02

    double x = 0.25123;
    double y = 0.15;
    System.out.println(BigDecimal.valueOf(x).multiply(BigDecimal.valueOf(y)).doubleValue());

    System.out.println(BigDecimal.valueOf(x).multiply(BigDecimal.valueOf(y))); //0.04

    //System.out.println(BigDecimal.valueOf(x).multiply(BigDecimal.valueOf(y))
    //.setScale(2, RoundingMode.valueOf(0.5).HALF_DOWN));








    //End
  }
}
