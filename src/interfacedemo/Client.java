package interfacedemo;

public class Client extends roi {

	
	public Client(int a) {
		super(a);
		
	}

	public static void main(String[] args) {

		Client c1 = new Client(10000);
		c1.fdroi();
		c1.savingroi();
		c1.currentroi();
		System.out.println("--------------------------");
		Client c2 = new Client(2000);
		c2.savingroi();
		System.out.println("--------------------------");
		Client c3 = new Client(300000);
		c3.fdroi();
		c3.currentroi();
		System.out.println("--------------------------");
	}

}
