package assignment2;

import java.util.Arrays;

public class HighestNumber {
	int num;

	public int number(int n, int k) {

		int a[] = new int[k];
		int i = 0;
		while (n != 0) {
			int d = n % 10;
			a[i] = d;
			i++;
			n = n / 10;

		}
		Arrays.sort(a);
		int m = a.length;

		for (int j = m - 1; j >= 0; j--) {
			num = num * 10 + a[j];
		}

		return num;
	}

}
