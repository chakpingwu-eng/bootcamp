public class demoIf {
  public static void main(String[] args) {
    
int x =10;

if(x % 2 == 1){

  System.out.println("this is an odd number");

}else{

  System.out.println("this is an even number");

}if (x >0){

  System.out.println("this is a positive number");
}if(x <0){

  System.out.println("this is a negative number");
}

//if x > 3 and even number, money +10
//otherwise, money + 5
 int money = 0;

 System.out.println(money = 101);

    //if(x > 3 && x % 2 ==0){}
    //else{}
 if(money >= 3 && money % 2 == 1){

    System.out.println("money is an odd number and get 10");

 }if(money >= 3 && !(money % 2 ==1)){

    System.out.println("money is an even number and get 5");

 }if(money <=3){

  System.out.println("not enongh money.");

 }

 //example 
 //char gender = 'M';
 boolean isFemale = false;
 //boolean isMale = false;
 boolean isSmoker = true;
 int age = 66;
 double premium_base = 100;
 //premium base $100
 //if female, above 40, 20% more premium
 //if male, smoker, 50% more premium
 //if female, smoker, 5% more premium
 //if female/ male, age >= 70, 40% premium

  if(isFemale) //female case
    
    {

    if (age >= 40) {
      
      System.out.println(premium_base * (1+0.2));

      if(isSmoker){

        System.out.println(premium_base * (1+0.05));

        if(age >= 70){

          System.out.println(premium_base *(1 +0.4));
        }
      }
    }
  }
  else // male case
    {

    if(isSmoker){

      System.out.println(premium_base * (1+0.5));

      if(age >= 70){

      System.out.println(premium_base * (1+0.4));
      
    }
    }
  }

//
  int precentage = 0;
if(age >= 40){

  if(isFemale){

    precentage += 20;

  }
  if(age >= 70){

    precentage +=40;

  }
}
  if(isSmoker){

    if (isFemale) {
      precentage += 5;
    }else{
      precentage += 50;
    }
  }

System.out.println(precentage); //50
double basePremium =100.0;
double premium02 = basePremium * (1 + precentage /100.0);
System.out.println(premium02); //150.0


//test case, 溝通用, 計劃
//! Male age69 smoker -> 50%
//! Male age70 smoker -> 90%
//! Male age69 non-smoker -> 0 
//! Male age69 non-smoker -> 40
//! Female age39 smoker -> 5%
//! Female age45 smoker -> 25%
//! Female age75 smoker -> 65%
//! Female age39 non-smoker -> 0%
//! Female age45 non-smoker -> 20%
//! Female age75 non-smoker -> 60%

//else if 

//divided by 3 -> money + 3
//divided by 4 -> money + 4
//divided by 5 -> money + 5

money = 100;
int u = 135;

if(u % 3 == 0){
  money += 3;
}if(u % 4 ==0){
  money += 4;
}if(u % 5 == 0){
  money +=5;
}

//if 所有條件獨立檢查，可能多個執行。
System.out.println(money);

int score = 75;
char grade = ' ';

if(score >= 90 ){

    grade = 'A';

}else if (score >= 80) {
  
  grade = 'B';

}else if(score >= 70){

  grade = 'C';

}else{

  grade ='F';
}

System.out.println(grade);

//else if 第一個成立即結束，不檢查後續。

String name = "Kohn";


if("John".equals(name)){

  System.out.println("is John.");

}
else{

  System.out.println("is not John.");

  }

  //charAt

  if (name.charAt(0) == 'J') {
    
    System.out.println("Name starts with J");
    
  }if(name.startsWith("J")){

    System.out.println("maybe be John.");


    //contains
  }if(name.contains("oh")){

    System.out.println("He is J$oh$n.");
  }

  if(name.length() >= 3){

    System.out.println("The name is too long...");

  }

  //2. switch

  //grade A -> 100
  //grade B -> 50
  //grade C -> 20
  //otherwise -> No money received
  money = 0;
  grade = 'B';

  switch (grade) {
    case 'A':
      money += 100;
      break;
    case 'B':
      money += 50;
      
      break;
    case 'C':
      money += 20;
      
      break;
  
    default: // else
  }
  System.out.println(money); //50

  //end
 }

}
