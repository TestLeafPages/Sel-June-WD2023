package week4.day3;

import org.testng.annotations.Test;

public class LearnDependsOnMethods {

	@Test(priority=2)
	public void createlead() {
		System.out.println("creatlead");

	}
	
	@Test(priority=1,dependsOnMethods = {"createlead","mergelead"})
	public void editlead() {
		System.out.println("editlead");

	}
	
	@Test(enabled=false,dependsOnMethods = "editlead")
	public void deletelead() {
		System.out.println("deletelead");

	}
	
	
	
	@Test()
	public void mergelead() {
		System.out.println("mergelead");

	}
	
	
	@Test()
	public void duplicatelead() {
		System.out.println("duplicatelead");
	}
}
