
public class Demo {

	public static void main(String[] args) {
		
		System.out.println("Hello..");
		System.out.println("Welcome in main method..");
		add(); //static to static 1.direct call
		Demo.sub(); //static to static 2.using classname
		Demo d = new Demo(); //static to non-static 3.using class object
		d.mul();
		d.div();
	}

	static void add()
	{
		int a = 10;
		int b = 10;
		System.out.println("Addition");
		System.out.println(a+b);
		System.out.println("--------------------");
	}
	
	static int x = 20;
	static int y = 20;
	static int z;
	
	int p = 20;
	int q = 2;
	int r;
	
	static void sub()
	{
		System.out.println("Subtraction");
		z = x-y;
		System.out.println(z);
		System.out.println("--------------------");
	}
	void mul() {
		System.out.println("Multiplication");
		r = p*q;
		System.out.println(r);
		System.out.println("--------------------");
	}
	void div() {
		System.out.println("Division");
		z = x/y;
		System.out.println(z);
		System.out.println("--------------------");
	}
}
