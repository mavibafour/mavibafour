package selePro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowsers {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Automation Softwares\\MyWorkspace2\\AutomationConcepts\\drivers\\chromedriver.exe");
		
		WebDriver driver =new  ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://way2automation.com/way2auto_jquery/index.php");

	}

}
