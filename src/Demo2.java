
public class Demo2 {
	int b ;
	static int c;
	public static void main(String[] args) {
		int a = 10;
		Demo2 d = new Demo2();
		System.out.println(c);
		 d.b = a;
		 d.b = a++ + ++ a + a-- + ++a;
		//46   = 10++ + 12 + 12 + 12
		System.out.println(a); //12 
		System.out.println(d.b); //46 
		 d.b =++a + --a + a-- + ++a - a--;
		 //  = 13 + 12 + 12-- + 12 - 12--
		System.out.println(a); // 11
		System.out.println(d.b); // 37
		//d.income();
		d.positive();
	}/*
	void income() 
	{
		int withdrawamount = 3000;
		int total_bal = 100000;
		while (total_bal > 50000) 
		{
			if(total_bal >= withdrawamount) 
			{
				System.out.println("3000Rs are withdraw from your account");
				total_bal = total_bal - withdrawamount;
				System.out.println("available balance:" + total_bal);
			}else {
				System.out.println("You can not perform transaction...");
			}
		}
	}*/
	void positive() {
		int no = 123;
		
			if(no > 0)
			{
			    System.out.println("No is positive");
			    
			}
			else
			{
				System.out.println("No is negative");
			}
		
		
		
	}
}
