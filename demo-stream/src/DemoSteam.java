import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DemoSteam {
  public static void main(String[] args) {

    List<Person> persons = new ArrayList<>(List.of(new Person(66),
        new Person(40), new Person(30), new Person(20)));

    // Find a list of Elderly(return a new list)
    List<Person> elderlyPersons = new ArrayList<>();
    for (Person p : persons) {
      if (p.isElderly()) {

        elderlyPersons.add(p);
      }
    }
    System.out.println(elderlyPersons);

    Predicate<Person> isElderlyFormula = p -> p.getAge() > 65;
    List<Person> elderlyList = persons.stream() // return Stream<Person>
        .filter(isElderlyFormula) //
        .collect(Collectors.toList());

    System.out.println(elderlyList);
    System.out.println(persons); // ! No change

    // John 10, Sally 3, Leo 8, Steven 5

    Cat c1 = Cat.builder().age(10).name("John").build();
    Cat c2 = Cat.builder().age(3).name("Sally").build();
    Cat c3 = Cat.builder().age(8).name("Leo").build();
    Cat c4 = Cat.builder().age(5).name("Steven").build();
    List<Cat> cats = new ArrayList<>(List.of(c1, c2, c3, c4));
    // Find a new list of cat, whose age > 4 and the name has char 'n'

    List<Cat> targCats =
        cats.stream().filter(c -> c.getAge() > 4 && c.getName().contains("n"))
            .collect(Collectors.toList());

    System.out.println(targCats);

    // Ball
    // RED 10, BLUE 3, RED 12, YELLOW 8, BLUE 4
    // Find all blue and yellow balls
    List<Ball> balls = new ArrayList<>(List.of(new Ball(Color.RED, 10),
        new Ball(Color.BLUE, 3), new Ball(Color.RED, 12),
        new Ball(Color.YELLOW, 8), new Ball(Color.BLUE, 4)));

    // ! List<Ball> to List<Ball>
    // filter只會filt object，不能改寫內容
    List<Ball> FindAllBlueAndYellowBalls = balls.stream()
        .filter(b -> b.getColor() == Color.BLUE || b.getColor() == Color.YELLOW)
        .collect(Collectors.toList());

    System.out.println(FindAllBlueAndYellowBalls);

    // ! Find all balls with blue and yellow color, Return the number of the balls.
    // ! List<Ball> to List<Integer>

    List<Integer> targetIntegers = balls.stream()//
        .filter(b -> b.getColor() == Color.BLUE || b.getColor() == Color.YELLOW) //
        .map(b -> b.getValue()).sorted((n1, n2) -> (n1 > n2) ? -1 : 1) // ! natural order
        .collect(Collectors.toList());

    System.out.println(targetIntegers);
  }

}
