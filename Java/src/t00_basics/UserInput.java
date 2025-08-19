package t00_basics;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter your age: ");
//		int age = sc.nextInt();
//		System.out.println("Age is: " + age);
		
//		System.out.print("Enter 1st num: ");
//		int firstNum = sc.nextInt();
//		System.out.print("Enter 2nd num: ");
//		int secondNum = sc.nextInt();
//		
//		int result = firstNum + secondNum;
//		System.out.println("Result is: " + result);
//		sc.close();
		
		
		System.out.print("Enter 1st num: ");
		float firstNum = sc.nextFloat();
		System.out.print("Enter 2nd num: ");
		long secondNum = sc.nextLong();
		
//		int result = (int) (firstNum + secondNum);
		float result = firstNum + secondNum;
		System.out.println("Result is: " + result);
		sc.close();
	}

}
