public class demoPrimitive {
  public static void main (String[] args){

    //整數 integer
    //from right to left (put value 3 into a box x)
    // ! Declaration(declare the type of x)
    // ! Assignment(Assign value 3 into x)
    int x = 3;
    System.out.println(x); //3
    // ! Re-assignment
    //replace the box value by 100

    x =100;
    System.out.println(x);// 100

    x =-200;
    System.out.println(x);

    //Number with decimal
    double y = 3.14159;
    double z = 3.0;

    // ! Assign 10(int) into double box, convert 10 to 10.0
    double a = 10; // still ok for integer


    System.out.println(y);//3.14159
    System.out.println(z);//3.0
    System.out.println(a);//10.0 (not 10)

    //! Cannnot assign decimal number into int box
    //int k = 10.5; //準確地方配資源，對記憶體資源嚴謹，期望開發者能夠預判資源。

    //char(character) 0 - 65xxx
    char h = 'e';

    System.out.println(h); // e

    //reassign value k
    h = 'k';
// ! sysout + Enter (VSCode)
    System.out.println(h); // k

    h = '你';
    System.out.println(h); //你

    //boolean
    boolean isElderly = true; //java開發者只會在細階英文開頭命名。好似寫文章咁命名
    boolean isMarried = false;
    boolean isAdult = true;

    System.out.println("isMarried" + isMarried); // isMarried = false
    System.out.println("isAdult" + isAdult); // isAdult = false
    System.out.println("isElderly" + isElderly); // isElderly = false

    //整數  (int, byte, short, long)
    //Range: -128 to 127

    byte b1 = 127;
    System.out.println(b1);
    //byte b2 = 128; // out range
    //byte b3 = -129; //out range

    // ! 32767 is an int value
    // ! There is not byte value and short value in java
    //Range: -32678 to 32767
    short s1 = 32767;
    System.out.println(s1);
    //short s2 32768;
    short s3 = -32768;
    System.out.println(s3);

    int L1 = 2_100_000_000;
    System.out.println(L1);
    //int i2 = 2_200_000_000;

     //! In real life, by default we use int for integer
    //long -> 2^63
    long L11= 1270;
    System.out.println(L11);
    //Assign long value into int box(NOT OK)
    //int l1 = 1270L;

    //Decimal Number (float, double)
    //3.5(double value) -> float box(unsafe)
    //float f1 = 3.5;

    double d1 = 3.5;
    //float f1 = d1; //unsafe java只睇type，不會上文下理

    // ! 3.5f is a float value
    // ! 3.5 is a double value
    // !3.5d is a double value
    //Assign float value into float box
    float f2 = 3.5f;
    //assign float value into double box
    double d2 = 3.5f;

    //Declaration
    int j;

    //System.out.println(j); // You cannot read the box without assigning value (Compile time)
    //Assign
    j = 10;

    System.out.println(j);
  }
}
