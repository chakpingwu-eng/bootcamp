public class demoLoop2 {
  public static void main(String[] args) {
    
    for(int i = 0; i < 3; i++){

      System.out.println("Hello");

    }

    for(int i = 0; i <= 10; i++){

      System.out.println(i);

    }

    String name = "Mary";

    for(int i = 0; i < name.length(); i++){

      System.out.println(name.charAt(i));

    }

    //principal = 1000.0, interest 3% per year, calculate the total amount after 3 years

    double principal = 1000.0, interest = 0.03, growth_factor;
    int year = 3;

    for(int i = 0; i < year; i++ ){

      growth_factor = 1 + interest;

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

    System.out.println(count);

    //"Hello", count the number of capitial letter (upper case letter)

    name = "Hello";
    count = 0;

    for(int i = 0; i < name.length(); i++){

      if(Character.isUpperCase(name.charAt(i))){

        count++;

        }
      }

      System.out.println("Hello, count the number of capitial letter (upper case letter) :" +count);

    //print 1 4 9 16 25 ... 100

    int perfectSquares = 0;

      for(int i = 1; i*i <= 100; i++){

        perfectSquares= i*i;

        System.out.println(perfectSquares);
        if(i*i <= 100){

        }
      }

      System.out.println();

      
    //given a string "apple", count the number of character a, e, i, o ,u

    name = "apple";

    for(int i = 0; i <name.length(); i++){

      

    }

    //given a string "hello", print "hello", "hell", "hel", "he", "h"

    //Given Passward = "abcd@1234XYZ"

    //Check if the password is valid. Result is boolean.

    //1. length >= 12
    //2. With at least one capitial letter
    //3. With at least one speical character @#$!

    //Given a string s1 = "abc5uk20fs", move all numbers to another string.
    //s1 = "abc5uk20fs" -> s2 = 520

    //Encrypt Password. "abcd" -> Alogorithm: ASCII + 3 -> "defg"




    //end
  }
}