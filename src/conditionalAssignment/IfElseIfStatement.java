package conditionalAssignment;

public class IfElseIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int percentageScored = 75;
		System.out.println("Percentage of Student is  = " + percentageScored);

		if (percentageScored < 50) {
			System.out.println("Student gets Grade D");
		} else if (percentageScored >= 50 && percentageScored < 60) {
			System.out.println("Student will get grade C");
		} else if (percentageScored >= 60 && percentageScored < 75) {
			System.out.println("Student will get Grade B");
		} else {
			System.out.println("Student will get Grade A");
		}

	}
}
