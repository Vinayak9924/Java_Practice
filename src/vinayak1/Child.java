package vinayak1;

public class Child extends Parent {
	String teacher;

	public void teach() {
		System.out.println("the person teaches");
	}

	public void eat() {
		System.out.println("the person eat from parent ");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.eat();
	}
}
