/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5

*/
public class Pattern {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("-----------------");
		Pattern p = new Pattern();
		p.star();
	}
	
	public void star() {
	/*
		* 
		* * 
		* * * 
		* * * * 
		* * * * * 
	*/
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

}
