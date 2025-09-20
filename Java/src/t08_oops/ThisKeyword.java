package t08_oops;

public class ThisKeyword {

	public static void main(String[] args) {
		
//		In Java, this keyword is used to refer to the current object inside a method or a constructor.
//
//		We mostly use this keyword to remove any Ambiguity in Variable Names. 
//		We can also use this to invoke methods of the current class or to invoke a constructor of the current class.
		
		ComplexNum num1 = new ComplexNum(4, 6);
		ComplexNum num2 = new ComplexNum(2, 9);
		num1.print();
		num2.print();
		System.out.print("Adding two numbers: ");
		ComplexNum result = num1.add(num2);  //add num1 into num2
		result.print();
	}

}

class ComplexNum {
	int a, b;
	
//	public ComplexNum(int real, int imaginary) {
//		a = real;
//	    b = imaginary;
//	}
	
	//using this
	public ComplexNum(int a, int b) {
		this.a = a;   //this.a means curr obj(that is def in class),    a -> param pass
	    this.b = b;
	}
	
	
	void print() {
		System.out.println(a + " + " + b + "i");
	}
	
	//method ret ComplexNum(take it as Primitive DT)
	ComplexNum add(ComplexNum num2) {
		//this is refer of jisne add ko call kiya(here, i.e num1)
//		this.print();  //num1, as this store reference of curr obj, coz num1 call add aove
//		num2.print();
		return new ComplexNum(a+num2.a, b+num2.b);
	}
	
}