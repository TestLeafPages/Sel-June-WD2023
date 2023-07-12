package week4.day2;

import org.testng.annotations.Test;

public class LearnPriority {

	
	
	@Test(priority=1)
	public void editLead() {
		System.out.println("editLead");

	}
	
	@Test
	public void deletelead() {
		System.out.println("deletelead");

	}

	@Test(priority=3)
	public void creatLead() {
		System.out.println("creatLead");
	}
	
	@Test(priority=-2)
	public void duplicateLead() {
		System.out.println("duplicateLead");

	}
	
	
}
