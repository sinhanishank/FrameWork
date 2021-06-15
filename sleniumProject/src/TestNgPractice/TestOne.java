package TestNgPractice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestOne 
{
@Test(priority=1, invocationCount=2, description="This test case for login")
public void loginApplication()
{
	Reporter.log("Hello World",true);
	Assert.assertEquals(12, 13);
}
@Test(priority=2, description="This test case for selected")
public void selected()
{
	Reporter.log("ItemSelected",true);
}
@Test(priority=3, description="This test case for checkbox")
public void checkbox()
{
	Reporter.log("checkbox selected",true);
}
}
