package dev.jsedano.geometricalshapes;

public abstract class NamedShape implements Shape {
  protected ShapeEnum name;

  public NamedShape(ShapeEnum name) {
    this.name = name;
  }

  public ShapeEnum getName() {
    return name;
  }

  @Override
  public abstract double calculateArea();

  @Override
  public abstract double calculatePerimeter();
}
