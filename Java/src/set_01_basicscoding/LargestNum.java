package set_01_basicscoding;

import java.util.Scanner;

public class LargestNum {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter 2nd number: ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter 3rd number: ");
		int num3 = sc.nextInt();
		
		//if else-if
		if (num1>num2 && num1>num3) {
			System.out.print(num1 + " is largest ");
		} else if (num2>num3 && num2>num1) {
			System.out.print(num2 + " is largest");
		} else {
			System.out.print(num3 + " is largest");
		}
		
//		if (num1>num2 && num1>num3) System.out.print(num1 + " is largest ");
//	    else if (num2>num3 && num2>num1) System.out.print(num2 + " is largest");
//		else System.out.print(num3 + " is largest");
	}
}
