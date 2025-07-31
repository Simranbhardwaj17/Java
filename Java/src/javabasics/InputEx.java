package javabasics;

import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		// Use Scanner class
		Scanner sc = new Scanner(System.in); //sc=obj form
		
		System.out.println("Input your Age: ");
		
		int age = sc.nextInt(); //in sc class there is a fn
//		float age = sc.nextFloat();
		
		System.out.println(age);
		
		
		//to inp str'
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Input your Name: ");
		
		String name = sc1.next(); //only single word not space. so use
		System.out.println(name);
		
		String name1 = sc1.nextLine(); //read whole line
		System.out.println(name1);
	}

}
