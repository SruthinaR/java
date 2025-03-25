package OOPs;
class Book{
	int BookId;
	String title;
	String author;
	int price;
	Book(int BookId,String title,String author,int price) {
		this.BookId=BookId;
		this.title=title;
		this.author=author;
		this.price=price;
	}
	

void display() {
  System.out.println("the bookId name is"+BookId);
  System.out.println("the title is"+title);
  System.out.println("the author is"+author);
  System.out.println("the price is"+price);
}
}
 public class cons1 {
	 public static void main(String []args) {
		 Book b1=new Book(1,"moon","sruthi",77);
		 b1.display();
	 }

}


