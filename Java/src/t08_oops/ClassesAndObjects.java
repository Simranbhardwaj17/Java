package t08_oops;

public class ClassesAndObjects {

	public static void main(String[] args) {
		
//		Class - blueprint which defines some prop & behaviors. Obj is inst of cl
//		class-> logical entity, objects -> phy entity
//		class decl only once while we can create mul obj of a class
//		A cl is not allocated memory when it is defined but obj is.

		Name d1 = new Name();
		d1.fname = "Ansh";
		d1.walk();
		
		Name d2 = new Name();
		d2.fname = "Simran";
		d2.write();
		
		ComplexNumber num = new ComplexNumber();
		num.a = 1;
		num.b = 8;
		num.complex();
	}

}

class Name {
	
	String fname;  //prop
	
	void walk() {  //behavior
		System.out.println(fname + " is walking");
	}
	
	void write() {
		System.out.println(fname + " is writing");
	}
}

//A class is a way to arrange data and behavior info. It is a template that must be implemented by its obj
//class to make custom DT also
class ComplexNumber {
	int a, b;
	
	void complex() {
		System.out.println(a + " + " + b + "i");
	}
}