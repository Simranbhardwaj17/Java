package oops_concept;

interface Animaly {
	int eyes = 2; //fix/ static cn't change for all anim. Value fix & acessible
	public void walk(); //def  here interf, so bydef it will be pub (dont remove pub from fn of other imp cls
	// or  void walk();
	
	//can't create cons
	//can't create non-abs fn
}

//don't use extend for interf implem it'
class Horsey implements Animaly {
	public void walk() { //imp
		System.out.println("Walk on 4 legs");
	}
}

public class InterfacesEx {

	public static void main(String[] args) {
		// Pure Abst
		Horsey h1 = new Horsey();
		h1.walk();

	}

}
//All fields r by def pub, static, final