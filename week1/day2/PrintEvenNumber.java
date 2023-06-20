package week1.day2;

public class PrintEvenNumber {

	public static void main(String[] args) {
		int num=20;
		//= 
		//l==r
		
		for (int i = 0; i <=num; i++) {
			if(i%2==0) {
				
				if(i==18) {
					continue;
				}
				System.out.println("even number :"+i);
			}
			
		}

	}

}
