package assignment2;

public class NoOfDuplicates {
	int count;
	int cnt;

	public int countDuplicate(char s[], int n) {
		cnt = 0;
		for (int i = 0; i < n; i++) {
			count = 1;
			for (int j = i + 1; j < n; j++) {
				if (s[i] == s[j] && s[i] != ' ') {
					count++;
					s[j] = '0';
				}
			}

			if (count > 1 && s[i] != '0')
				cnt++;
		}
		return cnt;
	}

}
