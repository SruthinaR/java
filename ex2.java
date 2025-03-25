package exception;

public class ex2 {
	static void checkAge(int age) {
		if(age<18) {
			throw new IllegalArgumentException
			("Age must be 18 or older ");
		}
		System.out.println("Access granted");
	}
	public static void main(String[] args) {
		try {
			checkAge(16);//will throw an a exception
		}
		catch(IllegalArgumentException e) {
			System.out.println("Catch Exception:"+e.getMessage());
		}
	}
		
	}


