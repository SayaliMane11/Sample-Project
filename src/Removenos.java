
public class Removenos {

	public static void main(String[] args) {
		String s1 = "Java123python";
		String s2 ="";
		
		System.out.println("String before:" + s1);
		for(int i =0; i<s1.length(); i++)
		{
			if(!Character.isDigit(s1.charAt(i)))
			{
				s2 = s2 + s1.charAt(i);
			}
		}
		System.out.println("String after:" + s2);
		
		Removestring();
	}
	
	static void Removestring()
	{
		String s1 = "Java123python";
		String s2 ="";
		int a = 0;
		for(int i =0; i<s1.length(); i++)
		{
			if(Character.isDigit(s1.charAt(i)))
			{
				s2 = s2 + s1.charAt(i);
				a = Integer.parseInt(s2);
			}
		}
		System.out.println("String after:" + s2);
		System.out.println(a);
	}

}
