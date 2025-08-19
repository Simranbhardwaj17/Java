package t02_operators;

public class LogicalOp {

	public static void main(String[] args) {
		
		/*
		 * && - Logical AND - T if both exp r true
		 * || - Logical OR  - T if only 1 is true
		 * ! - Logical NOT  - T if exp is F - only applicable on 
		 */
		
		boolean isPassed = true;
		boolean isFailed = false;
		
		System.out.println(isPassed && isPassed);
		System.out.println(isPassed && isFailed);
		System.out.println(isFailed && isPassed);
		
		
		System.out.println(isPassed || isFailed);
		System.out.println(isFailed || isPassed);
		
		System.out.println(!isPassed);    //false
		System.out.println(isPassed);    //true
		boolean c= !isPassed;
		System.out.println(isPassed);   //true
		System.out.println(c); 
		System.out.println("c is:" + !c); //c is:true
		System.out.println(!isFailed);  //true
		System.out.println(!isPassed); //false
		
	}

}
