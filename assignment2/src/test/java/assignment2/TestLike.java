package assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLike {
	@Test
	public void Test() {
		Like l = new Like();
		
		String s1[] = { "Alex", "Jacob", "Mark", "Max" };
		assertEquals("Alex,Jacob and 2 other liked this", l.like(s1, 4));

		String s2[] = {};
		assertEquals("0 Likes", l.like(s2,0));

		String s3[] = {"Max", "John","Mark"};
		assertEquals("Max,John and Mark liked this", l.like(s3, 3));
	}

}
