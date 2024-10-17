package vinayak1;

public class Method_overloading {

	public static void main(String[] args) {

		Method_overloading c = new Method_overloading();
		c.add(20, 30);
		c.add(10, 20, 30);
		c.add(10, 25.5f);

	}

	public int add(int a, int b) {
		int sum = 0;
		sum = a + b;
		System.out.println(sum);
		return sum;
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);

	}

	public void add(int a, float f) {
		System.out.println(a + f);

	}

}
