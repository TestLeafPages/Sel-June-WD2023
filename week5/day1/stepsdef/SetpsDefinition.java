package stepsdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SetpsDefinition {

	public ChromeDriver driver ;
	
	@Given ("Launch the browser and Load the url and Maximize screen")
	public void launchbrowser(){
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@And ("Enter the username")
	public void enterUsername() {
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
	}
	
	@And ("Enter the password")
	public void enterpassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	
	@When ("Click on the loginbutton")
	public void login() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	
	@Then ("verify that login passed")
	public void verifyMsg() {
		
		String title = driver.getTitle();
		if(title.contains("Leaftaps")) {
			System.out.println("passed");
		}else {
			System.out.println("failed");
		}
	}

	
}
