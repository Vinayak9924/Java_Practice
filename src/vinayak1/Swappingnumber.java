package vinayak1;

import java.util.Scanner;

public class Swappingnumber {

	public static void main(String[] args) {
		int x,y,t;
		Scanner sc = new Scanner(System.in);
	x=sc.nextInt();
	y=sc.nextInt();
	System.out.println("before swapping numbers:"+x+" "+y+"");

	t=x;
	x=y;
	y=t;
	
	System.out.println("after swapping numbers:"+x+" "+y+"");
	
	}

}
