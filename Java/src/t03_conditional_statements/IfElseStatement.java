package t03_conditional_statements;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("You can vote");	
		} else {
			System.out.println("You can't vote");	
		}
		
		
		System.out.print("Enter your weight: ");
		float weight = sc.nextFloat();
		
		if (weight <= 5) {
			System.out.print("Infant");
		} else {
			System.out.print("Young or old");
		}
	}

}
