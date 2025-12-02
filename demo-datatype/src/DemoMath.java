public class DemoMath {
  public static void main(String[] args) {
    // + - * / %

    int remainder = 10 % 3;
    // % -> The remainder of division 找餘數

    System.out.println(remainder);

    remainder = 99 % 7;

    System.out.println(remainder);

    int a = 7;
    System.out.println(a + 9); //16
    System.out.println(a - 3); // 4
    System.out.println(a * 7); // 49
    System.out.println(a / 7); //1


    //Step 1: a + 10 ->17(int + int -> int value)
    //Step 2: Assign int value (17) into int box
    a = a + 10;
    System.out.println(a); // 17

    //Step 1: int + double
    
    int b = 8;
    //Step 2: Assign double value into double box
    System.out.println(b+ 3.5d);
    //double r = b + 3.5d;

    //! Operation between higher level type and lower level type -> Result: higher level type
    long k = 3 * 100L;
    //int t = 3* 100L; // int * long -> long, cannot assign to int box
    //! byte -> short -> int -> long -> float -> double
    float f1 = 10L;
    System.out.println(f1);
    byte b10 = 9;
    short s10 = 9;
    // ! Special Case: byte + short ->int
    // Short s20 = b10 + s10;
    int s20 = b10 + s10; //OK
    System.out.println(s20);

    //char -> int


  }
}
