package java_coding_practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		//Using loop & operator
//		int rev = 0;
//		
//		while (num > 0) {   // num != 0
//			rev = rev * 10 + num % 10;
//			num = num / 10;
//		}
		
		//Using StringBuffer class
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		
		System.out.println("Reverse number is: " + rev);
	}

}

//Convert the integer to a string to preserve the leading zero
//Import the StringBuilder class (to convert int to str)