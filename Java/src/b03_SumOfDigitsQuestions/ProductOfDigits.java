package b03_SumOfDigitsQuestions;

import java.util.Scanner;

//4.	Product of digits of a number

public class ProductOfDigits {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		int product = 1;
		
		while (num != 0) {
			int lastDigit = num % 10;
			product *= lastDigit;
			num /= 10;
		}
		
		System.out.print("Product of digits is: " + product);

	}

}
