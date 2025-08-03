package javabasics;

public class ExceptionHandling {

	public static void main(String[] args) {
		//we cam't handle errors but we can handle exception using tryCatch

		//Exception Handled so print, no error
		int[] marks = {89, 79, 78};
		try {
			//where exception can occur
			System.out.println(marks[6]);
		} catch (Exception exception) {
			//things after catching exception
		}
		System.out.println("Student name is Aman");  //exe normally
		
		
        //Give error and in above error is handled
//		int[] mark = {89, 79, 78};
//		System.out.println(mark[6]);
//		System.out.println("Student name is Aman");
	}

}

//In try, wi8 exceptions
