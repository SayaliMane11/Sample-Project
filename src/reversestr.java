
public class reversestr {

	public static void main(String[] args) {
		 String s1 = "sayali";
		    char s;
		    String s2="";
		    System.out.println("String length"+ s1.length());
		    System.out.println("Original String:"+ s1);
		    for(int i=s1.length(); i>0; i--)
		    {
		      s = s1.charAt(i-1);
		      s2 = s2 + s;
		    }
		    System.out.print("Reverse string:"+ s2);
	}

}

/*Using while loop
  int i = s1.length();
  while(i>0)
   {
       char s = s1.charAt(i-1);
       i--;
       s2 = s2 + s;
   }
 */
 