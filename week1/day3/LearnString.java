package week1.day3;

public class LearnString {

	public static void main(String[] args) {
		/*
		 * split
		 * replace
		 * replaceAll
		 * loweracase
		 * uppercase
		 */
		
		String data="TestLeaf";
		//m7-lowercase
		
		String lowerCase = data.toLowerCase();
		System.out.println(lowerCase);
		
		//m8-uppercase
		
		String upperCase = data.toUpperCase();
		System.out.println(upperCase);
		
		
		//m9-replace
		//D@@@p
		//D@ip
		String name="Dilip";
		//i,il,Dilip/ili
		String replace = name.replace("p", "@");
		System.out.println(replace);
		
		//m-10 replaceAll
		String input="Amazon 100 Development product 1000";
		String replaceAll = input.replaceAll("[A-Z]", "");
		
		System.out.println(replaceAll);
		
		//m-10 split
		
		String ip="Amazon development center Chennai";
		//output = chennai center development amazon
		ip=ip.toLowerCase();
		
		String[] split = ip.split(" ");
		
		//amazondevelopmentcenterchennai
		for (int i = split.length-1; i>=0; i--) {
			
			
			System.out.print(split[i]+" ");
			//chennaicenterdevelopmentamazon
		}
		
		System.out.println(" ");
		
		String ip1="Amazon development center Chennai";
		String[] split1 = ip1.split(" ");
		for (int i = 0; i < split1.length; i++) {
			
			System.out.println(split1[i]);
		}
	}

}
