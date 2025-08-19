package t02_operators;

//import java.util.Scanner;

public class TernaryOp {

	public static void main(String[] args) {
//		evaluates the test condition & executes a block of code based on res of condition
//		Like if-else in 1 line
//		condi?exp1:exp2
		
		int a = 4;
		int b = 6;
		int max;
		
//		if (a>b) max = a;
//		else max = b;
//		System.out.println(max);
		
		System.out.println(a>b?a:b);
//		or
		max = a>b?a:b;
		System.out.println("Max is: " + max);
		
		
		
		//For nestedifelse
//		max1 = (num1 > num2)  ?  (num1 > num3 ? num1 : num3)  :  (num2 > num3 ? num2 : num3);
		
		int num1 = 8, num2 = 4, num3 = 7, max1;

		max1 = (num1 > num2) 
		          ? (num1 > num3 ? num1 : num3) 
		          : (num2 > num3 ? num2 : num3);

		System.out.println("Max is: " + max1);

		
     //we can't use sout here coz it ret void & we want ret value
//		This means:
//
//			If num1 > num2
//			→ compare num1 and num3
//
//			Else
//			→ compare num2 and num3
	}

}
