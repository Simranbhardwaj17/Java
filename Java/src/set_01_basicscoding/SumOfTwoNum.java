package set_01_basicscoding;

import java.util.Scanner;

public class SumOfTwoNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter 2nd number: ");
		int num2 = sc.nextInt();
		
		//using 3rd var
//		int num3 = num1 + num2; 
//		System.out.print("Sum of two numbers is: " + num3);
		
//		int num3 = addNum(num1, num2);
		System.out.print("Sum of two numbers is: " + addNum(num1, num2));
		
	}

	//using fn
	private static int addNum(int num1, int num2) {
		return num1 + num2;
	}
}
