package conditionalAssignment;

public class PromoDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int price= 100;
		double discount = price * 0.50;
		double finalvalue=price - discount ;
		System.out.println("Price of product= " +price);
		System.out.println("50% sale product after discount=" +finalvalue);
		
		double promo5 = finalvalue * 0.05;
		double finalvaluePromo5=finalvalue-promo5 ;
		System.out.println("After applying 5% additional discount=" +finalvaluePromo5);
		
		
		double promo10 = finalvalue *0.10;
		double finalvaluePromo10=finalvalue - promo10 ;
		System.out.println("After applying 10% additional discount=" +finalvaluePromo10);
		
		
		double promo20 = finalvalue * 0.20;
		double finalvaluePromo20=finalvalue - promo20 ;
		System.out.println("After applying 20% additional discount=" +finalvaluePromo20); 
		
		
		
		
		
		
		
		
	}
}
