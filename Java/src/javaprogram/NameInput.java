package javaprogram;

import java.util.Scanner;

public class NameInput {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String firstName = sc.nextLine();
		
		System.out.print("Enter your last name: ");
		String lastName = sc.nextLine();
		
		System.out.println("Your name is: " + firstName + " " + lastName);
		
	}

}
