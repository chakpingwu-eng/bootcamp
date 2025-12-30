package Exercise;

import java.util.Objects;

public class Ex_Students {

  private String names;
  private int id;

  public Ex_Students(String names, int id) {

    this.names = names;
    this.id = id;

  }

  public void setNames(String names) {

    this.names = names;
  }

  public String getNames() {

    return names;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {

      return true;
    }
    if (!(o instanceof Ex_Students)) {

      return false;
    }

    Ex_Students ex_Students = (Ex_Students) o;

    return ex_Students.id == this.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "(ID: " + this.id + ", " + "Name: " + this.names + ")";
  }

}
