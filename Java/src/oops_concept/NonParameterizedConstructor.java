package oops_concept;

class Student {
	int age;
	String name;
	String clg;
	int roll;
	String city;
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.roll);
	}
	
    //Non parametrized cons(if not initialixe then also it working(by def def)
	Student() {
		System.out.println("Constructor called");
	}
}

public class NonParameterizedConstructor {

	public static void main(String[] args) {
		// Create obj
		Student s1 = new Student();
		s1.name = "An";
		s1.roll = 3;
		s1.printInfo();
	}

}

//new keyword allocate a space in memory heap, where obj get stored
//Student() - special type fn cld as constructor, constuct java obj