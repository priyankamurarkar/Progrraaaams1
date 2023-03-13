package ThisKeyword;
public class Example1
{
int rollno;
double age;

Example1 (int rollno, double age)
{
	this.rollno = rollno;
	this.age=age;
}
public static void main(String[] args) 
	{
		Example1 r1 = new Example1(12,20.5);
		System.out.println("age value   ="  + r1.age);
		System.out.println("roll no value ="  + r1.rollno);

		
		
	}

}
