package week3.day1;

public class LearnConstructor {

	int x;
	String name;
	
	//constructor
	public  LearnConstructor() {//default const or no agrs const
		System.out.println("default constructor");
		x=2023;
		name="TestLeaf";
		System.out.println(x+" "+name);
	}
	
	
	public LearnConstructor(int x,String name) {
		this();
		System.out.println("parameterized constructor");
		this.x=x;
		this.name=name;
		
		System.out.println("age is "+x+"name :"+name+" ");
	}
	
	
	public LearnConstructor(String comapanyname) {
		this(20,"dilip");
		System.out.println(comapanyname);
	}
	
	public void add() {
		System.out.println("add");
	}
	
	public static void main(String[] args) {
		/*
		 * LearnConstructor lc = new LearnConstructor();
		 * System.out.println("default values :"+lc.x);
		 * System.out.println("default values :"+lc.name);
		 * 
		 * LearnConstructor lc1 = new LearnConstructor(20,"Dilip"); LearnConstructor lc2
		 * = new LearnConstructor(21,"Gokul");
		 */
		
		LearnConstructor lc3 = new LearnConstructor("TestLeaf");
		
	}
}
