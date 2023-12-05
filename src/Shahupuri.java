
public class Shahupuri extends Unionbank{

	public Shahupuri(String b, int c, String d, String e, int f) {
		super( b, c, d, e, f);
		
	}
	
	static{
		System.out.println("Shahupuri Branch");
		System.out.println("****************");
	}

	public static void main(String[] args) {
		
		Shahupuri s1 = new Shahupuri( "Current", 1000, "Teju", "Shivaji peth", 2868391);
		s1.display();
		Shahupuri s2 = new Shahupuri( "Saving", 1001, "Mohit", "Shanivaar peth", 2866391);
		s2.display();
	}

}
