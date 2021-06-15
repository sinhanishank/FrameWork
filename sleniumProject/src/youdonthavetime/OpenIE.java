package youdonthavetime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIE
{
public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver", "D:\\driver\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
	WebDriver driver= new InternetExplorerDriver();
	driver.get("https://www.selenium.dev/downloads/");
}
}
