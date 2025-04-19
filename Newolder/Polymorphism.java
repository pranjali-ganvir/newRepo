package practiseCoreJava;
 class NewOne {
	 //used polymorphism concept here
	 //overriding
	void newOneMethod() {
		System.out.println("This is parent method");
	}
}

 public class Polymorphism  extends NewOne{
	//method overloading //compile time 
static void method1(	String name) {
	System.out.println("this is first overloaded method");
}
 public void method1(int d) {
		System.out.println("this is second overloaded method");
}
 static double method1(double b) {
		System.out.println("this is third overloaded method");
	 return b;
}
 //overriding
 void newOneMethod() {
		System.out.println("This is child method");
	}
 
 public static void main(String[] args) {
	 Polymorphism dq = new Polymorphism();
       dq.method1(10);
       dq.method1(55.677777);
       dq.method1("Jiya");
       dq.newOneMethod();
       
}
	
	
	
	
	
	
	
	
	
	
}
