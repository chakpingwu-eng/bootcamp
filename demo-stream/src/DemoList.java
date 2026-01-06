import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoList {

  public static void main(String[] args) {

    List<String> names = new ArrayList<>();
    names.add("John");
    names.add("Peter");

    // read
    System.out.println(names);
    System.out.println(names.get(0));

    // add
    names.add("Sally");
    // update
    names.set(1, "steven");

    List<String> names2 = List.of("John", "Peter");

    System.out.println("2. add element (Sally)");
    // names2.add("Sally"); // ! CANNOT ADD
    // System.out.println(names2); // ! CANNOT UPDATE

    List<String> names3 = Arrays.asList("John", "Peter");
    names3.add("Sally"); // ! CANNOT ADD
    names3.set(1, "Steven");



    // 1. read element
    // 2. add element (Sally)
    // 3. updata element (Peter -> Steven)

    // ! Stream -> create a conpletely new Structure to return
    // List.of() -> steam -> collect -> ArrayList()

  }
}
