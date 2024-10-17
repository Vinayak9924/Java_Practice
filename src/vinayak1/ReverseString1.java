package vinayak1;

public class ReverseString1 {

	public static void main(String[] args) {
		
		String s = "my name is vinayak";
		String[] create=s.split(" ");
		
		String reversestring ="";
		
		for(String s1:create)
		{
    String rev="";
    for(int i=s1.length()-1; i>=0; i--) {
    	
    	rev=rev+s1.charAt(i);
    	
    }
	reversestring=reversestring+rev+" ";
		}
	System.out.println("reverse string is:"+reversestring);

}
	}
