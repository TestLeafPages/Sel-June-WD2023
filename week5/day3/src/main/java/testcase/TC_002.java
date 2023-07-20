package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002 extends BaseClass{


	@Test
	public void CreateLead() {
		
		LoginPage lp= new LoginPage(driver);
		System.out.println(driver);
		lp.enterUserName("DemoCsr").enterPassword("crmsfa")
		.clickOnLogin().clickOnCrmsfa().clickOnLeads()
		.clickOnCreateLead().enterCName().enterFName().enterLName()
		.clickCreateButton().viewPage();
	}
}
