package vinayak1;

public class Shape extends Circle {

	int r= 20;
	void findArea() {
		System.out.println(r*r*7.21);
		
		
	}
public static void main(String[] args) {
	 Shape s = new Shape();
	 s.findArea();
}
}
