package assignment2;

public class Like {
	int cnt = 0;

	public String like(String[] s, int n) {
		String str = null;
		int p=n;
		if (n == 0)
			str = "0 Likes";
		else if (n == 1) {
			str = s[0] + " liked";
		} else if (n == 2) {
			str = s[0] + "," + s[1] + " liked";
		} else if (n == 3) {
			str = s[0] + "," + s[1] + " and " + s[2] + " liked this";
		} else {
			
				str = s[0] + "," + s[1] + " and "+ Integer.toString(p-2) + " other liked this";
			

		}

		return str;
	}
}
