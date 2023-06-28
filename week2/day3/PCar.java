package week2.day3;

public class PCar extends GfVehicle {

	
	public void airCondition() {
		System.out.println("its coming P AC");
	}
	
	public void changeGear() {
		System.out.println("its coming P Gear");

	}
	
	public static void main(String[] args) {
		PCar p=new PCar();
		p.brake();
		p.horn();
		p.airCondition();
		p.changeGear();
		
	}
}
