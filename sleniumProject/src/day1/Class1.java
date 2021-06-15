package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		String url=driver.getCurrentUrl();
		String title =driver.getTitle();
		
		if(title.equalsIgnoreCase("SeleniumHQ Browser Automation"))
		{
			System.out.println("Title of the Page is  " +title);
		}
		
		
		else
		{
			System.out.println("Title is not matched");
		}
		
		if(url.contentEquals("https://www.selenium.dev/"))
		{
			System.out.println("Page current url is " + url);
		}
		else
		{
			System.out.println("url is not matched");
		}
		driver.close();
		
		}
		
	

	}


