package week2.day3;

public class LearnMethodOverLoading {

	public void add(int a,int b) {
		
		System.out.println(a+b);
	}
	
	public void add(int a,int c,int d) {
		System.out.println(a+c+d);
	}
	
	public float add(int a,float b) {
		//System.out.println(a+b);
		return a+b;
	}
	
	public void add(float b,int a) {
		System.out.println(a+b);
	}
	
	public void add(int age,String name) {
		System.out.println(age+" "+name);
	}
	
	public static void main(String[] args) {
		
		LearnMethodOverLoading ol=new LearnMethodOverLoading();
		ol.add(5, 5);
		ol.add(2, 18, 5);
	System.out.println(ol.add(6, 7.6f));
		ol.add(8.5f, 9);
		ol.add(25, "Dilip");
	}
	
}
