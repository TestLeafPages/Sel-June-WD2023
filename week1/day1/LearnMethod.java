package week1.day1;

public class LearnMethod {
	
	public void noOfWheel() {
		System.out.println("noOfWheel :4");
	}
	
	public void modelNo() {
		System.out.println("Model : c34");
		
	}
	
	private void brandName() {
		System.out.println("BMW");
	}
	
	void ac() {
		System.out.println("Turn ON AC");
	}
	
	
public static void main(String[] args) {
	//step-1
	//classname objname=new classname();
	
	LearnMethod lm=new LearnMethod();
	
	//step2
	//objectName.method();
	
	lm.noOfWheel();
	lm.modelNo();
	lm.brandName();
	lm.ac();
	
	
}
}
