package practiseCoreJava;
public class MainMethodOverloading {
	public static void main(String[] args) {
         MainMethodOverloading m = new MainMethodOverloading();
         m.main(false);
         m.main(10);
         System.out.println("This is first method overloading");
          System.out.println(args[0]);
           System.out.println(args[1]);
           //string args values are provided at run time
	}
	public  void main(int var) {
        System.out.println("This is second method overloading");
	}
	 static void main(int[] d)  {
        System.out.println("This is third method overloading");
        System.out.println(d[0]);
	}
	public  boolean  main(boolean d) {
        System.out.println("This is fourth method overloading");
		return d;
//return keyword doesn't mean it wil print anything
	}
}
