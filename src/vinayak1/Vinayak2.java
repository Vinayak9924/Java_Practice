package vinayak1;

public class Vinayak2 extends Vinayak1{

	public static void main(String[] args) {
		
		//Vinayak1 a = new Vinayak1();
		//a.kitkat();
		//a.dairymilk();
	
		//method dairymilk are overridden
		
		Vinayak1 b = new Vinayak2();
		b.kitkat();
		b.dairymilk();
		
		//Vinayak2 c =new Vinayak2();
		//c.kitkat();
		//c.dairymilk();
		

	}
	public void dairymilk() {
		System.out.println("i like to eat dairymilk from child class");
	}

}
