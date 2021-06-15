package CountSize;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCheckBox 
{
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("file:///D:/HTML/checkbox.html");
	List<WebElement> checkBox= driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(int i=0;i<checkBox.size();i++)
	{
		WebElement clicking= checkBox.get(i);
		clicking.click();
	}
}
}

