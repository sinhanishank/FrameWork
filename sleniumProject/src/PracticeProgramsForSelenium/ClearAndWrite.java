package PracticeProgramsForSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearAndWrite {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/HTML/textbox.html");
		driver.findElement(By.id("name")).clear();
		Thread.sleep(10000);
		driver.findElement(By.id("name")).sendKeys("I am the best");
		Thread.sleep(10000);		
		driver.close();
	}

}
