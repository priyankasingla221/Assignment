package conditionalAssignment;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 100;
		int num2 = 55;
		int num3 = 660;
		
		System.out.println("Value of Number 1 = " +num1);
		System.out.println("Value of Number 2 = " +num2);
		System.out.println("Value of Number 3 = " +num3);

		if (num1 > num2 && num1 > num3) {
			System.out.println(" Number 1 is Greater");
		} else if (num2 > num3) {
			System.out.println("Number 2 is Greater");
		} else {
			System.out.println("Number 3 is Greater");
		}

	}

}