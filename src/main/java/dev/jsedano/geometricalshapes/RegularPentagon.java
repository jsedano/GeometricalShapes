package dev.jsedano.geometricalshapes;

public class RegularPentagon extends NamedShape {
  private double side;

  public RegularPentagon(String name, double side) {
    super(null);
    this.side = side;
  }

  @Override
  public double calculateArea() {
    return (5.0 / 4.0) * Math.pow(side, 2) * (1.0 / Math.tan(Math.PI / 5.0));
  }

  @Override
  public double calculatePerimeter() {
    return 5 * side;
  }
}
