package ObjectClasses;

class Demo{
	void display() {
		System.out.println("I am display()..");
	}
}
public class program1 extends Demo{
	static int last_roll = 100;
	int roll_no;
	
	program1()
    {
        roll_no = last_roll;
        last_roll++;
    }
	
	public static void main(String args[]) {
		program1 s = new program1();
		
		System.out.println(s);
		System.out.println(s.toString());
		Demo d1=new Demo();
		System.out.println(d1);
		Demo d3=new Demo();
		System.out.println(d3.toString());		
		Demo d2=new program1();
		System.out.println(d2);
	}
}
