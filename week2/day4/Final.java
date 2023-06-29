package week2.day4;

public class Final extends SBI1 {

	public int withdrawals() {
		
		return 1000000;
	}

	@Override
	public void fdRate() {
		
		System.out.println("6.5%");
	}
	
	public static void main(String[] args) {
		
	//	SBI1 s= new SBI1();-abstract class wecannot create object
		
		Final f= new Final();
		f.wintdrawallimit();
		f.kyc();
		f.fdRate();
		System.out.println(f.withdrawals());
	}

}
