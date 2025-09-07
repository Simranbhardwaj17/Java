package t07_strings;

public class JavaString {

	public static void main(String[] args) {
		
		//An arr of char works same as Java String.
		//Non-Prim DT
		String name = "Simu";
		char name1[] = {'S', 'i', 'm', 'u'};
		
		//To create Java Str
//		1. By str literal   -  more optimized
//		2. By new keyword
		String name3 = "Simu";
		System.out.println("Simu"); //only differ is "not assign to a var to get used
		String newName = "Simu";  //these 3 point to same str cons pool coz of same val
		
		String name2 = new String("Simu");  //get new mem allocated
		
		//Immutable - once created its data or state can't be changed(secure)

	}

}

//References(sc)/var(name) r stored in stack and strings/classes(Scanner) r stored in heap

//To create str, use Str literal - more optimized(coz of SCP)
//In heap, a string constant pool is created when a string is created by string literal(not by new keyword) and it get stored here in pool & others point to that value is same val(no new mem allocate)

//To optimize str in java(as str is used a lot in Java), string constant pool is created and used to refer var to it , if var have same val 
