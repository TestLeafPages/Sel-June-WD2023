package week1.day3;

public class LearnStringMethods {

	public static void main(String[] args) {
		//method 1 syntax
		//index=0
		String name="TestLeaf";
		
		String name1="Testleaf";
		
		//method 2 syntax
		
		String data= new String("TestLeaf");
		
		String data1= new String("TestLeaf");
		
		//m1-length()-method
		int length = name.length();
		System.out.println("String length :"+length);
		
		//m2-equals() & == memory address
		
		if(name.equals(data)) {
			System.out.println("same values");
		}else {
			System.out.println("different values");
		}
		
		if(name==data) {
			System.out.println("== same values");
		}else {
			System.out.println("== different values");
		}
		
		//m3-equalingorecase()
		
		if(name.equalsIgnoreCase(name1)){
			System.out.println(" EIC same values");
		}else {
			System.out.println("EIC different values");
		}
		
		//m4-contains()
		//TestLeaf
		
		boolean contains = name.contains("tLe");
		
		System.out.println(contains);
		
		//m5- toCharArray
		//faeLtseT
		String company="TestLeaf";
		
		char[] charArray = company.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
			
		}
		System.out.println(" ");
		
		for (int i =  charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
		
		System.out.println(" ");
		//m6-charAt()
		
		char charAt = name.charAt(8);
		System.out.println(charAt);
		
		
		
		
		
		
		
		

	}

}
