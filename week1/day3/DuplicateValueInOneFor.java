package week1.day3;

import java.util.Arrays;

public class DuplicateValueInOneFor {

	public static void main(String[] args) {

		int[] data= {4,6,3,7,2,6,8,9,1,4};
		//1,2,3,4,4,6,6,7,8,9
		//0-9
		//data[8]==data[8+1]
		//9==data[10]
		
		Arrays.sort(data);
		
		for (int i = 0; i < data.length-1; i++) {
			
			if(data[i]==data[i+1]) {
				System.out.println(data[i+1]);
			}
		}
		
		int[] array = { 2, 3, 5, 4, 3, 1, 3, 2, 1, };

		Arrays.sort(array);

		int i, j, count;

		for (i = 0; i < array.length; i++) {
			count = 1;
			for (j = i + 1; j < array.length; j++) {
				if (array[j] == array[i]) {
					count++;
				} else {
					break;
				}
			}
			i = j - 1;
			if (count > 1) {
				System.out.println(array[i]);
			}

		}
	}

}
