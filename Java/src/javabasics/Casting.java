package javabasics;

public class Casting {

	public static void main(String[] args) {
		// Java not allow to implicit convert double into int coz of loosing info but reverse is allowed
		//Implicit casting :- conversion from small DT(int) to lg(double)
		double price = 30.00;
		double finalPrice = price + 21;  //here 21 is int
		System.out.println(finalPrice);   //o/p: 51.0
		
		
		//Explicit casting :- conversion from lg DT(double) to sm(int)
		int cost = 59;
		int totalCost = cost + (int)13.80; //13.00 is double   or (int) (cost + 13.00   cast to int
		System.out.println(totalCost);  //o/p: 72
		
		
		//change type of totalCost2 to double
		int cost2 = 59;
		double totalCost2 = cost2 + 13.80; 
		System.out.println(totalCost2);  //o/p: 72.8
	}

}
//we can't convert str to int