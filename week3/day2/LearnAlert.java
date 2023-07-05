package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//driver control alert
		
		//simple alert
		Alert simple = driver.switchTo().alert();
		String text = simple.getText();
		System.out.println(text);
		simple.accept();
		
		Thread.sleep(2000);
		//confirm alert
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert confirm = driver.switchTo().alert();
		confirm.dismiss();
		Thread.sleep(2000);
		
		//sweet alert
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();

	}

}
