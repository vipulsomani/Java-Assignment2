import java.io.File;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
public class TestFileExist {
	public void testFile() {
		assertArrayEquals(FileExist.fileExists(new File("C://Users//lenovo//Desktop//Trail.txt")));
	}
}
