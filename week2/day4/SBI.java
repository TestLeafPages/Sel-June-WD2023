package week2.day4;

public class SBI implements RBI ,RBI1{

	public int withdrawals() {
		
		return 1000000;
	}

	public void kyc() {
		
		System.out.println("pan card");
	}
	
	public static void main(String[] args) {
		
		
		//RBI rbi= new RBI();-> we cannot create object interface
	
	SBI sbi=new SBI();
	System.out.println(sbi.withdrawals());
	
	sbi.kyc();
	
	}

	public void rdRate() {
		// TODO Auto-generated method stub
		
	}

}
