package Array;

public class Array2 {

	public static void main(String[] args) 
	{
      int num[] = {20,70,50,5,15};
      for (int i = 0; i < num.length; i++) {
			if(num[i]==20) {
				System.out.println(num[i]);
				break;
			}else 
			{
				System.out.println("num is not 20");
			}
		}
		System.out.println("************Using for-each Loop:");
		for (int a : num) {
			if(a==20){
				System.out.println(a);
				break;
			}else
			{
				System.out.println("age is not 20");
			}
		}
	}
}
	


