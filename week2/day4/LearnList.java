package week2.day4;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		List<String> mentors= new ArrayList<String>();
		List<String> mentors1= new ArrayList<String>();

		mentors.add("Dilip");
		mentors.add("Gokul");
		mentors.add("Vinoth");
		mentors.add("Ranjini");
		mentors.add("Ragu");
		mentors.add("Dilip");
		
		System.out.println(mentors);
		
		//addall-from one list to another list
		mentors1.addAll(mentors);
		mentors1.add("Subraja");
		mentors1.add("Aravind");
		
		System.out.println(mentors1);
		
		//size
		int size = mentors.size();
		
		System.out.println("size of mentors "+size);
		
		//get-index '0'
		String string = mentors.get(0);
		
		System.out.println(string);
		
		//add(int,string)
		
		mentors.add(2, "Ragu");
		
		System.out.println(mentors);
		
		//remove-index value 
		
		mentors.remove(2);
		System.out.println(mentors);
		
		//contains
		boolean contains = mentors.contains("Vinoth");
		System.out.println(contains);
		
		//remove all
		
		mentors1.removeAll(mentors);
		
		System.out.println(mentors1);
		
		//clear
		mentors1.clear();
		
		System.out.println(mentors1);
		
		
		
	}

}
