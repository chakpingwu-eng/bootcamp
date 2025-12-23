package Exercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DataStructureExercise {
  // Exercise 1: Array List Basic Operations

  // 1a. Create an ArrayList of integers.
  // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
  // 1c. Print all the elements in the list.
  // 1d. Remove the number 30 from the list.
  // 1e. Print the size of the list.

  public static void main(String[] args) {
    ArrayList<Integer> exQuest1 = new ArrayList<>();
    exQuest1.add(10);
    exQuest1.add(20);
    exQuest1.add(30);
    exQuest1.add(40);
    exQuest1.add(50);

    System.out.println("Exercise 1: Array List Basic Operations");
    System.out.println("Ex1. Print all the elements " + exQuest1);
    exQuest1.remove((Integer) 30);
    System.out.println("Ex1. The size is " + exQuest1.size());
    System.out.println();

    // Exercise 2: Search and Update
    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.

    ArrayList<String> exQuest2 = new ArrayList<>();
    exQuest2.add("Apple");
    exQuest2.add("Banana");
    exQuest2.add("Mango");
    exQuest2.add("Orange");

    System.out.println("Exercise 2: Search and Update");
    System.out.println("Ex2. The original list: " + exQuest2);

    if (!exQuest2.contains("Grapes")) {
      exQuest2.add("Grapes");
    }

    exQuest2.set(exQuest2.indexOf("Mango"), "Peach");
    System.out.println("Ex2. The final list: " + exQuest2);
    System.out.println();

    // Exercise 3: Remove Duplicates
    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.

    HashSet<Integer> exQuest3 = new HashSet<>();
    exQuest3.add(10);
    exQuest3.add(20);
    exQuest3.add(10);
    exQuest3.add(30);
    exQuest3.add(40);
    exQuest3.add(20);
    exQuest3.add(50);

    System.out.println("Exercise 3: Remove Duplicates");
    System.out.println("Ex3. Remove duplicates from the list " + exQuest3);
    System.out.println();

    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.

    System.out.println("Exercise 4: HashSet Basic Operations");
    HashSet<String> exQuest4 = new HashSet<>();
    exQuest4.add("USA");
    exQuest4.add("India");
    exQuest4.add("China");
    exQuest4.add("Japan");
    System.out.println("Ex4. The original list: " + exQuest4);
    System.out.println("Ex4. Add \"Canada\" to the set: ");
    exQuest4.add("Canada");
    System.out.println(exQuest4);
    System.out.println("Ex4. Add \"India\" again.");
    exQuest4.add("India");
    System.out.println(exQuest4);
    System.out.println();

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of numbers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.

    HashSet<Double> exQuest5 = new HashSet<>();
    exQuest5.add(1.1);
    exQuest5.add(2.2);
    exQuest5.add(3.3);
    exQuest5.add(4.4);
    exQuest5.add(5.5);

    System.out.println("Exercise 5: Check the numbers");
    System.out.println("Ex5. Check the set contains the number 3.3: "
        + exQuest5.contains((Double) 3.3));

    if (exQuest5.contains((Double) 3.3)) {

      System.out.println("Ex5. Remove the number 2.2 from the set: "
          + exQuest5.remove((Double) 2.2));

    }
    System.out.println(exQuest5);
    System.out.println();


    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.

    HashSet<Integer> exQuest6Set1 = new HashSet<>();
    exQuest6Set1.add(10);
    exQuest6Set1.add(20);
    exQuest6Set1.add(30);
    exQuest6Set1.add(40);

    HashSet<Integer> exQuest6Set2 = new HashSet<>();
    exQuest6Set2.add(30);
    exQuest6Set2.add(40);
    exQuest6Set2.add(50);
    exQuest6Set2.add(60);

    System.out.println("Exercise 6: Intersection of Sets");
    System.out.println("Ex6. The original set 1 list: " + exQuest6Set1);
    System.out.println("Ex6. The original set 2 list: " + exQuest6Set2);
    exQuest6Set1.retainAll(exQuest6Set2);
    System.out.println("Ex6. The set1: " + exQuest6Set1);
    exQuest6Set2.retainAll(exQuest6Set1);
    System.out.println("Ex6. The set2: " + exQuest6Set2);
    System.out.println();

    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.

    System.out.println("Exercise 7: Convert HashSet to ArrayList");
    HashSet<String> exQuest7 = new HashSet<>();
    exQuest7.add("Cherry");
    exQuest7.add("Steve");
    exQuest7.add("Chole");
    exQuest7.add("Jenny");
    exQuest7.add("Vicky");

    System.out.println("Ex7. This is HashSet: " + exQuest7);
    ArrayList<String> arrayList_exQuest7 = new ArrayList<>(exQuest7);
    System.out.println("Ex7. Convert to an ArrayList: " + arrayList_exQuest7);
    System.out.println("Is the ArrayList is HashSet? "+arrayList_exQuest7.equals(exQuest7));
    System.out.println();

  }



}
