package Exercise;

import java.util.ArrayList;
import java.util.HashSet;

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

  }



}
