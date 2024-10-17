package vinayak1;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Tree_Map {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(2,"virat");
		tm.put(1,"sachin");
		tm.put(3,"sourav");
        tm.put(4,"Rahul");
       // System.out.println(tm);
        
        Iterator <Entry<Integer,String>>Iterator=tm.entrySet().iterator();
        while(Iterator.hasNext()) {
        	//System.out.println(Iterator.next());
        	
        	//only key and value pair
        	Entry<Integer,String>next=Iterator.next();
        	//System.out.println(next.getKey());
        	//System.out.println(next.getValue());
        	
        	//by using for each loop
        	
        	for(Map.Entry<Integer, String> k:tm.entrySet()) {
        		System.out.println(k.getValue());
        		
        	}
        	
        }
        
        


	}

}
