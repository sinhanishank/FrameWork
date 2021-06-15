package CountSize;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListoutAllLink {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> ListAll=driver.findElements(By.xpath("//a"));
		int count= ListAll.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text=ListAll.get(i).getText();
			System.out.println(text);
		}
	
		driver.close();
	}

}
