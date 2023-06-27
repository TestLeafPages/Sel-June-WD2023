package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyTheValue {

	public static void main(String[] args) {
		////input[contains(@class,'input__field-2')]/ancestor::div[@class='searchbox']
		
		

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://buythevalue.in/#");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@class,'input__field-2')]/ancestor::div[@class='searchbox']")).sendKeys("phones");
	}

}
