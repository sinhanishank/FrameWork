package Autosuggestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Auto2 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement menu=driver.findElement(By.xpath("//span[text()='AboutCompany']"));
	Actions actions=new Actions(driver);
	actions.moveToElement(menu).perform();
	driver.findElement(By.linkText("BasicFacts")).click();
}
}
