package practiseCoreJava;
public class PrimitiveTypecating {

//this only works on  byte, short, int, long, float,double data type
//two types - widening and narrowing
//widening-- smaller into  bigger and narrowing-- bigger into smaller type
	
public static void main(String[] args) {
//convert int into float data type-- widening
//widening can be done in implicit and explicit ways
	System.out.println("*******Print all widening type casting values********");
	float Noi = 10;
	System.out.println(Noi);
	//convert byte into int data type-- widening
	int mi = (int) 13455;        //explicit way
	//convert short into double data type-- widening
	System.out.println(mi);
	//convert float into double data type-- widening
	  double lo  = 1.2f;   //implicit way
	  System.out.println(lo);
	//convert int into long data type-- widening
         long p=  198;
         System.out.println(p);
	
         System.out.println("____________________________________________________________");
         
     	System.out.println("*******Print all narrowing type casting values********");
        // narrowing-- bigger into smaller type  -- works only explicitly
       //convert double into int
         int y = (int) 5.8998765444;
         System.out.println(y);
         //convert float into byte
         byte i = (byte) 9.677f;
         System.out.println(i);
         //convert long into short
         short u = (short) 454435;
         System.out.println(u);
         //convert double into float
         float o9 = (float) 3.4553333;
	       System.out.println(o9);
	
}	
}
