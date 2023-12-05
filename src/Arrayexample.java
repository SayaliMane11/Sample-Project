
//1,2,3,4,5,6,7,8
import java.util.Arrays;
import java.util.Collections;
public class Arrayexample
{
    public static void main(String [] args)
    {
        Integer []array = {4,2,5,6,1,7,3,8};
        Arrays.sort(array);
        System.out.println("Sorted array:" + Arrays.toString(array));
        Arrays.sort(array,Collections.reverseOrder());
        System.out.println("Descending array:"+ Arrays.toString(array));
    	 
        reverse();
    }
    
    public static void reverse()
    {
    	String a [] = {"sayali","mohit","sanket","shrisha","raj"};
    	for(int i=0; i<a.length-1; i++)
    	{
    		for(int j=i+1; j<a.length; j++)
    		{
    			if(a[i].compareTo(a[j])>0)
    			{
    				String temp = "";
    				temp = a[i];
    				a[i] = a[j];
    				a[j] = temp;
    			}
    		}
    	}
    	System.out.println("Sorted array: "+ Arrays.toString(a));
    	
    	//********Descending********
    	for(int i = 0; i<a.length-1; i++)
    	{
    		for(int j=i+1; j<a.length; j++)
    		{
    			if(a[j].compareTo(a[i])>0)
    			{
    				String temp = "";
    				temp = a[j];
    				a[j] = a[i];
    				a[i] = temp;
    			}
    		}
    	}
    	System.out.println("Reverse Sorted array: "+ Arrays.toString(a));
    }
}