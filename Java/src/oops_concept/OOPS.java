package oops_concept;

class Pen {
	//blueprint define(prop)
	String color;
	String type;  //ballpoint | gel
	
	//fn inside class cld as mthd
	public void write() {
		System.out.println("to write");
	}
	
	public void printColor() {
		System.out.println(this.color);
	}
}

public class OOPS {

	public static void main(String[] args) {
		Pen pen1 = new Pen(); //classname objname    
		pen1.color = "red";  //use dot to access prop
		pen1.type = "gel";
		
		Pen pen2 = new Pen();
		pen2.color = "orange";  
		pen2.type = "ballpt";
		
		pen1.write();
		
		pen1.printColor();
		pen2.printColor();
	}

}
//create obj of classes inside main fn, main is inside pub cl
//prop, mthds cld as data(str,int type data,), members(fn)
//this tells which obj trying to acess that mthd