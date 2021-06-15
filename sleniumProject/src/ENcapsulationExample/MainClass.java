package ENcapsulationExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		LoginPage obj=new LoginPage();
		obj.login_id();
	}

}
