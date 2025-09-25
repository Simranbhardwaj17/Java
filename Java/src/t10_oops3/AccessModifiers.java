package t10_oops3;

public class AccessModifiers {
	
	int count;    //default or pkg-pvt
	private String types;
	public boolean accessibleEverywhere;
	protected boolean accessibleOnlyToSubclass;  //can be in other pkg too


	public static void main(String[] args) {
		
//		Access Modifiers    Same class    Same pkg subclass    Same pkg non-subclass    Difference pkg subclass    Different pkg non-subclass 
//			Default             Yes             Yes    					Yes                   No                            NO
//			Private    			Yes             No    					No                    No                            NO
//			Protected   	    Yes             Yes   					Yes                   Yes                           NO
//			Public    			Yes             Yes    					Yes                   Yes                           Yes
		AccessModifiers am1 = new AccessModifiers();
		am1.types = "private";  //private prop can be acceessed in same class
		
	}

}
