package javabasics;

public class Loops {

	public static void main(String[] args) {
		// Loops
		
		//for loop
		//i++
		for(int i=0; i<7; i++) {
			System.out.println(i);
		}
		
		//i--
		for(int j=7; j>2; j--) {  //only for for loop
			System.out.println(j);
		}
		
		//while loop
		int k = 7;
		while(k>2) {
			System.out.println(k);
			k--;
		}
		
		
//		Why not working??
//		int k = 7;
//		while(k>2) {
//			System.out.println(k);
//		
//		}k--;
		
		
		//do while
		int s=7;
		do {
			System.out.println(s);
			s--;
		} while(s > 2);
	}

}
