package vinayak1;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		//al.add(10);
		//al.add(20);
		//al.add(30);
		//al.add(40);
		
		//System.out.println(al);
		
		for(int i=1;i<=10000; i++) {
			if(i%5==0)
				al.add(i);
			//System.out.println(al.get(i));
		}
		
	
           System.out.println(al);

	}

}
