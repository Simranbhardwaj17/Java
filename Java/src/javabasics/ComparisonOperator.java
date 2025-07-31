package javabasics;

import java.util.Scanner;

public class ComparisonOperator {

	public static void main(String[] args) {
		
		// Comparison Operator
		// a == b
		// a != b
		// a > b
		// a < b
		// a >= b
		// a <= b
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		int num1 = sc.nextInt();
		System.out.println(num1);
		
		
		System.out.print("Enter 2nd number: ");
		int num2 = sc.nextInt();
		System.out.println(num2);
		
		if(num1 > num2) 
			System.out.println(num1 + " is max");
		else
			System.out.println(num1 + " is min");
		
		
		if(num1 == num2) 
			System.out.println("num r same");
		else
			System.out.println("numbers r differ");		
	}

}
