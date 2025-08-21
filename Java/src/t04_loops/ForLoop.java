package t04_loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// see flowchart
		
		//Q. table of n, ask user to enter n 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of which multiplication table u want: ");
		int number = sc.nextInt();
		
		
		for(int i=1; i<=10; i++) {
//			System.out.println(number * i);
			int result = number * i;
			System.out.println(number+" * "+i+" = " + result);
		}
		
		
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
