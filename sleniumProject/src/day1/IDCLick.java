package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDCLick
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/HTML/local.html");
		By b= By.tagName("a");
		WebElement we= driver.findElement(b);
		System.out.println("Executed");
		we.click();
		System.out.println("clicked");
		driver.close();
	}

}
