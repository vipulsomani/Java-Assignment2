package object.manipulation;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class TestRectangle{
	Rectangle rectangle =new Rectangle(10, 5);
	@Test
	public void testgetArea() {
		assertEquals(50, rectangle.getAreaOfRectangle(),0);
	}
	@Test
	public void testgetPerimeter() {
		assertEquals(30, rectangle.grtPerimeterOfRectangle(),0);
	}
	@Test
	public void testSameArea() {
		Rectangle rectangle1 = new Rectangle(20, 30);
		Rectangle rectangle2 = new Rectangle(30, 20);
		assertTrue("Rectangle 1 and 2 has same area",rectangle1.hasSameArea(rectangle2));
	}
	
}
