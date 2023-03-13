package Collections;
import java.util.Vector;
public class VectorExample1 
{
public static void main(String[] args) 
    {
Vector<String> v1 =new Vector<String>();
v1.add("Priya");
v1.add("Minal");
v1.add("Shruti");
v1.add("Pallavi");
v1.add("Srushti");
v1.add("Sayali");
v1.add("Rajani");
System.out.println("Vector Elements are "  +v1);
System.out.println("Capacity of Elements "  +v1.capacity());
v1.add("Teju");
System.out.println("After adding the element" +v1);
System.out.println("After adding the elemets the capacity is " +v1.capacity());
System.out.println("**********************************************************************");
 for (String v : v1)
 {
	 System.out.println(v);
 }
	}

}
