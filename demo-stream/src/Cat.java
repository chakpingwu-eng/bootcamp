public class Cat {

  private String name;
  private int age;

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  private Cat(String name, int age) {

    this.name = name;
    this.age = age;
  }

  public String toString() {

    return "Cat (" + name + ", " + age + ")";
  }

  public static Builder builder() {

    return new Builder();
  }

  // ! Encapsulation
  public static class Builder {

    private String name;
    private int age;

    // setter
    public Builder name(String name) {

      this.name = name;
      return this;
    }

    // setter
    public Builder age(int age) {

      this.age = age;
      return this;
    }

    public String getName() {
      return name;
    }

    public int getAge() {
      return age;
    }
    public Cat build() {
      return new Cat(this.name, this.age);
    }

  }


  public static void main(String[] args) {

    Cat c1 = builder() // return Builder Object
        .name("John") // return Builder Object
        .age(19) // return Builder Object
        .build(); // return Cat Object

    System.out.println(c1.toString());
  }
}
