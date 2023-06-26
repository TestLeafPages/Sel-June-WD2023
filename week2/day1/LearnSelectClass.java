package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		
		//select class
		//return for findElement->WebElement
		//ctrl+2->l
		WebElement op = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//syntax
		Select options=new Select(op);
		//m1
		options.selectByIndex(4);
		
		
	//createLeadForm_marketingCampaignId
		WebElement op1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));

		Select options1= new Select(op1);
		//m2
		options1.selectByValue("CATRQ_AUTOMOBILE");

	}

}
