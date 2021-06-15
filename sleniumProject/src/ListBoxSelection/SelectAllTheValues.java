package ListBoxSelection;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllTheValues 
{
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("file:///D:/HTML/multiple.html");
	WebElement ListBox = driver.findElement(By.name("country"));
	Select select= new Select(ListBox);
	List<WebElement> we= driver.findElements(By.xpath("//option"));
	int count= we.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		select.selectByIndex(i--);
	}
	    select.deselectAll();
	
	}
}
