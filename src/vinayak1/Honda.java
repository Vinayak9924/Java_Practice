package vinayak1;

 interface Honda {
	
	int handle=1;
	int tyrecount=2;
	public void handle();
	
	public void engine();
	
	public void tyres();

}

 class Bike implements Honda{
     
	
	public void handle() {
		System.out.println(handle);
	}

	
	public void engine() {
		System.out.println("4 stroke petrol engine ");
	}

	
	public void tyres() {
		
		System.out.println(tyrecount);
	}
	public static void main(String[] args) {
		Honda Bike_details=new Bike();
		Bike_details.engine();
	}
}