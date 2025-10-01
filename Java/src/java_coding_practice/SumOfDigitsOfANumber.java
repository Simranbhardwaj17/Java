package java_coding_practice;

import java.util.Scanner;

public class SumOfDigitsOfANumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		while (num > 0) {
//			int lastDig = num % 10;
//			sum = sum + lastDig;
//			num = num/10;
			
			sum = sum + num % 10;
			num = num/10;
			
		}
		System.out.println(sum);

	}

}
