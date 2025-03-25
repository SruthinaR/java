package exception;
import java.util.*;
class icecream{
	public void displayInfo() {
	  System.out.println("Blackcurrent");
	}
}

class flavour extends icecream{
	 void flavour() {
		 System.out.println("icecream taste is good");
	 }
}
public class task1 {
	public static void main(String[]args) {
		icecream i1=new icecream();
		flavour f1=new flavour();
		i1.displayInfo();
		f1.flavour();
}
	

}
