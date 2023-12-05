
public class Methods {

	public static void main(String[] args) {
		
		System.out.println("U r in main method of Methods class..");
		Demo.add();
		Demo.sub();
		Demo d = new Demo();
		d.mul();
		m5();
	}
	
	static void m1() {
		System.out.println("In m1..");
		System.out.println("Thank you..");
	}
	
	void m2() {
		System.out.println("In m2...");
		m1();
	}
	
	void m3() {
		System.out.println("In m3..");
		m2(); //non static to non static using classname doesn't work
	}
	
	void m4() {
		System.out.println("In m4...");
		m3();
	}
	
	static void m5() {
		System.out.println("In m5...");
		Methods m = new Methods();
		m.m4();
		
	}
}
