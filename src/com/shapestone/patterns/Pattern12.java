package patterns;

public class Pattern12 {

	public static void main(String[] args) {
	
	for(int i=1;i<=5;i++) 
	{
	 for(int j=i;j<5;j++) 
	  {
		 System.out.print("  ");
	  }
	  for(int j=1;j<=i;j++) 
	   {
		  System.out.print(i*j+"  ");
	   }
	  System.out.println();
	}
		
		
		
		
//		1
//	   2 4
//	  3 6 9
//	 4 8 12 16
// 5 10 15 20 25
		

	}

}
