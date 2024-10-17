package vinayak1;

public class Finally {

	public static void main(String[] args) {
		  
		int a=10;
		int b=20;
		System.out.println("a is divided by b");
		System.out.println("execution is completed");
		
		
		try {
			System.out.println("open a connection for db");
			System.out.println("reading the data from db");
		}
		catch (java.lang.Exception q){
			System.out.println("closing the adb");
		}
		finally {
			System.out.println("closing the db");
		}
		

	}

}
