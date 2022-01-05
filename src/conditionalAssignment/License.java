package conditionalAssignment;

public class License {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age =20;
		boolean condition1 = age==18;
		boolean condition2 = age==19;
		
		
	
		if (age>=18) {

		System.out.println("Yes! License will be issued");
		if(condition1) {
			System.out.println("G1 License will be issued");
		}
		if (condition2) {
			System.out.println("G2 License will be issued");
		}
		else {
			System.out.println("G License will be issued");
		}
				
		}
		  	
		else {
			System.out.println("No license will be issued");
		}

	}
}