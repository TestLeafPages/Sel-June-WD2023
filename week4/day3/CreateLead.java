package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{
	
	@DataProvider(name="getdata")
	public String[][] setdata(){
		String[][] data= new String[2][4];
		data[0][0]="TestLeaf";
		data[0][1]="Dilip";
		data[0][2]="V R";
		data[0][3]="1234567890";
		
		data[1][0]="TestLeaf";
		data[1][1]="Vinoth";
		data[1][2]="S";
		data[1][3]="987654321";
		
		return data;
	}
	
	@Test(invocationCount = 2,dataProvider = "getdata")
	public  void runCreate(String cname,String fname,String lname,String ph) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(ph);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		

	}
	
	

}
