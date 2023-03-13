package Array;

public class Program2 
		 { 
		public static void main(String[] args)
			{
				//String[] cars;
		  //String[] cars=new String[4];
		  String[] cars= {"volvo","bmw","ford","Tata"};	
		  System.out.println(cars[0]);
		  cars[0]="opel";
		  System.out.println(cars.length);
		  
		 System.out.println("*****for-each loop****");
		  for(String i:cars)
		     {
			 System.out.println(i);
		     }
		   }
		 
	}