package practiseCoreJava;
public class ThrowAndThrows {
	public   void method1() throws ArithmeticException{
		throw new NullPointerException();
	}
	public static void main(String[] args)  {
		//throw is used to throw new exception -- USED  BY DEVELOPER
		//throws to declare exception only -- USED BY TESTER TO USE PREDEFINED EXCEPTION
		//throw new ArithmeticException("This is new");
		
		ThrowAndThrows n = new ThrowAndThrows();
		n.method1();
	}
 

}
