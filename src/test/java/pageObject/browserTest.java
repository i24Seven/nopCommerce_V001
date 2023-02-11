package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserTest {
	public static WebDriver driver;
	
	@Test (priority=1)
	void launchBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		System.out.println("Chrome is Launched");
		Thread.sleep(2000);
		
	}
	@Test (priority=2)
	void openWebPage() throws InterruptedException {
		driver.get("https://amazon.com");
		System.out.println("Amazon WebPage opened.");
		Thread.sleep(2000);
	}
	
	@Test (priority=3)
	void closeBrowser() throws InterruptedException {
	
		driver.quit();
		System.out.println("Browser Closed successfully.");
		Thread.sleep(2000);
	}

}
