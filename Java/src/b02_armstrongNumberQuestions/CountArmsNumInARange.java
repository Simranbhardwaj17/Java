package b02_armstrongNumberQuestions;

import java.util.Scanner;

//3.	Count Armstrong numbers in a given range.

public class CountArmsNumInARange {
	
	static boolean isArmstrong(int num) {
        int original = num;
        int digitCount = 0;
        int sum = 0;
        int temp = num;

        // Count digits 
//        int digits = String.valueOf(num).length();
        while (temp > 0) {
			digitCount++;
			temp /= 10;
		}

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digitCount);
            num /= 10;
        }

        return sum == original;
    }


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter start/lower limit of range: ");
		int start = sc.nextInt();
		
		System.out.print("Enter end/upper limit of range: ");
		int end = sc.nextInt();

		int count = 0;

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                count++;
            }
        }

        System.out.println("Total Armstrong numbers = " + count);
	}

}
