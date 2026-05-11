package b01_patterns;

//Square Star Pattern
//Output
//* * * *
//* * * *
//* * * *
//* * * *
public class SquareStarPattern {

	public static void main(String[] args) {
		
		int i, j;
		for (i=1; i<=4; i++) {
			for (j=1; j<=4; j++) {
				System.out.print(" * ");			
			}
			System.out.println();
		}
	}

}
