package week3.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSET {

	public static void main(String[] args) {
		
		int[] num= {4,6,3,1,9,7,6,2,9,4};
		//
		Set<Integer> data= new TreeSet<Integer>();
	
		for (int i = 0; i < num.length; i++) {
			
			data.add(num[i]);
		}

		System.out.println(data);
	}

}
