package week2.day3;

public class CBMW extends PCar  {

	public void sunRoof() {
		System.out.println("its coming from C sunroof");
	}
	
	public static void main(String[] args) {
		CBMW c=new CBMW();
		c.airCondition();
		c.brake();
		c.horn();
		c.changeGear();
		c.sunRoof();
	}
}
