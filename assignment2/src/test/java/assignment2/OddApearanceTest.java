package assignment2;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OddApearanceTest {

	@Test
	public void Test() {
		OddApearance oa = new OddApearance();
		int[] a = { 20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5 };
		int n = 17;

		int[] a2 = { 1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5 };
		int n2 = 11;

		int[] a3 = { 20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5 };
		int n3 = 13;

		int[] a4 = { 10 };
		int n4 = 1;

		int[] a5 = { 1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1 };
		int n5 = 11;

		int[] a6 = { 5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10 };
		int n6 = 11;

		assertEquals(5, oa.oddApearance(a, n));
		assertEquals(-1, oa.oddApearance(a2, n2));
		assertEquals(5, oa.oddApearance(a3, n3));
		assertEquals(10, oa.oddApearance(a4, n4));
		assertEquals(10, oa.oddApearance(a5, n5));
		assertEquals(1, oa.oddApearance(a6, n6));

	}
}
