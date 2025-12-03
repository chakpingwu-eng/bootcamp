public class demoOperator {
  
  public static void main(String[] args){

    // +1, -1

    int x = 3;
    x = x + 1;
    x += 1;
    x++;
    ++x;

    System.out.println(x);

    int y = 8;
    y= y -1;
    y -= 1;
    y--;
    --y;
    System.out.println(y);

    // + 2

    int a = 9;
    a = a + 2;
    a += 2;
    System.out.println(a); // 13
    
    a *= 2;
    System.out.println(a); // 26

    a /= 2;
    System.out.println(a); // 13

    //The differece between x++ and ++x

    int j = 11; 
    System.out.println(++j *8); //96, 12 * 8(++ first, then * 8)
    System.out.println(j);

    int k = 11;
    System.out.println(k++ * 8); //88, 11 * 8(*8 frist, then++)
    System.out.println(k);

    int h = 14;
  
    System.out.println( h++ * 2 * ++h);
    //Step 1: 14 x 2
    //Step 2: h become 15
    //Step 3: 28 x 16 (15 +1)

    int age = 66;
    boolean isElderly = age > 65;

    if(isElderly == true){

    }

    if(isElderly){

    }

    if(!isElderly){

    }

    int t = 100;
    boolean result = t > 90;

    System.out.println(result); //true

    //true / false

    int e =5;
    System.out.println(e > 3 && e < 10); // && AND
    System.out.println(e > 3 || e > 20); // || OR

    //
    System.out.println(true || false); // true
    System.out.println(false || true); //true
    System.out.println(false || false); //false
    System.out.println(true || true); //true

    System.out.println(true && true); //true
    System.out.println(true && false); 
    System.out.println(false && true);
    System.out.println(false && false);

  }

}
