package t03_conditional_statements;

import java.util.Scanner;

public class Nested_IfElse {

	public static void main(String[] args) {
		
		// You are given 3 num, find max
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter all three numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("1st num is greater than 2nd num");
			if (num1 > num3) {
				System.out.println("1st num is greater than 3rd num");
				System.out.println("1st num is max");
			} else {
				System.out.println("3rd num is greater than 1st num");
				System.out.println("3rd num is max");
			}
		} else {
			System.out.println("2nd num is greater than 1st num");
			if (num2 > num3) {
				System.out.println("2nd num is greater than 3rd num");
				System.out.println("2nd num is max");
			} else {
				System.out.println("3rd num is greater than 2nd num");
				System.out.print("3rd num is max");
			}
			
		} 
	}

}
