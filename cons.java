package OOPs;
class car{
	String brand;
	car(){
	brand="known";
	}
	void display() {
		System.out.println("the brand name is"+brand);
	}
}
public class cons{
	public static void main(String[] args) {
		car c1=new car();
		c1.display();
	}
}
		
	
			
	