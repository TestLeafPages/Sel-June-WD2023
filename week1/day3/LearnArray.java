package week1.day3;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		
		//method 1
		//syntax
		int[] marks= {23,45,43,56,35,40};
		//0-23,1-45,2-43,3-56,4-35,5-40
		
		//index start with'0'
		//local -ctrl+2-l
		int length = marks.length;
		
		System.out.println("array length :"+length);
		
		//print first mark 
		System.out.println("first mark :"+marks[0]);
		
		//print last mark(6-1=5)marks[5]
		System.out.println("last mark :"+marks[length-1]);

		
		//sorts
		Arrays.sort(marks);
		//23,35,40,43,45,56
		//0,1,2,3,4,5
		System.out.println("after sorting last mark :"+marks[length-1]);
		
		
		for (int i = 0; i <length; i++) {
			System.out.println(marks[i]);
			
		}
		
	}

}
