package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass{

	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	public CreateLeadPage enterCName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");

		return this;
	}

	public CreateLeadPage enterFName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dilip");
return this;
	}

	public CreateLeadPage enterLName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
return this;
	}

	public ViewPage clickCreateButton() {
		driver.findElement(By.name("submitButton")).click();

		return new ViewPage(driver);
	}



}
