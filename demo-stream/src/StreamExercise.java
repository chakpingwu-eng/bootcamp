import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExercise {

        public static class Student {

                private String name;
                private int score;

                public Student(String name, int score) {

                        this.name = name;
                        this.score = score;
                }

                public String getName() {
                        return name;
                }

                public int getScore() {
                        return score;
                }

        }

        public static class Employee {

                private String name;
                private int salary;

                public Employee(String name, int salary) {

                        this.name = name;
                        this.salary = salary;
                }

                public String getName() {
                        return name;
                }

                public int getSalary() {
                        return salary;
                }

                public boolean isSalaryLess() {

                        return salary < 50000;
                }
        }

        public static class Person {

                private String name;
                private int age;

                public Person(String name, int age) {
                        this.name = name;
                        this.age = age;
                }

                public String getName() {
                        return name;
                }

                public int getAge() {
                        return age;
                }

                public String toString() {

                        return "Person(name = " + name + ", " + "age = " + age
                                        + ")";
                }
        }

        public static class Staff {
                public enum Gender {

                        MALE, FEMALE;
                }

                private String name;
                private Gender gender;

                public Staff(String name, Gender gender) {

                        this.name = name;
                        this.gender = gender;
                }

                public String getName() {
                        return name;
                }

                public Gender getGender() {
                        return gender;
                }

                @Override
                public String toString() {

                        return name;
                }



        }

        public static class Product {

                private String name;
                private int price;

                public Product(String name, int price) {

                        this.name = name;
                        this.price = price;

                }

                public String getName() {
                        return name;
                }

                public int getPrice() {
                        return price;
                }


        }

        public static void main(String[] args) {
                // 1. Basic Stream Operations
                // Task: Given a list of integers, use a stream to find all the even numbers, square them, and then
                // sort the result in descending order.
                List<Integer> numbers =
                                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
                // Output: [100, 64, 36, 16, 4]

                System.out.println("");
                System.out.println("1. Basic Stream Operations");
                List<Integer> Quest01 = numbers.stream()
                                .filter(even -> even % 2 == 0) //
                                .map(even -> even * even) //
                                .sorted((Comparator.reverseOrder())) //
                                .collect(Collectors.toList());
                System.out.println(Quest01);

                // 2. Filtering and Collecting
                // Task: Given a list of names, filter the names that start with "A" and collect them into a list.
                List<String> names = Arrays.asList("Alice", "Bob", "Annie",
                                "David", "Alex");
                // Output: [Alice, Annie, Alex]

                System.out.println("");
                System.out.println("2. Filtering and Collecting");
                List<String> Quest02 = names.stream() //
                                .filter(who -> who.startsWith("A")) //
                                .collect(Collectors.toList());

                System.out.println(Quest02);

                // 3. Finding Maximum and Minimum
                // Task: Given a list of integers, find the maximum and minimum values using Streams.
                List<Integer> numbers2 = Arrays.asList(10, 20, 5, 30, 15);
                // Output: Max: 30
                // Output: Min: 5

                System.out.println();
                System.out.println("3. Finding Maximum and Minimum");
                Integer MaxNum = numbers2.stream()
                                .max(Comparator.naturalOrder()).orElse(null);
                System.out.println("Max: " + MaxNum);
                Integer MinNum = numbers2.stream()
                                .min(Comparator.naturalOrder()).orElse(null);
                System.out.println("Min: " + MinNum);

                int max = numbers2.stream().mapToInt(e -> e.intValue()) //
                                .max() //
                                .getAsInt(); //
                int min = numbers2.stream().mapToInt(e -> e.intValue()) //
                                .min() //
                                .getAsInt(); //
                System.out.println(max);
                System.out.println(min);

                // 4. Mapping to a List of Lengths
                // Task: Given a list of strings, map each string to its length and collect the lengths into a
                // List<Integer>
                List<String> words = Arrays.asList("apple", "banana", "pear");
                // Output: [5, 6, 4] (List)

                System.out.println("");
                System.out.println("4. Mapping to a List of Lengths");
                List<Integer> Quest04 = words.stream().map(e -> e.length())
                                .collect(Collectors.toList());

                System.out.println(Quest04);

                // 5. Counting Elements
                // Task: Given a list of strings, count how many strings have a length greater than 3.
                // List<String> words = Arrays.asList("hi", "hello", "world", "java", "stream");
                // Output: 4

                // ! Terminal Operation (collect, count) / Intermediate operation (filter, map)
                System.out.println("");
                System.out.println("5. Counting Elements");
                List<String> Quest05 = Arrays.asList("hi", "hello", "world",
                                "java", "stream");
                List<String> lengthGreaterThan3 = Quest05.stream() //
                                .filter(greaterThen3 -> greaterThen3
                                                .length() > 3) //
                                .collect(Collectors.toList());

                System.out.println(lengthGreaterThan3.size());

                // 6. Filtering and Collecting to a Set
                // Task: Given a list of numbers, filter out all numbers greater than 10 and collect them into a
                // Set.
                // Output: [15, 20]
                System.out.println("");
                System.out.println("6. Filtering and Collecting to a Set");
                List<Integer> numbers3 = Arrays.asList(5, 10, 15, 20, 10, 5);
                Set<Integer> Quest06 = numbers3.stream() //
                                .filter(moreThan10 -> moreThan10 > 10) //
                                .collect(Collectors.toSet());

                System.out.println(Quest06);

                // 7. Mapping to a Map (Key-Value Pairs)
                // Task: Given a list of students with their names and scores, map them to a Map<String, Integer>,
                // where the key is the student's name and the value is their score.

                // Create Student Class
                // new Student("Alice", 85)
                // new Student("Bob", 75)

                // Output: {Alice=85, Bob=75}
                System.out.println("");
                System.out.println("7. Mapping to a Map (Key-Value Pairs)");
                List<Student> students = new ArrayList<>(
                                List.of(new Student("Alice", 85),
                                                new Student("Bob", 75)));

                Map<String, Integer> studentMap = students.stream()
                                .collect(Collectors.toMap(Student::getName, //
                                                Student::getScore));

                System.out.println(studentMap);

                // 8. Filtering and Mapping to a List of Objects
                // Task: Given a list of Employee objects, filter out employees with a salary less than 50,000 and
                // map them to a list of their names.

                // Create Employee Class
                // new Employee("John", 65000)
                // new Employee("Jane", 55000)
                // new Employee("Doe", 40000)

                // Output: [John, Jane]
                System.out.println("");
                System.out.println(
                                "8. Filtering and Mapping to a List of Objects");
                List<Employee> employees = new ArrayList<>(
                                List.of(new Employee("John", 65000) //
                                                , new Employee("Jane", 55000),
                                                new Employee("Doe", 40000)));

                List<String> Quest08 = employees.stream()
                                .filter(e -> !e.isSalaryLess()) //
                                .map(b -> b.getName())
                                .collect(Collectors.toList());

                System.out.println(Quest08);



                // 9. Grouping and Collecting to a Map (Group by Age)
                // Task: Given a list of people with their names and ages, group them by age and collect the result
                // into a Map<Integer, List<String>> where the key is the age and the value is a list of names.

                // Create Person Class
                // new Person("Alice", 30),
                // new Person("Bob", 25),
                // new Person("Charlie", 30)

                // Output: {30=[Alice, Charlie], 25=[Bob]} (Map)

                System.out.println("");
                System.out.println(
                                "9. Grouping and Collecting to a Map (Group by Age)");

                List<Person> persons =
                                new ArrayList<>(List.of(new Person("Alice", 30) //
                                                , new Person("Bob", 25) //
                                                , new Person("Charlie", 30)));
                Map<Integer, List<String>> Quest09 = persons.stream() //
                                .collect(Collectors.groupingBy(e -> e.getAge() //
                                                ,
                                                Collectors.mapping(e -> e
                                                                .getName(),
                                                                Collectors.toList())));

                System.out.println(Quest09);


                // 10. Partitioning and Collecting to a Map (Partition by Gender)
                // Task: Given a list of Staff with their names and genders, partition them into two groups: male
                // and female, and collect the result into a Map<Boolean, List<Person>>.

                // Create Staff Class
                // new Staff("Alice", Gender.Female)
                // new Staff("Bob", Gender.Male)
                // new Staff("Charlie", Gender.Male)

                // Output: {false=[Alice], true=[Bob, Charlie]} (Map)

                System.out.println("");
                System.out.println(
                                "Partitioning and Collecting to a Map (Partition by Gender)");

                List<Staff> staffs = new ArrayList<>(
                                List.of(new Staff("Alice", Staff.Gender.FEMALE) //
                                                , new Staff("Bob",
                                                                Staff.Gender.MALE) //
                                                , new Staff("Charlie",
                                                                Staff.Gender.MALE)));
                Map<Boolean, List<Staff>> partitionedStaff = staffs.stream()
                                .collect(Collectors.partitioningBy(s -> s
                                                .getGender() == Staff.Gender.MALE));

                System.out.println(partitionedStaff);


                // 11. Filtering, Mapping, and Collecting to a List
                // Task: Given a list of integers, filter out numbers less than 10, multiply the remaining numbers
                // by 2, and collect the result into a List.

                System.out.println("");
                System.out.println(
                                "11. Filtering, Mapping, and Collecting to a List");
                List<Integer> numbers4 = Arrays.asList(5, 15, 20, 7, 30);
                // Output: [30, 40, 60]
                List<Integer> q11 = numbers4.stream().filter(e -> e >= 10)
                                .map(e -> e * 2).collect(Collectors.toList());
                System.out.println(q11);

                // 12. Mapping to a Custom Object and Collecting to a List
                // Task: Given a list of names and a constant default value, map each name to a Person object (name
                // and default value for age) and collect the result into a list.

                // List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
                // int defaultAge = 30;
                // Output: [Person(name=Alice, age=30), Person(name=Bob, age=30), Person(name=Charlie, age=30)]

                List<String> studneNames =
                                Arrays.asList("Alice", "Bob", "Charlie");
                int defaultAge = 30;
                List<Person> q12 = studneNames.stream() //
                                .map(e -> new Person(e, defaultAge))//
                                .collect(Collectors.toList());
                System.out.println(q12);

                // 13. Mapping and Collecting to a Deque
                // Task: Given a list of words, map each word to its uppercase form and collect the result into a
                // Deque.
                // List<String> words = Arrays.asList("hello", "world", "java");
                // Output: [HELLO, WORLD, JAVA] (Deque)

                System.out.println("");
                System.out.println("13. Mapping and Collecting to a Deque");
                List<String> wordList = Arrays.asList("hello", "world", "java");
                Deque<String> queue = wordList.stream()
                                .map(e -> e.toUpperCase()).collect(Collectors
                                                .toCollection(ArrayDeque::new));
                System.out.println(queue);

                // 14. Transforming and Collecting to an Array
                // Task: Given a list of integers, square each number and collect the result into an array.

                // List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
                // Output: [1, 4, 9, 16]

                System.out.println("");
                System.out.println(
                                "14. Transforming and Collecting to an Array");
                List<Integer> Quest14 = Arrays.asList(1, 2, 3, 4);
                List<Integer> squaIntegers = Quest14.stream().map(e -> e * e)
                                .collect(Collectors.toList());
                System.out.println(squaIntegers);


                // 15. Map and Reduce
                // Task: Given a list of products with their prices, use the map and reduce methods to calculate the
                // total price of all products.

                // Create Product Class
                // new Product("Book", 10)
                // new Product("Pen", 5)
                // new Product("Notebook", 7)

                // Output: 22

                System.out.println("");
                System.out.println("15. Map and Reduce");



                // 16. Grouping
                // Task: Given a list of employees with their department names, use groupingBy method to group the
                // employees by department.

                // Create Worker Class
                // new Worker("Alice", "HR")
                // new Worker("Bob", "IT")
                // new Worker("Charlie", "HR")
                // new Worker("David", "IT")

                // Output: {HR=[Alice, Charlie], IT=[Bob, David]}

                // 17. Parallel Streams
                // Task: Given a list of numbers, use a parallel stream to calculate the sum of all elements.
                List<Integer> numbers5 =
                                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

                // Output: 55


                // 18. FlatMap
                // Task: Given a list of lists of numbers, flatten them into a single list and filter only the
                // numbers greater than 5.

                List<List<Integer>> listOfIntegers = Arrays.asList( //
                                Arrays.asList(1, 2, 3), //
                                Arrays.asList(4, 5, 6), //
                                Arrays.asList(7, 8, 9) //
                );
                // Output: [6, 7, 8, 9]

                // 19. Distinct and Sorting
                // Task: Given a list of strings with some duplicates, remove the duplicates and return the result
                // in alphabetical order.

                List<String> fruits = Arrays.asList("apple", "banana", "apple",
                                "orange", "banana", "grape");
                // Output: [apple, banana, grape, orange]

                // 20. Partitioning By
                // Task: Given a list of Childrens with their scores, partition the Childrens into passing and failing
                // groups (pass if score >= 50).
                // Create Student first.

                // Create Children Class
                // new Children("Alice", 45)
                // new Children("Bob", 55)
                // new Children("Charlie", 40)
                // new Children("David", 70)

                // Output: {false=[Alice, Charlie], true=[Bob, David]}

                // 21. Joining Strings
                // Task: Given a list of words, join them into a single string separated by commas.

                List<String> languages = Arrays.asList("Java", "Python", "Rust",
                                "R", "Go");
                // Output: "Java, Python, Rust, R, Go"

                String str = languages.stream()
                                .collect(Collectors.joining(","));
                System.out.println(str);

                // 22. Find First and Any
                // Task: Given a list of integers, find the first number that is divisible by 3.
                System.out.println("");
                System.out.println("22. Find First and Any");
                List<Integer> ages = Arrays.asList(4, 7, 9, 12, 16, 21);
                Optional<Integer> integerBox = ages.stream() //
                                .filter(e -> e % 3 == 0) //
                                .findFirst();
                if (integerBox.isPresent()) {

                        System.out.println(integerBox.get());
                }

                // Output: 9

                // 23. Limit and Skip
                // Task: Given a list of numbers, skip the first 3 elements and return the next 5 elements.

                System.out.println("");
                System.out.println("23. Limit and Skip");
                List<Integer> elements =
                                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
                // Output: [4, 5, 6, 7, 8]
                List<Integer> q23 = elements.stream() //
                                .skip(3L) //
                                .limit(5L) //
                                .collect(Collectors.toList());
                System.out.println(q23);

                // 24. Peek
                // Task: Given a list of integers, double each element and use the peek method to log the
                // intermediate results to the console.

                List<Integer> amounts = Arrays.asList(1, 2, 3, 4);
                // Intermediate output: 2, 4, 6, 8
                // Final Output: [2, 4, 6, 8]

                System.out.println("");
                System.out.println("24. Peek");
                List<Integer> peekIntegers = amounts.stream().map(e -> e * 2) //
                                // .peek(e -> System.out.print(e)) //
                                .collect(Collectors.toList());
                System.out.println("");
                System.out.println(peekIntegers);

                // 25. Optional and Streams
                // Task: Given a list of strings, use Streams to find the first string longer than 4 characters.
                // Handle the case where no such string exists using Optional.

                List<String> animals =
                                Arrays.asList("cat", "tiger", "panda", "dog");
                // Output: Optional[tiger]

                List<String> animals2 = Arrays.asList("cat", "dog", "bird");
                // Output: Optional.empty

                // 26. Custom Collector
                // Task: Create a custom collector that collects the elements of a stream and remove all duplicates

                List<Integer> duplicates =
                                Arrays.asList(2, 1, 2, 3, 4, 3, 5, 5, 6);

                Set<Integer> unqueNumbers = duplicates.stream() //
                                .collect(Collectors.toSet());
                System.out.println(unqueNumbers);
                // Output: [1, 2, 3, 4, 5, 6] (Set)
                Set<Integer> unqueNums = duplicates.stream() //
                                .collect(Collector.of(() -> new HashSet<>() //
                                                , (s, i) -> s.add(i) //
                                                , (set1, set2) -> { //
                                                        set1.addAll(set2); //
                                                        return set1;
                                                },
                                                Collector.Characteristics.UNORDERED));
                                                System.out.println(unqueNums);

                // 27. String Length Calculation
                // Task: Given a list of strings, calculate the total number of characters in all the strings
                // combined.

                System.out.println("");
                System.out.println("27. String Length Calculation");
                List<String> keywords = Arrays.asList("stream", "filter", "map",
                                "sorted", "collect");

                // Output: 28
                int lengthCaList = keywords.stream().mapToInt(e -> e.length())
                                .sum();
                System.out.println(lengthCaList);

        }
}
