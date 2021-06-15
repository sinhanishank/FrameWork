package Jscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class jsexecut 
{
public static void main(String[]arg)
	{
	System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost/login.do");
	RemoteWebDriver r=(RemoteWebDriver)driver;
	r.executeScript("alert('Hello')");
	}
}
