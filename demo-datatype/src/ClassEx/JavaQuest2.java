package ClassEx;

public class JavaQuest2 {
  
  public static void main(String[] args) {
    
    // add condition to print "a is between 0 and 8"
    // how about a > 9?
    int a = 10;
    if (a == 9) {
      System.out.println("a is equals to 9");
    }if(a >= 0 && a <= 8){
      System.out.println("a is between 0 and 8");
    
    }if(a > 9){

      System.out.println("a is over 9");
    }

    // Take a character and check whether it is:
    // 1. Vowel (a, e, i, o, u – both lowercase and uppercase)
    // 2. Consonant
    // 3. Not an alphabet
    char ch = 'i';

    if(ch >= 'A' && ch <= 'Z'){

      System.out.println(ch);

    }else{

      System.out.println("Not an alphabet");

         }

       if(ch == 'i' || ch == 'a' || ch == 'e' ||ch == 'o'||ch =='u' ||
       ch == 'A' || ch =='E'  || ch == 'I' ||ch == 'O'||ch =='U'){

      System.out.println("Vowel");

    } else{

      System.out.println("Consonant");
    }

    // Take salary and years of experience, then calculate bonus
    // Experience ≥ 10 years → 20% bonus
    // 5–9 years → 10% bonus
    // < 5 years → 5% bonus
    // Also, if salary > 100000, reduce bonus by half

    double salary = 110_000;
    int experience = 12;
    double bonus = 0, bonusAmount = 0;
    
    if(experience >= 10 ){

      bonus = 1 + 0.2;
      System.out.println("get bonus " + bonus);

    }else if(experience >= 5 && experience <=9){

      bonus = 1 + 0.1;
      System.out.println("get bonus " + bonus);

    }else if (experience < 5){

      bonus = 1 + 0.05;
      System.out.println("Get bonus " + bonus);
    
    }

    if (salary > 100000) {
      
      bonus = bonus / 2;
      salary = salary * bonus;
      System.out.println("Over 100000, the bonus with salary is " + salary);

    }else{

      System.out.println("Salary is " + bonusAmount);

    }

  }
}

