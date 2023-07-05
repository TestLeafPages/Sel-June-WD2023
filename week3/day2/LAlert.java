package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

	//	driver.findElement(By.xpath("//span[text()='Show']")).click();

		driver.findElement(By.xpath("//i[contains(@class ,'pi-home')]")).click();

		// driver control alert
		
		  
		 //simple alert
		Alert simple = driver.switchTo().alert(); 
		String text =simple.getText(); 
		System.out.println(text);
		simple.accept();
		 
	}

}
