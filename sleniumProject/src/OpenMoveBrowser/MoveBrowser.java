package OpenMoveBrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveBrowser
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver_win32 (4)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	Dimension d= new Dimension(200, 200);
	driver.manage().window().setSize(d);
	Thread.sleep(2000);
	Point p= new Point(300, 200);
	driver.manage().window().setPosition(p);
	Thread.sleep(2000);
	driver.manage().window().maximize();
		
	}
}
	
