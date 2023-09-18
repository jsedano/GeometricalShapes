package dev.jsedano.geometricalshapes;

public class Rectangle extends NamedShape {
  private double width;
  private double height;

  private Rectangle(ShapeEnum name, double width, double height) {
    super(name);
    this.width = width;
    this.height = height;
  }

  public static Rectangle buildSquare(double width){
    if(width <= 0){
      throw new IllegalArgumentException("width should be greater than 0");
    }
    return new Rectangle(ShapeEnum.SQUARE, width, width);
  }

  public static Rectangle buildRectangle(double width, double height){
    if(width <= 0 || height <= 0){
      throw new IllegalArgumentException("width  should be greater than 0");
    }
    if(width == height){
      throw new IllegalArgumentException("width and height should be different");
    }
    return new Rectangle(ShapeEnum.RECTANGLE, width, height);
  }

  @Override
  public double calculateArea() {
    return width * height;
  }

  @Override
  public double calculatePerimeter() {
    return 2 * (width + height);
  }
}
