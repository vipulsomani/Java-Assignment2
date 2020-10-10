import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class TestLineCount {
	@Test
	public void Test() throws FileNotFoundException, IOException {
		assertEquals(7, LineCount.count(new File("C:\\Users\\lenovo\\Desktop\\New folder\\Trail.txt")));
		assertEquals(0, LineCount.count(new File("C:\\Users\\lenovo\\Desktop\\New folder\\Vip.txt")));
	}
}
