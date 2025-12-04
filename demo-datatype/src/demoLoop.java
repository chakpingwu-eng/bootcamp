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
    for(int i = 0; i < 50; i++){ // 0-49

      System.out.println("hello");

    }

    //0 - 100 

    for(int i = 0; i < 101 ; i++){ // 0-100

      if(i % 2 == 0){

        System.out.println(i);

      }
      
    }

    //0-20 
    //print odd numbers and number > 5

    for(int i = 0; i <= 20; i++){

      if(i > 5 &&i % 2==1){

        System.out.println("print odd numbers and number > 5");

      }

    }

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
    


    //! break

    //the first number between 1 - 50, which is divided by 7.

    int target = -1;
    for(int i = 1; i <= 50; i++) {
      if (i % 7 == 0) {
        target = i;
        break; //break loop
      }
    }
    if(target == -1){
        System.out.println("Not Found");
      }else{
        System.out.println("Target= " + target);
      }


    //! continue -> skip the rest
    for(int i = 0; i < 20; i++){

      if(i % 2 == 0){

        System.out.println("Hello");
        
      }
      continue; //goes to modifier(i++)
    }
    System.out.println("Goodbye!!");

    //1000 lines

    for(int i = 0; i <20; i++){

      if(i % 2 ==0){

        System.out.println("Hello!!");
      }else{

        System.out.println("Hello!!");
        System.out.println("Goodbye!!");

      }
    }

    //Find the largest number < 1000, divided by 7
    target = 0;

    for(int i = 0; i < 1000; i+= 7){

      if(i % 7 ==0){

        target =i;

      }

    }

    System.out.println(target);
    
    int largestNumber = 0;

    while (true) {
      if(largestNumber + 7 >= 1000){

        break;
      }
      largestNumber += 7;
    }

    System.out.println("The largestNumber is " +largestNumber);

    String currentTime = "23:42:00";
    int secondToAdd = 6500;
    int currentHour = (currentTime.charAt(0)- '0') * 10 +(currentTime.charAt(1) -'0');
    System.out.println(currentHour);
    int currentMinute = (currentTime.charAt(3)- '0') * 10 +(currentTime.charAt(4) -'0');
    System.out.println(currentMinute);
    int currentSecond = (currentTime.charAt(6)- '0') * 10 +(currentTime.charAt(7) -'0');
    System.out.println(currentSecond);
    int currentTimeInSecond = currentHour *60 *60 + currentMinute *60+currentSecond;

    int todayTotalSecond = (currentTimeInSecond + secondToAdd) % (24 * 60 * 60);
    System.out.println("Show total " + todayTotalSecond); //5420

    int todayHour = todayTotalSecond / (60 *60); //prefix 0
    int todayMinute = todayTotalSecond % (60*60) / 60; //prefix 0
    int todaySecond = todayTotalSecond % (60*60) % 60;

    String todayHourInString = (todayHour < 10 ? "0": "") + todayHour;
    String todayMinuteInString = (todayMinute < 10 ? "0": "") + todayMinute;
    String todaySecondInString = (todaySecond <10 ? "0" : "") + todaySecond;

    String todayTime = todayHourInString + ":" + todayMinuteInString + ":" + todaySecondInString;

    System.out.println(todayTime);

    int n = 9;
    target = n;

    //Find the index of 'X', -1 if not Found.
    //i.e. Use loop, not indexOf()

    String inputString = "index";
        char targetChar = 'x';
        int foundIndex = 0;

        for (int i = 0; i <= inputString.length(); i++) {
            if (inputString.charAt(i) == targetChar) {
                foundIndex = i +1;
                break;
            }
        }
        System.out.println("在 \"" + inputString + "\" 中，'" + targetChar + "' 的索引是: " + foundIndex);
    
        //out loop
        for(int i = 0; i < 3 ;i++ ){
        //inner loop
          for(int j = 0; j < 3; j++){

            System.out.println("i =" + i +", j=" + j);
          }

          // *
          // **
          // ***
          // ****
        }

        int n1 = 4;
        
        for (int i = 1; i <= n1; i++) {        // 外層：控制第幾行
            for (int j = 1; j <= i; j++) {    // 內層：第 i 行印 i 顆星星
                System.out.print("*");
            }
            System.out.println();             // 換行
        }

    //end
  }
}
