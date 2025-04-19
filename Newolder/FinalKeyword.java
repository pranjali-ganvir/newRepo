package practiseCoreJava;
final public class FinalKeyword {
	
public static void main(String[] args) {
	final String abvg = "Geetauuuui";
	okkmethod();
	System.out.println(abvg);	
}	
	final public static void  okkmethod() {
		System.out.println("This is final method");
	}
	
//final method cannot overriden
	//final class cannot inherit
	//final variable cannot modify
}
