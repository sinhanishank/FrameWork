package Jscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Login
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost/login.do");
	RemoteWebDriver r=(RemoteWebDriver)driver;
	String c="document.getElementById('username').value= 'admin'";
	String d="document.getElementById('username').value= 'manager'";
	String l="document.getElementById('loginBox').click()";
	r.executeScript(c +""+d +" "+l);
	//driver.close();
}
}
