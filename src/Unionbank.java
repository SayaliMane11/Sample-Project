
public class Unionbank {
	
	String account_type;
	int account_no;
	String accountholder_name;
	String address;
	int mobile_no;
	
	static {
		System.out.println("Welcome to Union Bank !");
		System.out.println("------------------------------");
	}
	
	public Unionbank(String b,int c, String d, String e, int f) {
		
		account_type = b;
		account_no = c;
		accountholder_name = d;
		address = e;
		mobile_no = f;
	
	}
	
	void display() {
		
		System.out.println("Account Type :" + account_type );
		System.out.println("Account no :" + account_no );
		System.out.println("Account holder name :" + accountholder_name );
		System.out.println("Address :" + address );
		System.out.println("Mobile no :" + mobile_no );
		System.out.println("-------------------------------------------------");
		
	}

}

