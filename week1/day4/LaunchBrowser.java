package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//version 4.6.0-selenium manager
		
		//before 4.6.0-webdrivermanager
		
		//step1
		ChromeDriver driver= new ChromeDriver();
		
		//step2
		driver.get("http://leaftaps.com/opentaps/control/main");
		//step--
		driver.manage().window().maximize();
		
		//syntax -driver.findElement(By.loactor("values"));
		
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(1000);
		driver.findElement(By.className("decorativeSubmit")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		
		Thread.sleep(5000);
		driver.close();
		

	}

}
