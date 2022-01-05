package conditionalAssignment;

public class MultipleIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int integer1 = 44;
		int integer2 = 22;
		int result = integer1 % integer2;

		System.out.println("Enter First integer = " + integer1);
		System.out.println("Enter Second integer = " + integer2);
		if (result == 0) {
			System.out.println("Yes!!! They are Multiple of each other");
		} else {
			System.out.println("No! They are not  Multiple of each other");
		}
	}
}
