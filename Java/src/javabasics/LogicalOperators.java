package javabasics;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		
		// && - logical AND
		int a = 40;
		int b = 30;

		if (a < 90 && b < 90)
			System.out.println("a & b r less than 90");
		
		
		// || - logical OR
		if (a < 90 || b < 90)
			System.out.println("atleast one num less than 90");
		
		
		// ! - negation
		boolean isAdult = false;
		if(!isAdult) 
			System.out.println("is adult"); 
		else 
			System.out.println("not adult");  //is adult
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter cash: ");
		int cash = sc.nextInt();
		//pen- 10  book - 40
		if(cash < 10) {
			System.out.println("Cash is insufficient");
			System.out.println("Can't buy anything");
		}
		else if (cash > 10 && cash < 50) {
			System.out.println("Can buy only one");
		}
		else {
			System.out.println("Buy anything");
		}
		
	}

}
