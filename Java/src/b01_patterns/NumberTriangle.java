package b01_patterns;

import java.util.Scanner;

//3. Number Triangle
//1
//1 2
//1 2 3
//1 2 3 4

public class NumberTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //take input from user

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
		
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}
