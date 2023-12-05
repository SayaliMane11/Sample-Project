
public class Rajarampuri extends Unionbank {

	public Rajarampuri(String b, int c, String d, String e, int f) {
		super(b, c, d, e, f);
		
	}

	static{
		System.out.println("Rajarampuri Branch");
		System.out.println("******************");
	}
	
	public static void main(String[] args) {
	
		Rajarampuri r1 = new Rajarampuri("Saving",100,"Sayali","Kalamba",12345678);
		r1.display();
	
		Rajarampuri r2 = new Rajarampuri("Current",101,"Sneha","Pachgao",12345678);	
		r2.display();
	}

}
