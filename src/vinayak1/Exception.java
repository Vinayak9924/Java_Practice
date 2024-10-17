package vinayak1;

public class Exception {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		System.out.println("a divide b is");
		System.out.println("execution is completed");

		try {
			int div = a / b;
		} catch (java.lang.Exception e) {

			e.printStackTrace();
			System.out.println("------------------");
			System.out.println(e);
			System.out.println("------------------");
			System.out.println(e.toString());
		}

	}
}
