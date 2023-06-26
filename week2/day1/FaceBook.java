package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'account')]")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Dilip");
		
		//get title 
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//get url
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//print text in console
		
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text);
		
		//more one than action
		
		WebElement ada = driver.findElement(By.id("updateLeadForm_companyName"));
		ada.clear();
		ada.sendKeys("");

	}

}
