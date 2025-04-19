package practiseCoreJava;
public class ClassTypecasting {
	//class type casting are two type -- upcasting and downcasting
public static void main(String[] args) {
	//upcasting = converting child class object into parent class type
	//to access only parent class property -- done in both implicit nd explicity way
	
	 System.out.println("Upcasting done implicitly");
	 Object q1=       new ClassTypecasting();
	System.out.println(q1);
	
	 System.out.println("Upcasting done explicitly");
	 Object q2=    (Object)new ClassTypecasting();
	System.out.println(q2);
		
	System.out.println("++++++++++++++++++++++++++++++++++");
	//downcasting -- converting parent classs object into child class type called downcasting
	// to access both child nd parent class properties -- done only explicitly
	 System.out.println("Downcasting done explicitly");
	 Object q3=       new ClassTypecasting();
	 ClassTypecasting oi = (ClassTypecasting)    q3;
	 System.out.println(oi);
	
	

}
}
