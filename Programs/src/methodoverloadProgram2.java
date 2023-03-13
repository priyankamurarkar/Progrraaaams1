
   public class methodoverloadProgram2 {
	public static void method1(int a, double b)
	{
		double res= a*b;
		System.out.println("I am  this method" +res);
	}
	 public static double method1(double a, int b)
	{
		 double res=a/b;
	System.out.println( "i am double body" +res);
		return a;
	}
      static int method1(int a)
        {
    	System.out.println("i am int method");
    	return a;
    	}
	public static void main (String[] args)
	{
		methodoverloadProgram2.method1(20.00,20);
		//methodoverloadProgram2.method1(1);

		
	}
	

}
