package week2.day3;

public class ChildMethodOverriding  extends ParentMethodOverriding{

	
	public void phone() {
		System.out.println("iphone");
	}
	
	
	public static void main(String[] args) {
		ChildMethodOverriding ov=new ChildMethodOverriding();
		
		ov.phone();
		
		//method overloading
		String data="testleaf";
		data.substring(0);
		data.substring(0, 0);
	}
	
	
}
