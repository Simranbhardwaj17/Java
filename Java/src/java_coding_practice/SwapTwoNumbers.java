package java_coding_practice;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1st num: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter 2nd num: ");
		int num2 = sc.nextInt();

		System.out.println("Before reverse");
		System.out.println("1st num is: " + num1 + " 2nd num is: " + num2);
		
		//Using 3rd var
//		int temp;
//		
//		temp = num1;
//		num1 = num2;
//		num2 = temp;
		
		
		//Using + & -
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After reverse");
		System.out.println("1st num is: " + num1 + " 2nd num is: " + num2);
		
	}

}
