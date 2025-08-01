package javaprogram;

public class OddNumbers {

	public static void main(String[] args) {
		
		//Program to Print First 10 Odd Numbers
		int count = 0;
		int number = 1;
		
		while(count < 10) {
			if(number%2 != 0) {
				System.out.println(number);
				count++;
			}
			number++;
		}

	}

}
