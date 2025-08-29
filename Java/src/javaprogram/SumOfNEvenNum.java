package javaprogram;

import java.util.Scanner;

public class SumOfNEvenNum {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N even number of which summation u want: ");
		int count = sc.nextInt();
		
		int sum = 0;  //must initialize
		for(int i = 1; i <= count; i++) {
//			sum = sum + 2*i;
			sum += 2*i;
//			System.out.println(2*i);
		}
		System.out.println("Sum is: " + sum);
	}

}
