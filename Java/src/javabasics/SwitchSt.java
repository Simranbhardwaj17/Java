package javabasics;

import java.util.Scanner;

public class SwitchSt {

	public static void main(String[] args) {
		
//		day 1= mon, day 2= tue
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day from 1 to 7: ");
		int day = sc.nextInt();
		
		switch(day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2: 
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4: 
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6: 
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default: 
				System.out.println("Not valid value");
		}
	}
}
