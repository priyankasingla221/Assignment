package conditionalAssignment;

public class ParkRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int heightCondition1 = 25;
		int hightCondition2 = 150;

		System.out.println("First Value of height in cm  " + heightCondition1+   "\nSecond Value of geight in cm  " + hightCondition2);
		

		if (heightCondition1 < 90) {
			if (hightCondition2 <= 200) {
				System.out.println("You are eligible to go on ride");
			} else {
				System.out.println("You are not eligible to  go on ride");
			}
		}
	}
}