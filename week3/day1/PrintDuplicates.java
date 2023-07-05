package week3.day1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] num= {5,6,2,4,1,7,9,8,2,4};

		Set<Integer>unq=new LinkedHashSet<Integer>();
		Set<Integer>dup=new LinkedHashSet<Integer>();
		
		for (int i = 0; i < num.length; i++) {
		boolean add = unq.add(num[i]);
			if(!add) {
				dup.add(num[i]);
			}
		}
		
		System.out.println(unq);
		System.out.println(dup);
	}

}
