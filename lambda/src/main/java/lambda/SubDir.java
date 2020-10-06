package lambda;
import java.io.File;
public class SubDir {
	public static void main(String args[]) {
		File dir = new File("C:\\Users\\lenovo\\Desktop\\New folder");
		File[] sub = dir.listFiles((file) -> {
			return file.isDirectory();
		});
		System.out.println("Sub Directories are:- ");
		for (File file : sub) {
			System.out.println(file.getName());
		}
	}

}
