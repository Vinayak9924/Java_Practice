package vinayak1;

public class Method_overriding1 extends Method_overriding {

	public void add() {
		System.out.println("perform addition this method is under child class");
	}
	public void sub() {
		System.out.println("perform substraction this method is under child class");
		
	}
	public void mul() {
		System.out.println(2*2+"perform multiplication this method is under child class");
		
	}
	public static void main(String[] args) {
		
		// Parentclass p = new Parentclass()
		Method_overriding p = new Method_overriding();
		p.add();
		p.sub();
		
		// Childclass c =  new Childclass()
		Method_overriding1 c = new Method_overriding1();
		c.add();
		c.sub();
		c.mul();
		
		// Parentclass p1 = new Childclass()
		Method_overriding p1 = new Method_overriding1();
		//p1.add();
		//p1.sub();
		p1.mul();
		
		// Childclass C1 = new Parentclass()-Not possible in java
		//Method_overriding1 c1= new Method_overriding();
	}

}
