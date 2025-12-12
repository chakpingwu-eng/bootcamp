package ClassEx;

public class JavaQuest5 {

  // Expected output:
  // The index of the last character of c is 11
  public static void main(String[] args) {

    String str = "coding bootcamp."; // You should not change this line
    char target = 'c';
    int charPos = 0; 

    // if found, print "Found."
    // if not found, print "Not Found."
    // code here

    for (int i = 0; i < str.length(); i++) {

      if (str.charAt(i) == target) {

        charPos = i;

        //System.out.println(" It is " + str.charAt(i) + " at " + charPos);

      }

    }
    if (charPos != 0) {
      System.out.println(
          "The index of the last character of " + target + " is " + charPos);
    } else {
      System.out.println("Not Found.");
    }

    //System.out.println(charCount);

  }
}
