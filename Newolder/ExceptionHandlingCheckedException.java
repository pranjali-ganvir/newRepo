package practiseCoreJava;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionHandlingCheckedException {
	public static void main(String[] args) throws MalformedURLException, FileNotFoundException  {
       //two types of EH == Checked and unchecked
		System.out.println("How to handle checked exception ?  by using try catch block and throws keyword - only one can be used");
		//checked == at compile time exception occured 
		//MalformedUrlException -- FileNotFoundException -- InterruptedException
		
int a,b,c;
a=b=c=12;
System.out.println("The output is :" +(a+b+c));
//InterruptedException
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	e.printStackTrace();
}		 //checkedException example using try catch block keyword
		
//MalformedUrlException 		
URL poo = new URL("https://www.facebook.com/");
System.out.println("This is malformed url exception : " +poo);
//checkedException example using throws keyword
	
//FileNotFoundException
FileInputStream  ik = new FileInputStream("New Microsoft Excel Worksheet");

	}		 

//

	}


