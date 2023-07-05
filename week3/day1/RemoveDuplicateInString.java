package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateInString {

	public static void main(String[] args) {
		String data="TestLeaf";
		String output="";
		char[] ch = data.toCharArray();
		
		//set
		Set<Character> name=new LinkedHashSet<Character>();
		
		/*
		 * for (int i = 0; i < ch.length; i++) { name.add(ch[i]);
		 * 
		 * }
		 * 
		 * System.out.println(name);
		 */
		
		for (Character i : ch) {
			
			if(name.add(i)) {
				output=output+i;
			}
			
		}
		System.out.println(output);
		System.out.println(name);
	}

}
