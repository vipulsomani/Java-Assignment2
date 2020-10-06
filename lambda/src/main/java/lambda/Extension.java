package lambda;

import java.io.File;

public class Extension {

	public static void main(String[] args) {
		File dir = new File("C:\\Users\\lenovo\\Desktop\\New folder");
		File[] sub = dir.listFiles((d, name) -> name.toLowerCase().endsWith(".txt"));
		for (File s : sub) {
			System.out.println(s.getName());
		}
	}

}
