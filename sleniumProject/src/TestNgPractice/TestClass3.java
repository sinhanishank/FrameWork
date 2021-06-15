
package TestNgPractice;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNgPractice.TestNg2.class)

public class TestClass3 {
	@Test
	public void execution()
	{
		System.out.println("see the test result");
	}

}
