package Scanner;
import java.util.Scanner;
public class SampleExample {

	public static void main(String[] args) 
	{
     Scanner s1 = new Scanner(System.in);
     int age;
     System.out.println("Enter the value of age");
     age = s1.nextInt();
     double salary;
     System.out.println("Enter Salary value");
     salary= s1.nextDouble();
     char grade;
     System.out.println("Enter the grade");
     grade = s1.next().charAt(0);
     boolean status;
     System.out.println(" Enter the status ");
     status=s1.nextBoolean();
     System.out.println(+age+" " +salary+" " +grade+" " +status+ " ");
     System.out.println("Enter your Name");
     String name = s1.next();
     System.out.println("enter address");
     String add=s1.next();
     add =  s1.nextLine();//nextLine is used to print full details 
     System.out.println("My address is " +add);
     System.out.println("Enter add");
     String add1=s1.next();
     add1=s1.next();
     System.out.println("Add 1 " +add1);
     }

}
