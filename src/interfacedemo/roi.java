package interfacedemo;

public abstract class roi implements Bank {

	int bal ;
	public roi(int a) {
		bal = a;
	}
		
	int total;
	public void fdroi() {
		int fd = 5;
		total = bal * fd;
		System.out.println("fdroi:"+ total);
	}

	
	public void savingroi() {
		int saving = 4;
		total = bal * saving;
		System.out.println("saving roi:"+ total);
	}

	
	public void currentroi() {
		
		int current = 6;
		total = bal * current;
		System.out.println("current roi"+ total);
	}

}
