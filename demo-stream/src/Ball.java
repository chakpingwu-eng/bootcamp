public class Ball {

  private Color color;
  private int value;

  Ball(Color color, int value) {
    this.color = color;
    this.value = value;
  }

  public Color getColor() {

    return this.color;
  }

  public int getValue() {

    return this.value;
  }

  @Override
  public String toString() {
    return color + " " + value;
  }
}
