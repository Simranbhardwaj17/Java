package b03_SumOfDigitsQuestions;

import java.util.Scanner;

//3.	Sum of odd digits in a number

public class SumOddDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		while (num != 0) {
			int lastDigit = num % 10;
			if (lastDigit % 2 != 0) {
				sum += lastDigit;
			}
			num /= 10;
		}
		
		System.out.print("Sum of odd digits is: " + sum);
		
	}

}
