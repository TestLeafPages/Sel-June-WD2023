package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSnapShot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		//step1
		File scr = login.getScreenshotAs(OutputType.FILE);
		//step2
		File des= new File("./snaps/img1.png");
		
		//step3
		
		FileUtils.copyFile(scr, des);
		

	}

}
