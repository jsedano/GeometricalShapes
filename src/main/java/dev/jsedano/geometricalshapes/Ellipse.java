package dev.jsedano.geometricalshapes;

public class Ellipse extends NamedShape {
  private double semiMajorAxis;
  private double semiMinorAxis;

  public Ellipse(String name, double semiMajorAxis, double semiMinorAxis) {
    super(null);
    this.semiMajorAxis = semiMajorAxis;
    this.semiMinorAxis = semiMinorAxis;
  }



  @Override
  public double calculateArea() {
    return Math.PI * semiMajorAxis * semiMinorAxis;
  }

  @Override
  public double calculatePerimeter() {

    return 2
        * Math.PI
        * Math.sqrt((semiMajorAxis * semiMajorAxis + semiMinorAxis * semiMinorAxis) / 2);
  }
}
