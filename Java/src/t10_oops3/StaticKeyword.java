package t10_oops3;

public class StaticKeyword {
	
	public static String name = "Simu";
	
	public static int count;
	
	public String school;  //non-static
	
	public static void main(String[] args) {
		
		StaticKeyword sk1 = new StaticKeyword();
//		sk1.name = "Gudi";
		System.out.println(sk1.name);  //Simu
		
		name = "Simran";  //can directly call without creating obj, and it(value) will be same for all obj, if created
		
		StaticKeyword sk2 = new StaticKeyword();
		
		System.out.println(sk2.name); //Simran
		
		System.out.println(name); //Simran
		
		System.out.println(count); //0 
		
		//we can't use non-static in static mthd, so create its obj
//		System.out.println(school);  //can't access directly, coz non-static
		
		String sch = sk1.school = "GG";
		System.out.println(sch);
	}

}
//The static keyword
//If we want to access class members without creating an instance of the class, we need to declare the class members static.
//
//Static variables can be accessed by calling the class name of the class. There is no need to create an instance of the class for 
//accessing the static variables because static variables are the class variables and are shared among all the class instances.

//Static Variables--------
//Only a single copy of the static variable is created and shared among all the instances of the class.
//
//Because it is a class-level variable, memory allocation of such variables only happens once when the class is loaded in the memory.
//46:24
//If an object modifies the value of a static variable, the change is reflected across all objects.
//
//Static variables can be used in any type of method: static or non-static.
//
//Non-static variables cannot be used inside static methods. It will throw a compile-time error.