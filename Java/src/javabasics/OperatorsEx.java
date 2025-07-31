package javabasics;

public class OperatorsEx {

	public static void main(String[] args) {
		//Arithmetic Op
		//Assignment
		//Logical
		//Comparison

		int num1 = 1;
		int num2 = 2;
		
		int sum = num1 + num2;
		System.out.println(sum);
		
		int diff = num1 - num2;
		System.out.println(diff);
		
		int mul = num1 * num2;
		System.out.println(mul);
		
//		double div = num1 / num2;
//		System.out.println(div);  //0.0  but if num1 & num2 is of double then get 0.5
		
		int div = num1 / num2; 
		System.out.println(div);  //0
		
		int modulo = num1 % num2;
		System.out.println(modulo);
		
		
		//Unary op
		System.out.println(num1++);  //1

		System.out.println(num1);  //2

		System.out.println(++num2);  //3
		
		System.out.println(num1--);  //2
		System.out.println(--num1);  //0
		System.out.println(--num1);  //-1

	}

}
