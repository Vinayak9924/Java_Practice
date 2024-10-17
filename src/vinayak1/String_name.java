package vinayak1;

public class String_name {

	public static void main(String[] args) {
		String name="Vinayak";
		String s1=" "+"";
	int length=	name.length();
	System.out.println(length);
	for(int i=0; i<length;i++) {
		s1=name.charAt(i)+s1;
		System.out.println(s1);
	}
	}

}
