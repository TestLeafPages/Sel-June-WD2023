package stepsdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//public class SetpsDefinition extends Hooks{
//i will not allowed to extends stepdf and hooks


public class SetpsDefinition extends BaseClass{

//	 public ChromeDriver driver ;
//	 
//	  @Given ("Launch the browser and Load the url and Maximize screen") public
//	 void launchbrowser(){ driver = new ChromeDriver();
//	 driver.manage().window().maximize();
//	 driver.get("http://leaftaps.com/opentaps/control/main");
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); }
	 
	@And ("Enter the username as (.*)$")
	public void enterUsername(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}
	
	@And ("Enter the password as (.*)$")
	public void enterpassword(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	
	@When ("Click on the loginbutton")
	public void login() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	
	@Then ("verify my page sucessfully login")
	public void verifyMsg() {
		
		String title = driver.getTitle();
		if(title.contains("Leaftaps")) {
			System.out.println("passed");
		}else {
			System.out.println("failed");
		}
	}
	
	@But ("verify my page not sucessfully login")
	public void verify() {
		String title = driver.getTitle();
		if(title.contains("leaftaps")) {
			System.out.println("passed");
		}else {
			System.out.println("failed");
		}
	}

	@When ("Click on CRMSFA link")
	public void clickCrmSfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	
	@And ("Click on Leads link")
	public void clickLeads() {
		driver.findElement(By.linkText("Leads")).click();

	}
	
}
