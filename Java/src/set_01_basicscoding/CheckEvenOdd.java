package set_01_basicscoding;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
//		if-else
		if(num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
		
		System.out.println(toCheckNum(num));
		
//		ternary operator
		String check = (num %2 == 0) ? "even" : "odd";
		System.out.println(num + " is " + check);
	}
	
//	using fn
	public static String toCheckNum (int num) {
		if(num % 2 == 0) {
			return num + " is even";
		} else {
			return num + " is odd";
		}
	}
}
