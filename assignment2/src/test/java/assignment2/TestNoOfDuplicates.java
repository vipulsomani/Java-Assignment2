package assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestNoOfDuplicates {
	@Test
	public void Test() {
		NoOfDuplicates n = new NoOfDuplicates();
		String str = "abcde";
		assertEquals(0,n.countDuplicate(str, 5));
		String str2 ="aabbcde";
		assertEquals(2,n.countDuplicate(str2, 7));
		String str3 = "11aabb";
		assertEquals(3,n.countDuplicate(str3, 6));
		
	}

}
