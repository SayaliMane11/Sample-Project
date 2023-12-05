
public class evenodd {
	
	
	
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		for(int i=1; i<=10; i++)
		{
			if(i%2 == 0)
			{
				System.out.print(i + ",");
				count= count + i;
			}
			
		}
		System.out.println();
		System.out.println("Addition of even nos. :" + count);
		
		for(int j=1; j<=10; j++)
		{
			if(j%2 !=0)
			{
				System.out.print(j + ",");
				sum= sum + j;
				
			}	
		}
		System.out.println();
		System.out.println("Addition of odd nos. :" + sum);
		even();
	}
	
	static void even()
	{
		//Java program to print Even length words in a String
		String s1 = "My name is sayali";
		   String [] array = s1.split(" ");
		   
		   for(String word :array)
		   {
		       int i = word.length();
		      // System.out.print(i);
		       if(i % 2 == 0)
		       {
		           System.out.println(word);
		       }
		   }
	}

}
