package lab4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SquareTest {
    
    @Test
    void testSquarePerimeter() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 2);
        Point p3 = new Point(2, 2);
        Point p4 = new Point(2, 0); 
        Square square = new Square(p1, p2, p3, p4);
        assertEquals(8.0, square.perimeter(), 0.0001); 
    }

  @Test
    void testIfSquare() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 1);
        Point p3 = new Point(1, 1);
        Point p4 = new Point(1, 0); 
        Square square = new Square(p1, p2, p3, p4);
        assertTrue(square.isSquare());  
    }
}