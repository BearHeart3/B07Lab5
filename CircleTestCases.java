// Change package name to appropriate package
package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTestCases {

	
	@Test
	void test() {
		double r = 5.0;
		Circle c = new Circle(r);
		double answer = c.area();
		assertEquals(answer, Math.PI * Math.pow(r, 2));
	}

	@Test
	void test1() {
		double r = 5.0;
		Circle c = new Circle(r);
		double answer = c.perimeter();
		assertEquals(answer, Math.PI * r * 2);
	}

}
