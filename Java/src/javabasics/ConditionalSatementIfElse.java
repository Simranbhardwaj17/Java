package javabasics;

import java.util.Scanner;

public class ConditionalSatementIfElse {

	public static void main(String[] args) {
		
		// If Else
		
		boolean isSunUp = false;
		
		if(isSunUp == true) 
			System.out.println("day");
		else 
			System.out.println("night");
		
		
		
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = ip.nextInt();
		
		if(age > 18) 
			System.out.println("can vote");
		else 
			System.out.println("can't vote");

	}

}
