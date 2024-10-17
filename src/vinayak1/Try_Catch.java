package vinayak1;

public class Try_Catch {

	public static void main(String[] args)  {
		int a=10;
		int b=0;
		try{
			System.out.println("b cannot divide a");
			try {
				int div= a/b;
			
			} catch (java.lang.Exception e) {
				System.out.println("apple");
				}
		}
	      catch (NullPointerException e){
		 
		System.out.println("Hi everyone");	
		
		}
		
		catch (ArithmeticException g){
			System.out.println("catch block execute");
			
		}
		 catch (java.lang.Exception e){
			 
				System.out.println("Hi everyone");
		 }
		

	}

}
