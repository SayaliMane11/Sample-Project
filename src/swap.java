
public class swap {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp;
		
		System.out.println("Before swapping:");
		System.out.println(a);
		System.out.println(b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping:");
		System.out.println(a);
		System.out.println(b);

	}

}
