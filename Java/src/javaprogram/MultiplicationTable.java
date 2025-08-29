package javaprogram;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// Multiplication Table Using ForLoop
		
		//table of n, ask user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of which multiplication table u want: ");
		int number = sc.nextInt();
		
		
		for(int i=1; i<=10; i++) {
//			System.out.println(number * i);
			int result = number * i;
			System.out.println(number+" * "+i+" = " + result);
		}

	}

}
