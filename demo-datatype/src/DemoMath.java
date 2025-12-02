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

    int result = 10/3;
    System.out.println(result); //3

    int englishScore = 87;
    int mathScore = 72;
    int historyScore = 34;
    //step 1 : (int + int + int)/ int -> int (answer: 64)
    // step 2: assign int value 64 int double box ->64.0
    double averageScore = (mathScore + englishScore + historyScore) / 3.0; //! fix -> divde by 3.0
    System.out.println(averageScore); //64.33333

    //System.out.println(10/0); //error

    //int count = 0;
    //System.out.println(10/ count); //error

    //0.1 + 0.2
    System.out.println(0.1 + 0.2);
    //char -> int
    double d1 = 0.1;
    double d2 = 0.2;
    double d3 = d1 + d2; //double 不能用於加減乘除
    System.out.println(d3); //0.30000000000000004
    System.out.println(0.2+0.2); //0.4

    //! Never use double variable (變量) for Math Operation (+,-,*,/)
    //! Solution: BigDecimal(We teach later..)
    //! Overflow

    int i10 = 2_100_000_000;
    int i11 = i10 + 100_000_000;
    //! for primitive (int, long), it will not error after math operation even it exceed the upper/ lower limit.
    
    //! Step 1: int +long -> long(No overflow)

    System.out.println(i11);
    long L10 = i10 + 100_000_000L;
    System.out.println(L10); //2200000000

    //char -> int(ASCII)
    char n = '1';
    int v2= n;
    System.out.println(v2); // 97
    
    //A
    long l20 = 3;
    int v4 = '你';
    System.out.println("v4"+ " = " + v4);

    int v5 = 20330;
    //! Cannot assign higher level value into lower level type.

    int value = 'A'; //char  -> int

    long l30 = 2_100_000_000L;

    int v10 = (int) l30;//自負盈虧
    System.out.println(v10);

    //65 -> A

    int v11 = 65;
    char c80 = (char)v11;
    System.out.println(c80);//A

    int v12 = 65620;
    char c81 = (char) v12;
    System.out.println(c81);

    System.out.println("直接印: " + c81);                    // 可能會變 ?
        System.out.println("碼點十六進位: " + Integer.toHexString(c81)); // 一定印 1170
        System.out.println("碼點十進位: " + (int)c81);           // 一定印 4464
        System.out.printf("用 printf: %c%n", c81);              // 可能還是 ?
        System.out.println("強制顯示名稱: " + Character.getName(c81));

        int v = 65620;
        System.out.println("原始 int 二進位: " + Integer.toBinaryString(v));
        // 輸出: 10000000001010100   (只有18位，因為前面都是0)
        
        System.out.println("補足32位:       " + String.format("%32s", 
            Integer.toBinaryString(v)).replace(' ', '0'));
        // 輸出: 00000000000000010000000001010100
        
        char c = (char) v;
        System.out.println("轉成 char 後:   " + String.format("%16s", 
            Integer.toBinaryString(c)).replace(' ', '0'));
        // 輸出: 0000000001010100   ← 高16位全變0！只剩 01010100
        
        System.out.println("結果字元: " + c);  // T

  }
}
