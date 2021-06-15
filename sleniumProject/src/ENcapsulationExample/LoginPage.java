package ENcapsulationExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	WebDriver driver;
	public void login_id()
	{
		driver.findElement(By.id("username"));
		//WebElement we2 = driver.findElement(By.name("pwd"));
		
	}
}
