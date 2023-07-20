
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass{

	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	
	public LoginPage enterUserName(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);

		//m1
		/*
		 * LoginPage lp=new LoginPage(); 
		 * return lp;
		 */
		
		//m2
		return this;
	}
	
	public LoginPage enterPassword(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);

		return this;
	}
	
	public HomePage clickOnLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

		//m1
		/*
		 * HomePage hp=new HomePage(); return hp;
		 */
		
		//m2
		return new HomePage(driver);
	}
	
}
