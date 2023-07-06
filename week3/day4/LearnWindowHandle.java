package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		
		//
		String parentwindow = driver.getTitle();
		System.out.println(parentwindow);
		
	//Open Multiple
		//driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//getwindowhandle-in this get one window data
		String c = driver.getWindowHandle();
		System.out.println(c);
		
		//
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println(windowHandles);
		//if you need handle particular window
		//set into list
		
		List<String> handle= new ArrayList<String>(windowHandles);
		
		//synatx
		
		driver.switchTo().window(handle.get(1));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("email")).sendKeys("dilip@testleaf.com");
		
		//child window close
		driver.close();
		
		driver.switchTo().window(handle.get(0));
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> handle2= new ArrayList<String>(windowHandles2);
driver.switchTo().window(handle2.get(2));
String title2 = driver.getTitle();
System.out.println(title2);
	}

}
