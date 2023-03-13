package ObjectClasses;
class Demo123{
	void display() {
		System.out.println("I am display() of class Demo123");
		}
}
 class Example3 extends Demo123
    {
	static int last_roll = 100;
	int roll_no;
	Example3()
    {
        roll_no = last_roll;
        last_roll++;
    }
	@Override
	void display() {
		System.out.println("I am display() of class ObjectClass2");
	}
    @Override
	public int hashCode() {
		return roll_no;
	}
  public static void main(String args[]) {
		Example3 s = new Example3();
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println("hashCode() value from ObjectClass2: "+s.hashCode());
		s.display();
		Demo123 d2=new Demo123();
		System.out.println(d2);
		System.out.println("hashCode() value from Demo123: "+d2.hashCode());		
	}

}