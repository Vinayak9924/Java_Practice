package vinayak1;

interface Shapes {
	int length = 10;// final and static
	int width = 20;

	void circle();

	default void square() {
		System.out.println("this is square--default method");
	}

	static void reactangle() {
		System.out.println("this is reactangle--static method");
	}

}

public class Interface_Demo implements Shapes {

	
	public static void main(String[] args) {
		
		/*Interface_Demo id= new Interface_Demo();
		id.circle();
		id.square();
		Shape.reactangle();
     */
		//2
		Shapes sh = new Interface_Demo();
		sh.circle();
		sh.square();
		Shapes.reactangle();
	}

	
	public void circle() {
		
		System.out.println("this is circle-----abstract method");
	}

}
