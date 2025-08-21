package t03_conditional_statements;

import java.util.Scanner;

public class IfElseUsingLogicalOp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter time: ");
		int time = sc.nextInt();
		
//		if (time >= 10 && time <= 21)
//			System.out.println("Office open");
//		else
//			System.out.println("Office closed");
		
		if (time == 12 || time == 18)
			System.out.println("Time to lunch");
		else
			System.out.println("Time to work");
		
	}

}
