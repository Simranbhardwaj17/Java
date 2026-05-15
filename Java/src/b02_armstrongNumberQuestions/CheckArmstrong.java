package b02_armstrongNumberQuestions;

import java.util.Scanner;

//1.	Check whether a number is an Armstrong number.

public class CheckArmstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		int original = num;
		int digitCount = 0, sum = 0;
		int temp = num; 
		
		while (temp != 0) {
			digitCount++;
			temp /= 10;
		}
		
		temp = num;
		while (temp != 0) {
			int digit = temp % 10;
			int power = (int) Math.pow(digit, digitCount);
			temp /= 10;
			sum += power;
		}

		if (original == sum) {
			System.out.print(original + " is armstrong number");
		}
	}

}
