
public class RemoveWhitespace {

	public static void main(String[] args) {
		String s1 = "Java is a programming lenguage";
		String s2 = " ";
		
		char [] carray = s1.toCharArray();

		for(int i = 0; i<s1.length(); i++)
		{
			if((carray[i] != ' ')&&(carray[i] != '\t'))
			{
				s2 = s2 + carray[i];
			}
		}
		System.out.println("Input:" + s1);
		System.out.println("Output:" + s2);
	}

}
