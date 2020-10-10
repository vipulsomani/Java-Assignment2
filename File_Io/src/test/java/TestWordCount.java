import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class TestWordCount {
	@Test
	public void Test() throws FileNotFoundException, IOException {
		assertEquals(5, WordCount.count(new File("C:\\Users\\lenovo\\Desktop\\New folder\\Trail.txt")));
	}
}
