import java.util.Arrays;

public class demoArray3 {
  public static void main(String[] args) {
    //10, 25, 3, 48, 57
    //print all numbers
    int number[] = new int[]{10, 23, 3, 48,57};

    for(int i = 0; i < number.length; i++){

      System.out.println(number[i]);

    }

    //scores 23, 44, 67, 88, 91, 12
    //loop -> print all even numbers

    int scores[] = new int[]{23, 44, 67, 88, 91, 12};
    for(int i = 0 ; i < scores.length ; i++){

      if(scores[i] % 2 == 0 ){

        System.out.println("Number of evenNum is " + scores[i]);

      }

  }

    //Prices the median, 34, 78, 12, 89, 45, 99, 23

    int medianRange[] = new int[]{34, 78, 12, 89, 45, 99, 23};
    int medianNum = 0, totalNum = 0;
    for(int i = 0; i <= medianRange.length; i++){

      totalNum = i;
      medianNum = (totalNum + 1)/2;

    }
    System.out.println(" " + medianRange[medianNum]);

    //prices 99.9, 13.8, 9.9, 1200.0
    //quantities 3, 10, 12, 20
    //amounts (amount = price * quantity)

    double[] prices = new double[]{99.9, 13.8, 9.9, 1200.0}; 
    int[] quantities = new int[]{3, 10, 12, 20};
    double[] amounts = new double[prices.length];
    for(int i = 0; i < prices.length; i++){

      amounts[i]= prices[i] * quantities[i];

    }

    System.out.println(Arrays.toString(amounts));






    //1. Username is NOT Found.
    //2. Password is wrong.(Scenario: Username is found.)
    //3. Login success.


    //ages 16, 66, 18, 37
    //genders 'M', 'F', 'M', 'F'
    //smokers false, true, true, false

    //baseFee = 100

    //1.Smaker -> +20% fee
    //2. age > 60 -> +30% fee
    //3. genders female -> +5% fee

    //calculate fees

    //toCharArray()

    String staff = "John";
    char[] chs = staff.toCharArray();
    System.out.println(Arrays.toString(chs));

    //end
  }
}
