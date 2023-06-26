package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBasicXpath {

	
		public static void main(String[] args) {
			ChromeDriver driver= new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesManager");
			driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
			driver.findElement(By.xpath("(//input[contains(@class,'tiveSub')])")).click();

			driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
	}

}
