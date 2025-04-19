package practiseCoreJava;
abstract  class Abstraction {
	//abstract class has abstract and concrete method
	//abstract method does not have any implemenatation in it
	//concrete method has implementation
abstract  void newMethod();
abstract void newMethod1();
abstract void newMethod2();

//concrete method
 void newMethod3() {
	 System.out.println("a+b+c");
 }
 void newMethod4() {
	 System.out.println("Concrete method");
 }
}

public  class AbstractionClass extends Abstraction {
	public static void main(String[] args) {
		AbstractionClass a = new  AbstractionClass();
		a.newMethod1();
		a.newMethod2();
		a.newMethod3();
		a.newMethod();
		a.newMethod4();
	}

	@Override
	void newMethod() {
System.out.println("Method 1");		
	}

	@Override
	void newMethod1() {
		System.out.println("Method 2");			
	}
@Override
	void newMethod2() {
		System.out.println("Method 3");		
		
	}
	
}
