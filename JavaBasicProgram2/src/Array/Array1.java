package Array;

public class Array1 {

	public static void main(String[] args) {
		int a[]= new int[] {1,2,3,4,5};	
		for(int i=0;i<a.length;i++)
		{
		System.out.println(i);
		
		// For Each loop
		System.out.println("******************");	
		for(int num : a)
			{
				System.out.println(num);
		}

	}

}
}