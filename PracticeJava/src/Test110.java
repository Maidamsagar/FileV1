//problem solving on methods ---Library
class Library{
	String[] a=new String[100];
	int no_ofBook=0;
	
	void addBooks(String book) {
		this.a[no_ofBook]=book;
		no_ofBook++;
	}
	void availbleBooks() {
		System.out.println("Available books are: ");
		
		for(String e:this.a) {
			if(e==null) {
				continue;
				
			}
			System.out.println("* "+e);
		}
	}
	void issuedBook(String isBook) {
		for(int i=0;i<this.a.length;i++) {
			if(this.a[i].equals(isBook)) {
				System.out.println("this book is issued");
				this.a[i]=null;
				return;
			}
			
		}
		System.out.println("this book is does not exist");
	}
	void returnBook(String rBook) {
		addBooks(rBook);
		
	}
}
public class Test110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library l=new Library();
		l.addBooks("asd");
		l.addBooks("think and grow");
		l.addBooks("use ur brain");
		l.availbleBooks();
		l.issuedBook("asd");
		l.availbleBooks();
		l.returnBook("ramayanam");
		l.availbleBooks();
		

	}

}
