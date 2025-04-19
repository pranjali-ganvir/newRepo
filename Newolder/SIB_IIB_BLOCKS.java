package practiseCoreJava;
public class SIB_IIB_BLOCKS {
//SIB block
static {
	System.out.println("To setup database connection : write preconditions ");
}
static {
	System.out.println("To setup server connection : write preconditions ");
}
static {
	System.out.println("To setup browser connection : write preconditions ");
}
//main method
public static void main(String[] args) {
	System.out.println("Main method will execute");
	
	//to call IIB
	new SIB_IIB_BLOCKS();	
	new SIB_IIB_BLOCKS("Geeta");
	new SIB_IIB_BLOCKS(1);
}

//instance block
{
	System.out.println("Instance first block will execute here");
}
{
	System.out.println("Instance second block will execute here");
}{
	System.out.println("Instance third block will execute here");
}
//constructor overloading
private SIB_IIB_BLOCKS() {
	System.out.println("This is constructor one");
}
public SIB_IIB_BLOCKS(String name) {
	System.out.println("This is constructor two");
}
 SIB_IIB_BLOCKS(int one) {
	System.out.println("This is constructor three");
}	
	
	
//IIB block will execute before every constructor	
 //SIB>MAIN>IIB>CONSTRUCTOR
//to call IIB create object of class
	
	
	
	
	
	
	
	
	
	
	
	
}
