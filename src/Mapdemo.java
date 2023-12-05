import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapdemo {

	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		
		m1.put(234567894, "sayali");
		m1.put(123456789, "mohit");
		m1.put(547896321, "shrisha");
		m1.put(587965324, "raj");
		
		System.out.println("Original Map:"+ m1);
		Set<Entry<Integer, String>> allentry = m1.entrySet();
		
		for(Entry<Integer, String> entry :allentry)
		{
			Integer key = entry.getKey();
			//System.out.println(key);
			
			//String value = entry.getValue();
			//System.out.println(value);
			
			if(key.equals(587965324))
			{
				entry.setValue("shriraj");
			}
		}
		
		System.out.println("Updated Map:"+ m1);
		
	}

}
