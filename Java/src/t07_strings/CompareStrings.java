package t07_strings;

public class CompareStrings {

	public static void main(String[] args) {
		// Use concept from JavaString class
		// == -> in terms of str(non-primitive), it check references, not actual value
		//for primit(int), it checks only value
		
		String name = "Simu";
		String newName = "Simu";  //these 3 point to same str cons pool coz of same val
		
		String nameUsingNew = new String("SimU"); 
		
		if (name == newName ) {
			System.out.println("Both are same");
			System.out.println("Coz, both refer to same str pool");
		}
		
		
		if (name == nameUsingNew ) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
			System.out.println("Coz, both r created by differ form & stored in differ way");
		}
		
		
		//To compare values/content of string, use equals() method  (To exact match, str should be exact same as java is case-sens) 
		//public boolean equals(Object another) compares this str to specified obj
		if (name.equals(nameUsingNew)) {
			System.out.println("Both values are same");
		} else {
			System.out.println("Both values are not same");
		}
		
		
		if (name.equalsIgnoreCase(nameUsingNew)) {  //uppercase or lowercase ignore
			System.out.println("Both values are same");
		} else {
			System.out.println("Both values are not same");
		}

	}

}
