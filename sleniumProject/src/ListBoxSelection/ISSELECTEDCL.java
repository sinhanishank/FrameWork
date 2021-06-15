package ListBoxSelection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ISSELECTEDCL {
	public static void main(String []arg) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///D:/HTML/multiple.html");
		WebElement ListBox = driver.findElement(By.name("country"));
		Select country_dd= new Select(ListBox);
		boolean v= country_dd.isMultiple();
		System.out.println(v);
		Thread.sleep(10000);
		country_dd.selectByIndex(3);
		Thread.sleep(10000);
		country_dd.selectByVisibleText("India");
		Thread.sleep(10000);
		country_dd.deselectAll();
		
	}

}
