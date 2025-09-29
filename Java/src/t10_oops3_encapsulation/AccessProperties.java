package t10_oops3_encapsulation;

import t10_oops3.DataHiding;

public class AccessProperties {

	public static void main(String[] args) {

		//we can't directly access the pvt prop, make changes, print so, use getter_setter method

		DataHiding dh1 = new DataHiding();
//		dh1.age = 33;
		dh1.setAge(29);
//		System.out.println(dh1.age);   can't get/print age like that
		System.out.println(dh1.getAge());
		
		
	}

}
