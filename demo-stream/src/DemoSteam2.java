import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoSteam2 {

  public static void main(String[] args) {

    // Peter, 2020-OCT-23, 15000.00
    // John, 2019-JAN-31, 23000.00
    // Mary, 2022-MAY-05, 37000.00
    // Leo, 2002-DEC-10, 58000.00

    // ! Find all of their salary
    // ! Find all of their join dates.
    // ! Find all employee names, who joined the company before 2020-Jan-01
    // ! Find all employee with salary > 25000.00

    List<Employee> employees = new ArrayList<>(List.of(
        new Employee(1, LocalDate.parse("2020-10-23"), 15000.00, "Peter"),
        new Employee(2, LocalDate.parse("2019-01-31"), 23000.00, "John"),
        new Employee(3, LocalDate.parse("2022-05-05"), 37000.00, "Mary"),
        new Employee(4, LocalDate.parse("2002-12-10"), 58000.00, "Leo")));

    System.out.println("Find all of their salary.");
    // employees.forEach(System.out::println);
    System.out.println(" ");

    List<Double> salaries = employees.stream() //
        .map(e -> e.getSalary())//
        .collect(Collectors.toList());
    System.out.println(salaries);

    System.out.println("Find all of their join dates.");
    List<LocalDate> joinDates = employees.stream() //
        .map(e -> e.getJoinDate()) //
        .collect(Collectors.toList());

    System.out.println(joinDates);

    List<Employee> joinBefore2020Jan01 = employees.stream() //
        .filter(
            who -> who.getJoinDate().isBefore(LocalDate.parse("2020-01-01"))) //
        .collect(Collectors.toList());

    System.out.println(
        "Find all employee names, who joined the company before 2020-Jan-01");
    joinBefore2020Jan01.forEach(System.out::println);
    System.out.println(" ");

    List<Employee> salaryMoreThan25k = employees.stream() //
        .filter(s -> s.getSalary() > 25000.00) //
        .collect(Collectors.toList());

    System.out.println("Find all employee with salary > 25000.00");
    salaryMoreThan25k.forEach(System.out::println);
    System.out.println(" ");

    Stream<String> names = Stream.of("John", "Peter", "Leo", "Peter");
    long num = names.filter(e -> e.length() > 4).count();
    System.out.println(num);

    List<Integer> marksix = Stream.generate(() -> new Random().nextInt(49) + 1) //
        .limit(6) //
        .collect(Collectors.toList());
    System.out.println(marksix);
    Stream<String> names2 = Stream.of("John", "Peter", "Leo", "Peter");
    long uniqueNameCount = names2.distinct() //
        .count();
    System.out.println(uniqueNameCount);
    long employeeCount = employees.stream() //
        .map(e -> {
          System.out.println("hello"); //
          return e.getSalary();//
        }).count();
    System.out.println(employeeCount);

  }

  public static class Employee {

    private double salary;
    private LocalDate joinDate;
    private int id;
    private String name;

    public Employee(int id, LocalDate joinDate, double salary, String name) {

      this.id = id;
      this.joinDate = joinDate;
      this.salary = salary;
      this.name = name;

    }

    public int getId() {

      return this.id;
    }

    public LocalDate getJoinDate() {

      return this.joinDate;
    }

    public double getSalary() {

      return this.salary;
    }

    public String getName() {

      return this.name;
    }

    public String toString() {

      return "employee( ID: " + id //
          + " Name: " + name + " Date: " + joinDate + " Salary: " + salary;
    }
  }

}
