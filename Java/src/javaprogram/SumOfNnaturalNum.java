package javaprogram;

import java.util.Scanner;

public class SumOfNnaturalNum {

	public static void main(String[] args) {
		//
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N natural number of which summation u want: ");
		int count = sc.nextInt();
		
		int sum = 0;  //must initialize
		for(int i = 1; i <= count; i++) {
//			sum = sum + i;
			sum = (count*(count+1))/2;
		}
		System.out.println("Sum is: " + sum);
		
		
		//Average of sum 
		int avg = sum/count;
		System.out.println("Average of sum is: " + avg);

	}

}
