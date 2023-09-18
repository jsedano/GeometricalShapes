package dev.jsedano.geometricalshapes;

public class Square extends NamedShape {
  private double side;

  public Square(String name, double side) {
    super(name);
    this.side = side;
  }

  @Override
  public double calculateArea() {
    return side * side;
  }

  @Override
  public double calculatePerimeter() {
    return 4 * side;
  }
}
