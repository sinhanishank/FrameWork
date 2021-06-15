package Autosuggestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Newtab 
{
public static void main(String[] args) 
  {
	System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver_win32 (4)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.actimind.com/");
	WebElement link=driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[1]/div[1]/ul/li[1]/a"));
	Actions	actions=new Actions(driver);
	actions.contextClick(link).perform();
	
	//driver.close();
   }
}
