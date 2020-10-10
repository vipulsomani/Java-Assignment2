import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPerson {
	@Test
	public void Test() {
		Person person1=new Person("Ram", 5, 6, 1980);
		Person person2=new Person("Shyam", 2, 3, 1987);
		Person person3=new Person("Vipul", 12, 11, 1997);
		
		assertEquals("Ram is older than Shyam by 6 Years, 8 Months, 25 Days",person1.olderOne(person2));
		assertEquals("Shyam is older than Vipul by 10 Years, 8 Months, 10 Days",person2.olderOne(person3));
		
	}

}
