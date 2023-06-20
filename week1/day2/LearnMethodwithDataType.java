package week1.day2;

public class LearnMethodwithDataType {

	public int add(int a,int b) {
		return a+b;
		
	}
	
	public int sub(int a,int b) {
		return a-b;
		
	}
	public static void main(String[] args) {
		
		LearnMethodwithDataType obj=new LearnMethodwithDataType();
		//m1
		System.out.println(obj.add(7, 8));
		
		//m2
		//local variable-ctrl +2 ,l
		int sub = obj.sub(10, 5);
		System.out.println(sub);
	}
}
