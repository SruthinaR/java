package OOPs;
class Data1{
	private String name;
	public String getName() {//getter
		return name;
	}
	public void setName(String name) {//setter
		if (name !=null && !name.isEmpty()) {
			this.name=name;
		}
		else {
			System.out.println("Invalid name!");//validation
		}
	}
}

public class encapsulation {
	public static void main(String[] args) {
	Data1 s1=new Data1();//set the name using the setter
	s1.setName("Sruthi");//get the name using getter
	System.out.println("Student Name:"+s1.getName());
	}

}
