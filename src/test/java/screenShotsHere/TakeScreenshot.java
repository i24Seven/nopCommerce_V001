package screenShotsHere;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {
	public static WebDriver driver;

	@Test(priority = 1)
	void browserOpen() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://yahoo.com");
		System.out.println("Browser is Opened...");
		
	}

	@Test (priority=2)
	void screenshotPage() {
	
	//creating java timestamp
	DateFormat df=new SimpleDateFormat("dd_MM-YYYY HH:MM:SS");
	Date d=new Date();
	String Datef=df.format(d);
	
	//take screenshot and store into in a variable.
	File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		//copy screenshot into your local system
		FileUtils.copyFile(scr, new File("D:\\AUTOMATION\\WORK_PLACE\\"+Datef+" "+"homepage.jpg"));
	}catch(Throwable t) {
		System.out.println(t.getMessage());
	}
	
	System.out.println("Screen shot has been taken., please go to the location and check it.");
	
	}
	
	@Test (priority=3)
	void closeBrowser() {
		System.out.println("Broser is closed...");
		driver.quit();
	}
}
