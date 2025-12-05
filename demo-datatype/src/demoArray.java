public class demoArray {
  public static void main(String[] args) {
    
    int x = 3;
    int y = 10;
    int z = 18;

    System.out.println(y);

    //Array - store a set of same type values
    //arr is a variable name
    //"int[] arr" is to describe the type of variable
    int[] arr = new int[4];
    arr[0] = 23;
    arr[1] = 49;
    arr[2] = 71;
    arr[3] = 100;

    //arr = new int[4]; ArrayIndexOutOfBoundException

    //! arr.length
    System.out.println("arr.length = " + arr.length);
    for(int i = 0; i < arr.length; i++){

      System.out.println(arr[i]);

    }

    //arr= new int[4]; ArrayIndexOutOfBoundsException

 //String[]

  //apple, banana, kiwi
  //for loop

  String[] fruit = new String[3];

  fruit[0] = "apple";
  fruit[1] = "banana";
  fruit[2] = "kiwi";

  for(int i = 0; i < fruit.length; i++){

    System.out.println(fruit[i]);

  }

  //char[]

  //i j k a b
  char[] arr3 = new char[5];

  arr3[0] = 'i';
  arr3[1] = 'j';
  arr3[2] = 'k';
  arr3[3] = 'a';
  arr3[4] = 'b';

  for(int i = 0; i < arr3.length; i++){

    System.out.println(arr3[i]);
  }

  //boolean[]
  //true, false, true
  boolean[] arr4 = new boolean[3];

  arr4[0] = true;
  arr4[1] = false;
  arr4[2] = true;

  for(int i = 0; i < arr4.length; i++){

    System.out.println(arr4[i]);
  }

  //"John", "Tommy", "Steven"
  String names = new String() 

}

}



