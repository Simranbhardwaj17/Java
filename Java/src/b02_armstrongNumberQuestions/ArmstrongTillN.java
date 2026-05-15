package b02_armstrongNumberQuestions;

import java.util.Scanner;

//2.	Print all Armstrong numbers between 1 to N.

public class ArmstrongTillN {

    static boolean isArmstrong(int num) {
        int original = num;
        int digitCount = 0;
        int sum = 0;
        int temp = num;

        // Count digits 
//        int digits = String.valueOf(num).length();
        while (temp != 0) {
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

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.println("Armstrong numbers between 1 and " + n + ":");

        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}