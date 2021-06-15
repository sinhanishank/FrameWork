package WithoutTryCatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement uname=driver.findElement(By.id("txtUsername"));
		uname.sendKeys("Admin");
		WebElement pwd=driver.findElement(By.id("txtPassword"));
		pwd.sendKeys("admin123");
		WebElement login=driver.findElement(By.id("btnLogin"));
		login.click();
		WebElement dropdown=driver.findElement(By.id("welcome"));
		dropdown.click();
		while(true)
		{
		try
		{
		
		WebElement logout=driver.findElement(By.linkText("Logout"));
		logout.click();
		//System.out.println("Successfully Logout");
		break;
		}
		catch(Exception e)
		{
			System.out.println("Biiiiiiiii");
		}
		
	
		driver.close();
		
		
	}

}
}
