package b03_SumOfDigitsQuestions;

import java.util.Scanner;

//5.	Difference between even and odd digit sums

public class DifferenceEvenOdd {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		int oddSum = 0;
		int evenSum = 0;
		
		while (num != 0) {
			
			int lastDigit = num % 10;
			
			if (lastDigit % 2 == 0) {
				evenSum += lastDigit;
			} else oddSum += lastDigit;
			
			num /= 10;
		}
		
		System.out.print("Difference between even and odd digit sums is: " + (evenSum-oddSum));
		
	}

}
