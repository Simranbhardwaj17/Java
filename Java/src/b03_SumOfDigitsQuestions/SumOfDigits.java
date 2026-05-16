package b03_SumOfDigitsQuestions;

import java.util.Scanner;

//1.	Find the sum of digits of a number

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		while (num != 0) {
			int lastDigit = num % 10;
			sum += lastDigit;
			num /= 10;
		}
		System.out.print("Sum of digits is: " + sum);
	}
}
