package t10_oops3;

//import java.util.Scanner;
//import java.util.List;
//import java.util.ArrayList;

import java.util.*;

import t09_oops2.ThisVsSuper.*;

public class ImportingPackage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		//Err: Can't import coz its not public
//		Lodging a1 = new Lodging();
//		a1.parking();
		
		//only able to import prop/mthd of ThisVsSuper class
	}

}

//can we import any class other than public in another package
//
//In Java, only public classes can be directly imported and accessed from a different package.
//
//Public Classes: Classes declared with the public access modifier are visible and accessible 
//from anywhere, including other packages. This is the standard way to make classes available 
//for use in different parts of your application or by other developers.
//
//Default (Package-Private) Classes: If a class is declared without any access modifier, it has
//"default" or "package-private" access. This means it can only be accessed by other classes within the
//same package. You cannot import and use a default-access class from a different package.
//
//Private Classes: Classes declared as private can only be accessed within the same outer class
//in which they are nested. They cannot be imported or accessed from any other class, even within the 
//same package, let alone from a different package.
//
//Therefore, if you need to use a class in a different package, it must be declared as public.