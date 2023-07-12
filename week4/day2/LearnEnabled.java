package week4.day2;

import org.testng.annotations.Test;

public class LearnEnabled {

	

	@Test()
	public void editLead() {
		System.out.println("editLead");

	}
	
	@Test(enabled=false)
	public void deletelead() {
		System.out.println("deletelead");

	}

	@Test(priority=-1,enabled=false)
	public void creatLead() {
		System.out.println("creatLead");
	}
	
	@Test()
	public void duplicateLead() {
		System.out.println("duplicateLead");

	}
	
}
