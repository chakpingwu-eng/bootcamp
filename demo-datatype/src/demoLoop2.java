public class demoLoop2 {
  public static void main(String[] args) {
    
    // print 3 hello
    for(int i = 0; i < 3; i++){

      System.out.println("Hello");

    }

    // name = "Mary", print every character of the name.
    for(int i = 0; i <= 10; i++){

      System.out.println(i);
    }

    String name = "Mary";

    for(int i = 0; i < name.length(); i++){

      System.out.println(name.charAt(i));

    }

    //principal = 1000.0, interest 3% per year, calculate the total amount after 3 years

    double principal = 1000.0, interestRate = 0.03, growth_factor;
    int year = 3;

    for(int i = 0; i < year; i++ ){

      growth_factor = 1 + interestRate;

      principal *=  growth_factor;
      
    }

    System.out.println(principal);

    //1-20, sum up all odd numbers and sum up all even numbers separately. Find the product of them.

    int oddNum = 0 , evenNum = 0, productNum = 0;
    for(int i = 0; i < 20; i ++){

      if (i % 2 == 1) {
                oddNum += i;
            } else {
                evenNum += i;
            }

    }
    productNum = oddNum * evenNum;
    System.out.println("The odd numbers is " + oddNum);
    System.out.println("The even numbers is " + evenNum);
    System.out.println("The product of them is " + productNum);


    //result -> "1/2/3/4/5"
    for (int i = 1; i <= 5; i++) {
            System.out.print(i); 
            if (i < 5) {
                System.out.print("/");
            }
        }
        System.out.println();
    

    //given a string llello, count the number of 'l'

    name = "llello";
    int count = 0;
    char target = 'l';

    for(int i =0; i < name.length(); i++){

      if(name.charAt(i)== target){

        count++;
      }
    }

    System.out.println("the number of l = " + count);

    //"Hello", count the number of capitial letter (upper case letter)

    name = "Hello";
    count = 0;

    for(int i = 0; i < name.length(); i++){
    //if(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') //Other method
      if(Character.isUpperCase(name.charAt(i))){
        count++;
        }
      }
      System.out.println("Hello, the number of capitial letter (upper case letter) :" +count);

    //print 1 4 9 16 25 ... 100

    int perfectSquares = 0;

      for(int i = 1; i*i <= 100; i++){

        perfectSquares= i*i;

        System.out.println(perfectSquares);
        if(i*i <= 100){

        }
      }
      System.out.println();

      //The Solution of Mr Vincent Lau.
      /*for(int i = 1 ; i <= 10; i++){

        System.out.println( i*i);

      }*/

    //given a string "apple", count the number of character a, e, i, o ,u

    name = "apple";
    char charA = 'a', charE = 'e', charI = 'i', charO = 'o', charU = 'u';
    int numCharA = 0, numCharE = 0, numCharI = 0, numCharO = 0, numCharU = 0;

    for(int i = 0; i <name.length(); i++){

      if(name.charAt(i) == charA){numCharA++;}
      if(name.charAt(i) == charE){numCharE++;}
      if(name.charAt(i) == charI){numCharI++;}
      if(name.charAt(i) == charO){numCharO++;}
      if(name.charAt(i) == charU){numCharU++;}
    System.out.println(name.charAt(i));
    }
    System.out.println("the number of character a + " + numCharA);
    System.out.println("the number of character e + " + numCharE);
    System.out.println("the number of character i + " + numCharI);
    System.out.println("the number of character o + " + numCharO);
    System.out.println("the number of character u + " + numCharU);

    //given a string "hello", print "hello", "hell", "hel", "he", "h"

    name = "hello";
    for(int i = 0; i <name.length(); i++){

      System.out.println(name.substring(0, name.length() - i)); //1st round substring(0, 5 - 0 -1)

    }


    //Given Passward = "abcd@1234XYZ"

    String password = "abcd@1234XYZ";
    boolean isLengthValid = password.length() >= 12;
    boolean withCapitialLetter = false, withSpecialChar = false;


    for(int i = 0; i < password.length(); i++){

      if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'){

        withCapitialLetter = true;
      }

      if(password.charAt(i) == '@' || password.charAt(i) == '#' ||
         password.charAt(i) == '$' || password.charAt(i) == '!' ||
         password.charAt(i) == '.'){

          withSpecialChar = true;

         }

      if(withCapitialLetter && withSpecialChar)
        
      {
        break;
      }

    }

    boolean isPasswordValid = isLengthValid && withCapitialLetter && withSpecialChar;
    System.out.println("Is Password Valid? " + isPasswordValid);


    //Check if the password is valid. Result is boolean.

    //1. length >= 12
    //2. With at least one capitial letter
    //3. With at least one speical character @#$!

    //Given a string s1 = "abc5uk20fs", move all numbers to another string.
    //s1 = "abc5uk20fs" -> s2 = 520
    String s5 = "abc5uk20fs";
    String newString = "";
    for (int i = 0; i < s5.length(); i++) {
      if (s5.charAt(i) >= '0' && s5.charAt(i) <= '9') {
        newString += s5.charAt(i);
      }
    }
    System.out.println(newString);


    //Encrypt Password. "abcd" -> Alogorithm: ASCII + 3 -> "defg"
    System.out.println('a' + 3); // char + int -> int
    String origPassword = "abcd";
    String encryptedPassword = "";
    for (int i = 0; i < origPassword.length(); i++) {
      encryptedPassword += (char) (origPassword.charAt(i) + 3);
    }
    System.out.println("Encrypted Password=" + encryptedPassword);



    //end
  }
}