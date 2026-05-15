package b02_armstrongNumberQuestions;

import java.util.Scanner;

//5.	Check Armstrong number without using power function.

public class ArmstrongWithoutPowerFn {
	
	static int powerFn (int base, int exp) {
		int result = 1;
		
		for (int  i = 1; i <= exp; i++) {
			result *= base;
		}
		
		return result;
	}
	
	static boolean isArmstrong(int num) {
		int originalNum = num;
		int sum = 0, digitCount = 0;
		int temp = num;
		int digit;
		
		while(temp != 0) {
			digitCount++;
			temp /= 10;
		}
		
		temp = num;
		while (temp != 0) {
			digit = temp % 10; 
			temp /= 10;
			sum = sum + powerFn(digit, digitCount);
		}
		return sum == originalNum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		if (isArmstrong(num)) {
			System.out.println(num + " is Armstrong");
        } else {
            System.out.println(num + " is not Armstrong");
        }
	}
}
