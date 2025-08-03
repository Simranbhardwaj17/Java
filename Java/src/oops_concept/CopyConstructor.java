package oops_concept;

class Students {
	int presentCount;
	int absentCount;
	String resident;
	String batch;
	
	public void printBatch() {
		System.out.println("Absent students r: " + this.absentCount);
		System.out.println("Batch of students r: " + this.batch); 
	}
	
	//copy cons coz it copy s2 ki info & store in current obj
	Students(Students s2) {
		this.absentCount = s2.absentCount; //jis obj k liye cl hua uske obj me s2.var store kr diye
		this.batch = s2.batch;
	}

	public Students() {
		// TODO Auto-generated constructor stub
	}

}

public class CopyConstructor {

	public static void main(String[] args) {
		
		Students s1 = new Students();
		s1.absentCount = 15;
//		s1.presentCount = 61;
		s1.batch = "B";
		
		Students s2 = new Students(s1); //here we directly assign value of s1 prop to s2
		s2.printBatch(); 
	}

}
//all define by user(in c++, some r user def & some r predef), copy one obj & add into other obj
//helpful to copy obj