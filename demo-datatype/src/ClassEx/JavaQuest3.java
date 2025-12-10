package ClassEx;

/**
 * Expected Output: * Expected Output://
 * J //
 * e //
 * 3 //
 * 9 //
 * 10 //
 * ab c //
 * VenturenixLAB, Coding //
 * 19 //
 * ren //
 * VENTURENIXLAB, JAVA //
 * venturenixlab, java //
 * V*NTUR*NIXLAB, JAVA!!! //
 */
public class JavaQuest3 {

  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // prints J
    for(int i = 0; i < str.length(); i ++){

      if(str.charAt(i) == 'J'){

        System.out.println(str.charAt(i));
        break;

      }
    }

   // prints e (the 1st e)
    // code here ...

    int target_pos = 0;
    for(int i = 0; i < str.length(); i++){

      if(str.charAt(i) == 'e'){

        i++;
        target_pos = i;

        System.out.println("The position is " +target_pos + " is e " + " ,"+ "the 1st e is " + i);

        break;
      }
    }

    // Use indexOf()
    // prints 3
    // prints 9
    // prints 10
    // code here ...

    System.out.println(str.indexOf('t'));

    System.out.println(str.indexOf('x'));

    System.out.println(str.indexOf('L'));

    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"
    System.out.println(abc.trim());

    // Use String replace() method
    // prints VenturenixLAB, Coding
    // code here ...

    String replaceWord = str.replace("Java", "Coding");
    System.out.println(replaceWord);

    // int length()
    // prints 19
    // code here ...

    int getLength = 0;

    getLength = str.length();

    System.out.println(getLength);

    // Use String substring(int start, int end)
    // prints "ren"
    // code here ...

    int start = 5, end = 8;

    String target_sub = str.substring(start, end);
    System.out.println(target_sub);

    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    // code here ...

    


  }
}
