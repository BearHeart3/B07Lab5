package lab4

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

  @Test
  void testArea() {
        Circle radius = new Circle(3);
        assertEquals(28.2743, radius.area(), 0.0001);
    }

  @Test
  void testPerimeter() {
        Circle radius = new Circle(3);
        assertEquals(18.8496, radius.perimeter(), 0.0001);
    }

}