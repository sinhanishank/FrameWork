package CheckBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alllnk {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
        List<WebElement> we = driver.findElements(By.xpath("//a"));
		int count= we.size();
		System.out.println(count);
		for(WebElement link : we)
		{
			String url=link.getAttribute("href");
			System.out.println("Here the List of all the link and Its count :) ");
			/*WebDriverWait wait= new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(link));
			System.out.println(url);*/
			System.out.println(url);
			driver.close();

		}
	

	}

}
