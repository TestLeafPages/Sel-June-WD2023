 package challenges;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class DynamicData {
@Test(invocationCount=3,threadPoolSize=2)
	public  void learnToCreate() {
		Faker fake = new Faker();
		
			
		String userName = fake.name().username();
		System.out.println(userName);
		String firstName = fake.name().firstName();
		System.out.println(firstName);
		String lastName = fake.name().lastName(); 
		System.out.println(lastName);
		String companyname = fake.company().name();
		System.out.println(companyname);

		String cellPhone = fake.phoneNumber().cellPhone();
		System.out.println(cellPhone);
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(cellPhone);
		driver.findElement(By.name("submitButton")).click();
	}

}
