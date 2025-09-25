package t10_oops3_AccessModifiersEx;

import t10_oops3.AccessModifiers;

public class AccessModifiersInOtherPackage extends AccessModifiers {

	public static void main(String[] args) {
		
		AccessModifiers am1 = new AccessModifiers();
//		am1.types = "private";  Err:- Not pub, its private 
//		am1.count = 6;  //defa
		am1.accessibleEverywhere = true;
		
		AccessModifiersInOtherPackage op1 = new AccessModifiersInOtherPackage();
		op1.accessibleOnlyToSubclass = true;  //accessible Only To Subclass in other pkg too

		System.out.println(op1.accessibleOnlyToSubclass);
		
	}

}
