package javaprogram;

import java.util.Scanner;

public class DoWhileExe {

	public static void main(String[] args) {
		// Take only positive user input 
		
		int num;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number: ");
			num = sc.nextInt();
			
			System.out.print("Your number is: ");
			System.out.println(num);
			num++;
			
		} while (num >= 0);
		
		System.out.println("THE END");
	}
}
