
public class Removespecial {

	public static void main(String[] args) {
		String s1 = "JaVA/ 1is a*& progr[amming] =@langu#%age5";
		String s2 = " ";
		
		char carray [] = s1.toCharArray();
		
		for(int i =0; i<s1.length(); i++)
		{
			if((carray[i] >64 && carray[i]<=90) || (carray[i]>96 && carray[i]<=122))
			{
				s2 = s2 + carray[i];
			}
		}
		System.out.println("Input:" + s1);
		System.out.println("Output:" + s2);
	}

}
