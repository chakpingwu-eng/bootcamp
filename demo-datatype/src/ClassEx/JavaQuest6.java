package ClassEx;

public class JavaQuest6 {

  // Expected output:
  // 0 1 1 2 3 5 8 13 21 ...
  public static void main(String[] args) {

    int printTime = 15;
    int first = 0, second = 1, next =0;

    // for loop to print first 15 numbers in Fibonacci Sequence

    for(int i = 0; i < printTime; i++){

      next = first + second;

      System.out.print(first + " ");

      first = second;
      
      second = next;

    }
    

  }
}
