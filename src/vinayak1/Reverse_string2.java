package vinayak1;

public class Reverse_string2 {

	public static void main(String[] args) {
		
		String s = "my name is vinayak";
		//output = ym eman si kayaniv
	    String	finalstr = "";
		String[] a=s.split(" ");
		
		for(int i=0; i<a.length; i++) {
			String create = a[i];
			
			for(int j= create.length()-1; j>=0; j--) {
				
				finalstr= finalstr+create.charAt(j);
				
			}
			finalstr = finalstr+" ";
			
		}
		System.out.println(finalstr);
		
		
		

	}

}
