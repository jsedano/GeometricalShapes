package dev.jsedano.geometricalshapes;

public class Circle extends NamedShape {
  private double radius;

  public Circle(String name, double radius) {
    super(null);
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public double calculatePerimeter() {
    return 2 * Math.PI * radius;
  }
}
