package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

//parallel
	public ChromeDriver driver;
	
	
	//for parallel exc -static keyword will not work
	//seq
	//public static ChromeDriver driver;

	@BeforeMethod
	public void preCondition() {
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	
	@AfterMethod
	public void postCondition() {
		
		driver.close();

	}
}
