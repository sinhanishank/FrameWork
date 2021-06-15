package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagCLick
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/HTML/local.html");
		//By b= By.id("al");
		//By b= By.className("cl");
		//By b= By.linkText("actitime");
		By b= By.partialLinkText("time");
	    WebElement we= driver.findElement(b);
		System.out.println("Executed");
		we.click();
		System.out.println("clicked");
		driver.close();
	}

}
