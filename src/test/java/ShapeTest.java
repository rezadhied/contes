package src.test.java;

import static org.junit.Assert.*;
import src.main.java.*;
import org.junit.Test;

public class ShapeTest {

	@Test
	public void testSquareArea() {
		double side = 5.0;

        Shape testSquare = new Shape();

        double actualArea = testSquare.squareArea(side);

        double expectedArea = 1.0;
        assertEquals("Square area calculation is incorrect", expectedArea, actualArea, 0.001);
    }

	@Test
	public void testRectangleArea() {
		double length = 3.0;
        double width = 4.0;

        Shape testRectangle = new Shape();

        double actualArea = testRectangle.rectangleArea(length, width);

        double expectedArea = length * width;
        assertEquals("Rectangle area calculation is incorrect", expectedArea, actualArea, 0.001);
	}

	@Test
	public void testCircleArea() {
		double radius = 2.0;

        Shape testCircle = new Shape();

        double actualArea = testCircle.circleArea(radius);

        double expectedArea = Math.PI * radius * radius; 
        assertEquals("Circle area calculation is incorrect", expectedArea, actualArea, 0.001);
	}

}
