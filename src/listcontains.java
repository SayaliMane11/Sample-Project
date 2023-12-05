import java.util.ArrayList;
import java.util.List;
public class listcontains {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		
		System.out.println(list.contains(100));
		System.out.println(list.contains(20));
		
		for(int i=list.size()-1; i>=0; i--)
		{
			 list2.add(list.get(i)) ;
		}
		System.out.println(list2);
	}

}
