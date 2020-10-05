package object.manipulation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DistanceTest {

	@Test
	public void test() {
		Distance d = new Distance(1, 1.0f);
		assertEquals(1, d.getFeet());
		assertEquals(1.0, d.getInches(), 0);

	}
}
