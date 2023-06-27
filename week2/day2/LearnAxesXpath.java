package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAxesXpath {

	public static void main(String[] args) {
		////div[@class='nav-search-field ']/input
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='nav-search-field ']/input")).sendKeys("phones");
	}

}
