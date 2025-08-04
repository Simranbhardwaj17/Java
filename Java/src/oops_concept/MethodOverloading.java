package oops_concept;

//Polymorphism type - Compile time(Static Binding)

class Simran {
	int age;
	String batch;
	String dept;
	
	public void simranInfo(String batch) {
		System.out.println("Batch of Simran is: " + this.batch); 
	}
	
	//not work
//	public int simranInfo(int age) {
//		System.out.println("Batch of Simran is: " + this.age); 
//		return age;
//	}
	
	public void simranInfo(int age) {
		System.out.println("Age of Simran is: " + this.age); 
	}
	
	public void simranInfo(int age, String batch) { //here red mark coz of same DT of both arg of 22 & 31
        System.out.println("Age: " + age + ", Batch: " + batch);
    }

    public void simranInfo(String batch, int age) {
        System.out.println("Batch: " + batch + ", Age: " + age);
    }
	
	
	public void simranInfo(int age, String dept) { //arg should match
		System.out.println("Department is: " + this.dept);
		System.out.println("Age of Simran is: " + this.age); 
//		System.out.println("Department is: " + this.dept);
	}
	
	//No err only age print
//	public void simranInfo(int age, String dept) {
//		System.out.println("Age of Simran is: " + this.age); 
//	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		Simran s1 = new Simran();
		s1.age = 12;
		s1.dept = "CE";
//		s1.batch = "A";
		
		s1.simranInfo(s1.age, s1.dept); //arg should match serialwise
		s1.simranInfo(s1.age);
		s1.simranInfo(s1.age, s1.batch);  //batch: null coz not def
	}

}
//In Java, method overloading is based on:
//✅ Method Name
//✅ Parameter List (number/type/order of parameters)

//Return type is NOT considered in method overloading.