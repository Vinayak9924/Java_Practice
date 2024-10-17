package vinayak1;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new  TreeSet<Integer>();
		ts.add(10);
		ts.add(20);
		ts.add(550);
		ts.add(44);
		ts.add(50);
		ts.add(60);
		ts.add(70);
		ts.add(10);
		System.out.println(ts);
		Iterator<Integer> it = ts.descendingIterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
		
		

	}

}
