package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001 extends BaseClass {

	@Test
	public void loginData() {
		
		LoginPage lp= new LoginPage(driver);
		
		System.out.println(driver);
		lp.enterUserName("DemoCsr").enterPassword("crmsfa")
		.clickOnLogin().clickOnCrmsfa();
	}
}
