package t02_operators;

public class IncrementDecrementOp {

	public static void main(String[] args) {
		
		/*
		 * post
		 * a--  -> a = a - 1
		 * a++
		 * 
		 * pre
		 * --a 
		 * --b
		 */
		
		int num = 29;
		
		num++;
		System.out.println(num++);
		System.out.println(++num);
		num--;
		System.out.println(num);
		
		
		int i = 0;
		while(i < 5) {
			System.out.println(i);
			i++;
		}

	}

}
