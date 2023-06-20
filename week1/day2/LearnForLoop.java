package week1.day2;

public class LearnForLoop {

	public static void main(String[] args) {
//1-100
		
		int num=10;
		//syntax
		//for-ctrl+space,click option 2
		//i=0---inital value
		//i<10,i<num---condition
		//i++-increment-i=i+1
		for (int i = 5; i <=num; i++) {
			
			if(i==8) {
				System.out.println("i reached"+i);
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("*************************");

	
		for (int i = 10; i >=5; i--) {
			
			if(i==7) {
				System.out.println("i reached "+i);
				continue;
			}
			System.out.println(i);
		}
	
	}

}
