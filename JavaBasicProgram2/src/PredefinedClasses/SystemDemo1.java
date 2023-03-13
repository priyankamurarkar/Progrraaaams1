package PredefinedClasses;

public class SystemDemo1 {

	public static void main(String[] args) {
		System.out.println("System User Dir = " +System.getProperty("user.home"));
		  System.out.println("Working Dir = " +System.getProperty("user.dir"));
		  System.clearProperty("user.home");
		  System.out.println( System.getProperty("user.home"));
		  System.setProperty("user.home", "F:\\GITAutomation\\09Sp");
		  System.out.println("Updated User Dir " +System.getProperty("user.home"));
		  System.setProperty("user.country", "IND");
		  System.out.println(System.getProperty("user.country"));
		  System.out.println(+System.currentTimeMillis());
		  System.out.println(+System.nanoTime());
		  
	}

}
