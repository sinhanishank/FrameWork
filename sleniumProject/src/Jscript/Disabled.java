package Jscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Disabled
{
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/91849/Dropbox/My%20PC%20(LAPTOP-NVQAJNIG)/Desktop/box.html");
	RemoteWebDriver r=(RemoteWebDriver)driver;
	String c="document.getElementById('lname').value= 'admin'";
	r.executeScript(c);

	
	}
}
