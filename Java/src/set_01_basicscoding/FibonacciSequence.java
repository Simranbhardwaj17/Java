package set_01_basicscoding;

import java.util.Scanner;

public class FibonacciSequence {
//	1. Iterative Approach (using a for loop):
	
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
    	int count = sc.nextInt();
    	
//        int count = 10; // Number of Fibonacci terms to generate

        int n1 = 0;
        int n2 = 1;

        System.out.print(n1 + " " + n2); // Print the first two terms

        for (int i = 2; i < count; ++i) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}


//2. Recursive Approach:
//public class FibonacciSequence {
//    public static int fibonacci(int n) {
//        if (n <= 1) {
//            return n;
//        }
//        return fibonacci(n - 1) + fibonacci(n - 2);
//    }
//
//    public static void main(String[] args) {
//        int n = 10; // Get 10 Fibonacci number
//        for (int i = 0; i < n; i++) {
//            System.out.print(fibonacci(i) + " ");
//        }
//    }
//}

//can be also done by DP
