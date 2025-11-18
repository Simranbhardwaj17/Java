package set_01_basicscoding;

import java.util.Scanner;

public class CheckPrimeNum {

	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int num = scanner.nextInt();
	    
	    if (num <= 1) {
	        System.out.println(num + " is not a prime number.");
	    } else if (num == 2) {
	        System.out.println(num + " is a prime number.");
	    } else {
	        boolean isPrime = true; // Assume prime initially
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                isPrime = false; // Found a divisor, so not prime
	                break; // Exit loop early
	            }
	        }
	        if (isPrime) {
	            System.out.println(num + " is a prime number.");
	        } else {
	            System.out.println(num + " is not a prime number.");
	        }
	    }
	    scanner.close();

	}

}
