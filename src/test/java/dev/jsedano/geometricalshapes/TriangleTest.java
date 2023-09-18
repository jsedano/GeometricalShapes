package dev.jsedano.geometricalshapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TriangleTest {

  @Test
  public void triangleTest() {
    Triangle triangle = new Triangle("Triangle", 3.0, 4.0, 5.0, 4.0, 3.0);
    assertEquals("Triangle", triangle.getName());
    assertEquals(6.0, triangle.calculateArea());
    assertEquals(12.0, triangle.calculatePerimeter());
  }
}
