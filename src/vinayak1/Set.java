package vinayak1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> hs =new LinkedHashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(44);
		hs.add(50);
		hs.add(60);
		hs.add(70);
		hs.add(10);
		
		System.out.println(hs);
		
		Iterator<Integer> it= hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		

	}

}
