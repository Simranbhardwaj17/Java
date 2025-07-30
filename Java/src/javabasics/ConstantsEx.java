package javabasics;

public class ConstantsEx {

	public static void main(String[] args) {
		//var
		int age = 30; //can be changed
		age = 34;
		System.out.println(age); //34
		age = 39;
		System.out.println(age); //39
		
		
		//final :- use to make a var const
		
		final float PI = 3.14F; //convention to write cons with uppercase as "PI"
		//PI = 3.19F;
		
		System.out.println(PI);
	}

}
