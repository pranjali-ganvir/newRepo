package practiseCoreJava;
public class ThisKeyword {
	//this keyword == is used to assign values from local to global variable
	//this keyword works only in non static method
	//used in constructors
	//it can be 1st line or any line in code
	//when datatype of local method and global variable are same
	//used in encapsulation concept
	//variable name can be different

	 String name = "Shonakshi";
	private int data = 20;
	 void method1(String h) {
		                   this.name=h;
	}
	 ThisKeyword(){
			System.out.println(data);
	 }
	
	 //constructor
	 ThisKeyword(int d){
		 this();
		 this.data= d;
	 }
	 
public static void main(String[] args) {
	ThisKeyword j = new ThisKeyword(3);
	System.out.println(j.data);
	j.method1("geeta");
	System.out.println(j.name);
	
}
}
