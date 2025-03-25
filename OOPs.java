package OOPs;
import java.util.*;
class Student {
	String name;
	int rollNum;
	String dept;
	
	void displayData() {
		System.out.println("My Name is:"+name);
		System.out.println("Roll Number:"+rollNum);
		System.out.println("Department:");
	}
}
public class OOPs {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="ram";
		
	}
}
