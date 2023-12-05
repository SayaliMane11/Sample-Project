
public class B extends A {

	public void m1()
	{
		System.out.println("In class B m1");
	}
	
	public void m2()
	{
		System.out.println("In class B m2");
	}
	
	
	
	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();
		
	}

}
