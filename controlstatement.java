package day1program;
import java.util.*;
public class controlstatement {
	public static void main(String[]args) {
		//if statement
		//int a=10;
		//int b=20;
		/*if(a<b) {
			System.out.println("A less than B");
		}
		else {
			System.out.println("B less than A");
		}*/
		
		//if else statement
		/*if(a<b) {
			if(a%2==0)
			{
				System.out.println(a+"Even number");
			}
		}*/
		
		//if else if statement
		/*int a=300;
		int b=500;
		int c=550;
		if(a>b && a<c) {
			System.out.println("A is greater");
		}
		else if(b>a && b>c) {
			System.out.println("B is greater");
		}
		else if (c>a && c>b) {
			System.out.println("C is greater");
		}
		else
		{
			System.out.println("All are equal");
		}*/
		
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		char choice;
		System.out.println("+,-");
		 choice= s1.next().charAt(0);
		switch(choice) {
		case '+':
			int c=a+b;
			System.out.println("ADD"+c);
		break;
		case '-':
			int d=a-b;
			System.out.println("SUB"+d);
		break;
		default:
				System.out.println("Invalid choice");
			break;
		}
		}
		
		}
	
		
			




