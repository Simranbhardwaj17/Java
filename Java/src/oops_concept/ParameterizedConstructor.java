package oops_concept;

class Stud2 {
	int age;
	String name;
	String clg;
	int roll;
	String city;
	
	public void printInfo() {
		System.out.println("Name is " + this.name);
		System.out.println("Roll no is: " + this.roll); 
		System.out.println("Age is: " + this.age);
	}
	
	//Parametrized cons
	Stud2(int age, String name, int roll) {
		System.out.println("Constructor called");
		this.name = name;  //this.name - obj, name - var/arg
		this.roll = roll;
		this.age = age;

	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		
		Stud2 s2 = new Stud2(12, "SB", 9);  //A/c to param of cons, pass value here(not a/c to inside arrangem 
		s2.printInfo();
	}

}
//in it pass arg/para in construc then assign value to obj then print info
//Only it is imp to pass arg and get param/arg in same format/serial else error, no care on format inside const
