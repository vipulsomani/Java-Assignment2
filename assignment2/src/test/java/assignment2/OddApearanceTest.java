package assignment2;

import org.junit.Assert;
import org.junit.Test;

public class OddApearanceTest {

	@Test
	public void Test() {

		int[] a = { 20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5 };
		int n = 17;
		OddApearance oa = new OddApearance();
		int expectedOutput = 5;
		int methodOutput = oa.oddApearance(a, n);

		Assert.assertEquals(expectedOutput, methodOutput);
	}

	@Test
	public void Test1() {

		int[] a = { 1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5 };
		int n = 11;
		OddApearance oa = new OddApearance();
		int expectedOutput = -1;
		int methodOutput = oa.oddApearance(a, n);

		Assert.assertEquals(expectedOutput, methodOutput);
	}

	@Test
	public void Test2() {

		int[] a = { 20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5 };
		int n = 13;
		OddApearance oa = new OddApearance();
		int expectedOutput = 5;
		int methodOutput = oa.oddApearance(a, n);

		Assert.assertEquals(expectedOutput, methodOutput);
	}

	@Test
	public void Test3() {

		int[] a = { 10 };
		int n = 1;
		OddApearance oa = new OddApearance();
		int expectedOutput = 10;
		int methodOutput = oa.oddApearance(a, n);

		Assert.assertEquals(expectedOutput, methodOutput);
	}

	@Test
	public void Test4() {

		int[] a = { 1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1 };
		int n = 11;
		OddApearance oa = new OddApearance();
		int expectedOutput = 10;
		int methodOutput = oa.oddApearance(a, n);

		Assert.assertEquals(expectedOutput, methodOutput);
	}

	@Test
	public void Test5() {

		int[] a = { 5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10 };
		int n = 11;
		OddApearance oa = new OddApearance();
		int expectedOutput = 1;
		int methodOutput = oa.oddApearance(a, n);

		Assert.assertEquals(expectedOutput, methodOutput);
	}
}
