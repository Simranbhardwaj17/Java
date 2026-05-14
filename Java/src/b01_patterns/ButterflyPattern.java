package b01_patterns;

import java.util.Scanner;

//11. Butterfly Pattern
//*      *
//**    **
//***  ***
//********
//***  ***
//**    **
//*      *

public class ButterflyPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int n = cols / 2;

        // validation
        if(rows != (2 * n - 1)) {
            System.out.println("Invalid rows and columns for butterfly pattern");
            return;
        }

        // Upper Half
        for(int i = 1; i <= n; i++) {

            // Left stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for(int i = n - 1; i >= 1; i--) {

            // Left stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
		
//		 int n = 7;

//        // Upper Half
//        for(int i = 1; i <= n; i++) {
//
//            // Left Stars
//            for(int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            // Spaces
//            for(int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" ");
//            }
//
//            // Right Stars
//            for(int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//        // Lower Half
//        for(int i = n - 1; i >= 1; i--) {
//
//            // Left Stars
//            for(int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            // Spaces
//            for(int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" ");
//            }
//
//            // Right Stars
//            for(int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
	    
		
//		for(int i=1; i<=7;i++) {
//			for (int j=1; j<=8; j++) {
//				if(j<=i || j >=9-i) {
//					System.out.print("*");
//				} else System.out.print(" ");
//				
//			}
//			System.out.println();
//			
//		}

	}

}
