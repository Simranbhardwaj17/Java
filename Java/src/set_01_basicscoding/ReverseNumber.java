package set_01_basicscoding;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int num = scanner.nextInt();
	    
	    int revNum = 0;
	    
	    while (num != 0) {
	    	revNum = revNum*10 + (num%10);
	    	num = num/10;
	    }
	    System.out.print("Reverse number is: " + revNum);
    }
}
