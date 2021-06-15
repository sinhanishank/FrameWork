package CheckBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:/D:/HTML/checkbox.html");
        List<WebElement> we = driver.findElements(By.xpath("//input[@type='checkbox'][1]|//input[@type='checkbox'][last()]"));
		int count= we.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement chkbx=we.get(i);
			chkbx.click();
		}
	

	}

}
