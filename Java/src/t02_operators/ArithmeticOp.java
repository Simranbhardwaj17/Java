package t02_operators;

public class ArithmeticOp {

	public static void main(String[] args) {
		
		int num1 = 2;
		int num2 = 4;
		
//		double division = num1/num2;
		double division = (double)num1/num2;  //this is right way
		
		System.out.println(division);
		
		double modulo = num1%num2;
		
		System.out.println(modulo);

	}

}
