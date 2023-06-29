package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDuplicateValue {

	public static void main(String[] args) {
		
		int[] data= {2,4,1,5,7,9,8,4,5,6};
		
		List<Integer> num=new ArrayList<Integer>();
		
		for (int i = 0; i < data.length; i++) {
			num.add(data[i]);
		}
		
		System.out.println(num);
		
		//sort
		Collections.sort(num);
		
		System.out.println(num);
		
		for (int i = 0; i < num.size()-1; i++) {
			
			if(num.get(i)==num.get(i+1)) {
				System.out.println(num.get(i));
			}
		}
	}

}
