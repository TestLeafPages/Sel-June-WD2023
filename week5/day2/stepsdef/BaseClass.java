package stepsdef;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass  extends AbstractTestNGCucumberTests{
	
	//	 public  ChromeDriver driver ;
	//null pointer exp -resolve this i used static keyword

	 public static ChromeDriver driver ;
	 
	 @BeforeMethod
		public void precondition() {
			
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("http://leaftaps.com/opentaps/control/main");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
			 
		}
		@AfterMethod
		public void postcondition() {
			driver.close();
		}
}
