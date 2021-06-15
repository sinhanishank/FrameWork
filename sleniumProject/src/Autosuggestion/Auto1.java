package Autosuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto1 
{
public static void main(String[] args) 
  {
	System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver_win32 (4)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
	List<WebElement> elements=driver.findElements(By.xpath("//ul//li[@class='sbct']"));
	int count= elements.size();
	System.out.println(count);
	int position=0;
	for(int i= 0; i<count;i++)
	{
		WebElement aut= elements.get(i);
		String text= aut.getText();
		System.out.println(text);
		/*if(text.equalsIgnoreCase("selenium hq"))
		{
			position=i;
		}
		elements.get(position).click();*/
	}
   }
}
