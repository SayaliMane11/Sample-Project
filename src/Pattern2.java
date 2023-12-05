/*
		 1
		 2 3
		 4 5 6
		 7 8 9 10*/
public class Pattern2 {

	public static void main(String[] args) {
		int c = 0;
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(c+1 + " ");
				c++;
				
			}
			System.out.println();
		}
		
		Pattern2 p = new Pattern2();
		p.star();
	}
	
	public void star()
	{
		/*
		    * 
          * * 
        * * * 
      * * * * 
    * * * * *
	*/   int row =5;
		
		for(int i=0; i<row; i++)
		{
		for(int j=2*(row-i); j>=0; j--)
		{
				System.out.print(" ");
		}
			
		for(int j=0; j<=i; j++)
		{
				System.out.print("* ");
		}
		System.out.println();
		}
	}

}
