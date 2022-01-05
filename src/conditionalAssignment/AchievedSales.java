package conditionalAssignment;

public class AchievedSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int achievedSales = 20;
		int targetgoal = 100;
		
		
		double goal50 = achievedSales * 0.50;
		
		double goal70 = achievedSales * 0.70;
		
		if(goal50 <= targetgoal)
		{
			System.out.println("Commision rate is 1% " );
		}
		else if (goal70 <= targetgoal)
		
		{
			System.out.println("Commision rate is 5% " );
		}
		else if (goal70 > targetgoal)
		{
			System.out.println("Commision rate is 10%  ");
		}
	
	}
}
