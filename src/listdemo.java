import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class listdemo {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		//l1.add(null);
		//l1.add(null);
		l1.add(10);
		int sum = 0;
		System.out.println(l1.size());
		System.out.println(l1);
		System.out.println(l1.get(2));
		//System.out.println(l1.remove(5));
		System.out.println(l1);
		
		for(int i=0; i<l1.size(); i++)
		{
			sum = sum + l1.get(i);
		}
		System.out.println("Sum:"+ sum);
		System.out.println("----------------------------");
		List<String> l2 = new LinkedList<String>();
		String s1 = " ";
		l2.add("A");
		l2.add("B");
		l2.add(null);
		l2.add("c");
		l2.add(null);
		System.out.println(l2.size());
		System.out.println(l2);
		
		System.out.println(l2.get(2));
				for(int i=0; i<l2.size(); i++)
		{
			s1 = s1 + l2.get(i);
		}
		System.out.println(s1);
		System.out.println("----------------------------");
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(10);
		stk.push(20);
		stk.push(20);
		stk.push(30);
		System.out.println(stk.size());
		System.out.println(stk);
		System.out.println(stk.peek());
		stk.pop();
		stk.pop();
		System.out.println(stk);
		System.out.println(stk.peek());
	}

}
