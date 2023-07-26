package week6.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnAssertion {

	
	@Test
	public  void runCreate() {
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		String actualTitle="Leaftaps";
		
		String expectTitle = driver.getTitle();
		/*
		 * //hard assert
		 *  Assert.assertEquals(actualTitle, expectTitle);
		 *  
		 *   //hard assert-once condition is not satisfied it will stop execution
		 */
		
		
		
		//soft assert
		//soft assert we need create object
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualTitle, expectTitle);
		
		
		
		
		System.out.println("login successfully");
		driver.findElement(By.partialLinkText("CRM")).click();


		//end program 
		s.assertAll();
	}

}
