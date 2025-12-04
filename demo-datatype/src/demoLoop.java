public class demoLoop {
  
  public static void main(String[] args) {
    
    int x = 3;

    x *= 3;
    x *= 3;
    System.out.println(x);

    x = 3;
    //for(initialization; critria to continue; modifier)
    for( int i = 0; i < 4 ; i++ ){

      x *= 3;

    }
    System.out.println(x); //243

    //Step 1: i = 0
    //Step 2: i < 4 ? Yes
    //Step 3: x *= 3
    // Step 4: i++, i -> 1
    //Step 5: i < 4 ? Yes
    // Step 6: x *= 3
    //Step 7: i++, i -> 2
    //Step 8: i < 4 ? Yes
    //Step 9: x *= 3
    //Step 10: i++, i -> 3
    //Step 11: i < 4 ? Yes
    //Step 12: x *= 3
    //Step 13: i++, i -> 4
    //Step 14: i < 4 ? No -> exit loop

     // print 50 hello
    /*for(int i = 0; i < 50; i++){ // 0-49

      System.out.println("hello");

    }*/

    //0 - 100 

    /*for(int i = 0; i < 101 ; i++){ // 0-100

      if(i % 2 == 0){

        System.out.println(i);

      }
      
    }*/

    //0-20 
    //print odd numbers and number > 5

    /*for(int i = 0; i <= 20; i++){

      if(i > 5 &&i % 2==1){

        System.out.println("print odd numbers and number > 5");

      }

    }*/

    // leap year
    // divided by 100, not a leap year, unless divided by 400 (i.e. 2000 is a leap year)
    // i.e. 2100 is not a leap year, 2004 is a leap year

    int year = 2100;
    boolean isLeapYear = false;
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          isLeapYear = true; // 2000
        }
      } else {
        isLeapYear = true; // 2004
      }
    }
    System.out.println(isLeapYear);
    
    isLeapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    System.out.println(isLeapYear);

    //sum up 1 -100

    int sum_num = 0;

    for(int i = 0; i < 100; i ++){

      sum_num += i;

    }

    System.out.println(sum_num);

    //The number of values between 1 -100 divided by 6.
    int divided_six = 0;

    for(int i = 1; i <= 100 ; i++){

      if(i % 6 == 0){

        divided_six++;

      }

    }

    System.out.println("The number of values between 1 -100 divided by 6. "+ divided_six);

      //convert 1-100 to char values, then concat them together

      String result = "";
    for(int i = 1; i <= 100 ; i++){

    
    result+= (char) i; //String + any type of value -> String


    }
    System.out.println(result);
    
      
    //end
  }
}
