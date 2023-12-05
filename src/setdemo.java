import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class setdemo {

	public static void main(String[] args) {
		Set<Integer> i = new HashSet<>(); 
		i.add(10);
		i.add(20);
		i.add(30);
		i.add(null);
		i.add(0);
		i.add(100);
		System.out.println(i);
		System.out.println(i.size());
		
		Set<String> s = new LinkedHashSet<>();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add(null);
		s.add("D");
		System.out.println(s);
		System.out.println(s.size());
		
	}

}
