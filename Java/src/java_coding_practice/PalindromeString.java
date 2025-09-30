package java_coding_practice;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.nextLine();

		String orgStr = str;
		String revStr = "";
//		System.out.println(str.length());
//		System.out.println(str.charAt(5));
		
		int len = str.length();
		
		for (int i = len - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		
		
		if (orgStr.equals(revStr)) {
			System.out.println(orgStr + " is palindrome");
		} else {
			System.out.println(orgStr + " is not palindrome");
		}
	}

}
