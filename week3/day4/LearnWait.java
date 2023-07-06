package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWait {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/waits.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		WebElement text = driver.findElement(By.xpath("//span[text()='I am here']"));
		
		
		//Explicit wait
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(1));
		WebElement until = w.until(ExpectedConditions.visibilityOf(text));
		String text2 = until.getText();
		System.out.println(text2);
		
		
		
		
		
		
		
		
		
	}

}
