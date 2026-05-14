package b01_patterns;

import java.util.Scanner;

//4. Floyd’s Triangle
//1
//2 3
//4 5 6
//7 8 9 10

public class FloydTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //take input from user

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
		
		int num = 1;
		
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}

	}

}
