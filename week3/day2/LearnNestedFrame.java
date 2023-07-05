package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		//1st
		driver.switchTo().frame(2);
		
		//2nd frame
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();

		//switch to first frame
		driver.switchTo().parentFrame();//1st access
		
		//main page 
		driver.switchTo().defaultContent();

	}

}
