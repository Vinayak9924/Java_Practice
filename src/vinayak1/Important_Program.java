package vinayak1;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Important_Program {

	public static void main(String[] args) {
		String s ="apple";
		//a-1,p-2,l-2,e-2
		
	LinkedHashMap<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
	for(int i=0; i<s.length(); i++) {
		char d = s.charAt(i);
		///System.out.println(d);
		if(hm.get(d)==null) {
			hm.put(d, 1);
			
		}else {
			Integer count = hm.get(d);
			count= count+1;
			hm.put(d, count);
		}
		
		
		
	}
	
	System.out.println(hm);
		

	}

}
