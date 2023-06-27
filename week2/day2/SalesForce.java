package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@id='username_container']/input")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.xpath("//form[@id='login_form']/input")).sendKeys("Leaf@1234");
		
		driver.findElement(By.xpath("(//form[@id='login_form']/input)[2]")).click();
		
		

	}

}
