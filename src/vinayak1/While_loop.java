package vinayak1;

public class While_loop {

	public static void main(String[] args) {
	//divisible by 2 or not
		
		int i=10;
		while(i<=20) {
		if(i%2==0) {
			//System.out.println("divisible by 2"+":" +i);
			continue;
		}else {
			System.out.println("not divisible by 2"+":" +i);
		}
	i++;
		}

	}

}
