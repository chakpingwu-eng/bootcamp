import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoLambda {

  public static void main(String[] args) {

    // After Java 8 : Lambda Expression
    // Functional Interface (One Method Interface)

    // Java Built-in Lambda Function
    // 1. Function (method: input -> output)

    // Compile time confirm the type of Function(input: String, output: Integer)
    // Given s
    // return int


    Function<String, Integer> stringLengthFormula = (s) -> s.length();


    System.out.println(stringLengthFormula.apply("hello"));

    // ! Lambda Expression: Write a formula(java method) for the object, call the only method inside the object
    // the object
    Function<String, String> stringLengthFormula2 = s -> s.trim().toUpperCase();

    System.out.println(stringLengthFormula2.apply(" we are the rack "));


    // Before Java 8
    TrimAndUpperCase trimAndUpperCase = new TrimAndUpperCase();
    System.out.println(trimAndUpperCase.apply(" Hello World ..."));

    Function<String, String> trimAndUpperCase3 = new Function<>() {

      @Override
      public String apply(String s) {

        return s.trim().toUpperCase();
      }
    };

    System.out.println(trimAndUpperCase3.apply("Hello World ..."));

    // 2. BiFunction (2 inputs -> 1 output)
    BiFunction<String, String, String> concatFunction =
        (s1, s2) -> s1.concat(s2);
    System.out.println(concatFunction.apply("Hello", "world"));

    BiFunction<String, String, Integer> tryIndexOf =
        (String s1, String s2) -> s1.indexOf(s2);

    System.out.println(tryIndexOf.apply("Hello", "Hel"));
    BiFunction<String, String, Boolean> tryStartWith =
        (t, x) -> t.startsWith(x);

    System.out.println(tryStartWith.apply("goodbye", "goo"));

    MathOperation addition = (x, y) -> x + y;
    MathOperation subtraction = (x, y) -> x - y;

    System.out.println(addition.operate(3, 4)); // 7
    System.out.println(subtraction.operate(-3, 4)); // -7

    // 3. Comsumer ()

    List<String> names = new ArrayList<>();

    names.add("Steven");
    names.add("John");
    names.add("Leo");

    for (String name : names) {

      System.out.println(name);
    }

    // foreach()

    Consumer<String> printOut = s -> System.out.println(s);
    names.forEach(printOut);
    names.forEach(s -> System.out.println("Use Lambda " + s));

    // Without {}, you can write one line code only.

    // With {}, you can write more than one line, and you need to use "return" if required

    names.forEach(name -> {
      System.out.println(name);
      System.out.println("hello");
    });

    // 4. Suplier(no input, but with output)
    // random -> 1-49
    Supplier<Integer> markSixGenrator = () -> new Random().nextInt(49) + 1;
    System.out.println(markSixGenrator.get());

    // 5. Predicate
    Predicate<Person> isElderly = p -> p.isElderly();
    System.out.println(isElderly.test(new Person(67))); // true

    // BiConsumer, BiPreicate

    // ! Exmaple: Map
    Map<Integer, String> studentMap = new HashMap<>();
    studentMap.put(1, "John");
    studentMap.put(2, "Leo");
    studentMap.put(3, "Sally");

    studentMap.computeIfAbsent(4, stuNo -> "N/A");
    studentMap.computeIfAbsent(2, stuNo -> "N/A");


    for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {

      System.out
          .println("Key=" + entry.getKey() + ",value=" + entry.getValue());
    }
    System.out.println(studentMap);
    studentMap
        .forEach((k, v) -> System.out.println("key=" + k + ",value=" + v));


  }
}
