package dev.jsedano.geometricalshapes;

public class GeometricalshapesApplication {

  public static void printShapeDetails(NamedShape shape) {
    System.out.println("Shape: " + shape.getName());
    System.out.println("Area: " + shape.calculateArea());
    System.out.println("Perimeter: " + shape.calculatePerimeter());
    System.out.println();
  }

  public static void main(String[] args) {
    Circle circle = new Circle("Circle", 5.0);
    //Rectangle rectangle = new Rectangle("Rectangle", 4.0, 6.0);
    Triangle triangle = new Triangle("Triangle", 3.0, 4.0, 5.0, 4.0, 3.0);
    Square square = new Square("Square", 4.0);
    Ellipse ellipse = new Ellipse("Ellipse", 5.0, 3.0);
    RegularPentagon pentagon = new RegularPentagon("Pentagon", 6.0);

    printShapeDetails(circle);
    //printShapeDetails(rectangle);
    printShapeDetails(triangle);
    printShapeDetails(square);
    printShapeDetails(ellipse);
    printShapeDetails(pentagon);
  }
}
