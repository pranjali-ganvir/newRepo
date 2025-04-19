package practiseCoreJava;

public class UncheckedException {
	public static void main(String[] args) {
		
		 //two types of EH == Checked and unchecked
		System.out.println("How to handle unchecked exception ?  by using try catch block ");
		//unchecked == at run time exception occured 
		//ArithmeticException, InputMismatchException  -- ArraysIndexOutofBoundsException -- NegativeArraySizeException
		
		try {
		//	int i =1/0;
			byte[] b = {1,3,45,34};
			System.out.println(b[0]);
			System.out.println(b[1]);
			System.out.println(b[5]);
		}
		catch(ArrayIndexOutOfBoundsException u)
		{
//	int i =1/0;
					byte[] b = {1,3,45,34};
					System.out.println(b[0]);
					System.out.println(b[1]);
					System.out.println(b[5]);
		}
		finally 
		{
			System.out.println("It is handled");
		}
		
		
	}

}
