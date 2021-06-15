package ListBoxSelection;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchingAnElement 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter country name");
		Scanner sc = new Scanner(System.in);
		String eText=sc.next();
		int found=0;
		System.out.println("seaching........");
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///D:/HTML/multiple.html");
		WebElement country_name= driver.findElement(By.name("country"));
		Select select= new Select(country_name);
		List<WebElement>alloption=select.getOptions();
		for(int i=0; i<alloption.size();i++)
		{
			String atext=alloption.get(i).getText();
			if(eText.equalsIgnoreCase(atext) )
			{
				found++;
			}
			
		}
			if(found==0)
			{
				System.out.println(eText +"  Country found");
			}
			else
			{
				System.out.println("country not found");
			}
			driver.close();
				
		}
	
	}
