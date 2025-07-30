package javabasics;

public class StringEx {

	public static void main(String[] args) {
		// Functions to perform string operations:-
        //strings are immutable
		
		//Concatenate
		String fName = "Simran ";
		String lName = "Bhardwaj";
		
		System.out.println(fName + "and " + lName);
		
		String fullName = fName + lName;
		System.out.println(fullName);

		//charAt
		System.out.println(fName.charAt(0));
		
		//length
		System.out.println(fName.length());  //also count space as a letter
		
		//replace
		System.out.println(fName.replace('n', 'g'));
		
		String name = fName.replace('n', 'g');
		System.out.println(name);
		System.out.println(fullName);  //no change in real name (original string)
		//In java, strings are immutable, to change str, make changes & store in new var
		
		
		//substring
		System.out.println(name.substring(0, 4));  //exclude endindex
		System.out.println(fullName.substring(0, 8)); //also count space   o/p: Simran B
		//here, we r not changing or cutting the str, just creating a new one 
	}

}
