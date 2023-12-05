package stringdemo;

public class Stringmethods {

	public static void main(String[] args) {
		String s1 = "Sayali";
		String s2 = "Mohit";
		
		System.out.println(s1 == s2); //false
		System.out.println(s1.equals(s2)); //false
		
		String s3 = "Sayali";
		System.out.println(s1 == s3);//true
		System.out.println(s1.equals(s3));//true
		
		String s4 = new String("Mohit");
		System.out.println(s2 == s4);//false
		System.out.println(s2.equals(s4));//true
		
		String s5 = s3;
		System.out.println(s3 == s5);//true
	}
	
	
	

}
