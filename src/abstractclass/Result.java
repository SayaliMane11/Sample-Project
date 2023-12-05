package abstractclass;

public class Result extends Calculator {

	
	int result;

	public static void main(String[] args) {
		Result r1 = new Result();
		r1.add(100, 200);
		r1.sub(200, 20);
		r1.mul(20, 5);
		r1.div(30, 5);
	}

	void add(int a,int b) {
		result = a+b;
		System.out.println("add:"+ result);
		
	}

	void sub(int a, int b) {
		result = a-b;
		System.out.println("sub:"+ result);
		
	}

	
	void mul(int a, int b) {
		result = a*b;
		System.out.println("mul:"+ result);
		
	}

	void div(int a, int b) {
		result = a/b;
		System.out.println("div:"+ result);
		
	}

}
