package assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestHighestNumber {
	@Test
	public void Test() {
		HighestNumber h = new HighestNumber();
		int i = 21445;
		assertEquals(54421, h.number(i, 5));
		int j= 145263;
		assertEquals(654321, h.number(j, 6));
		int k=123564987;
		assertEquals("All numbers",987654321, h.number(k, 9));
	}

}
