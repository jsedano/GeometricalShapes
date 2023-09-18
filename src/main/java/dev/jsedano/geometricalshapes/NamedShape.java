package dev.jsedano.geometricalshapes;

public abstract class NamedShape implements Shape {
  protected String name;

  public NamedShape(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public abstract double calculateArea();

  @Override
  public abstract double calculatePerimeter();
}
