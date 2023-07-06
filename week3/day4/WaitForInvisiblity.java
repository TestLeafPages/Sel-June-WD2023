package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForInvisiblity {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/waits.xhtml");
		
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		
		WebDriverWait w1= new WebDriverWait(driver,Duration.ofSeconds(10));
		Boolean until = w1.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//span[text()='I am about to hide']"))));
		
		//w1.until(ExpectedConditions.no)
System.out.println(until);
	}

}
