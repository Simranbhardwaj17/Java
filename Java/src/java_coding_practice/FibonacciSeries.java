package java_coding_practice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int count = sc.nextInt();  //Take Number of Fibonacci terms to generate
		
		int num1 = 0, num2 = 1, sum = 0;
		
		System.out.print(num1+ " " + num2);
		
		for (int i = 2; i < count; i++) {
			
			sum = num1 + num2;
			System.out.print(" " + sum);
			num1 = num2;
			num2 = sum;
			
		}
		
	}
	
}
