package javabasics;

public class MathClass {

	public static void main(String[] args) {
		//fn::-
		//min/max()
		System.out.println(Math.min(5, 6));

		System.out.println("Max is " + Math.max(5, 6));
		
		
		//random -> no in b/w 0.0 - 1.0
		System.out.println(Math.random());
		
		//explicit conversion
		System.out.println((int)(Math.random()*100));
	}

}
