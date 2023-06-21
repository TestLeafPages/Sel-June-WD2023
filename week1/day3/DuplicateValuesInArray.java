package week1.day3;

public class DuplicateValuesInArray {

	public static void main(String[] args) {
		
		int[] num= {2,5,7,2,1,8,5,3,9,4,6,10,34};
		//duplicate
		//compare the value
		//forloop ,if condition
		
		//nested for loop--- for inside another for
		//i=1,j=1+1=2s
		for (int i = 0; i < num.length; i++) {
			
			for (int j = i+1; j < num.length; j++) {
				if(num[i]==num[j]) {
					System.out.println("duplicate value :"+num[j]);
				}
			}
		}
	}

}
