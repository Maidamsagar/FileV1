

//meth overloading with constructors

class myStudent1{
	
	
	private int id;
	private String  stdName;
	 
	
	// constructor
	 public myStudent1(int a ,String n) {
			id=a;
			stdName=n;
		}
	 //
	 public myStudent1() {
			id=56;
			stdName="pooja";
		}
	 public myStudent1(int a ,String n,int nu) {
			id=a;
			stdName=n;
		}
	 public void setId(int i) {id=i; }
	 public void setName(String n) { stdName=n;}
	 public int getId() { return id;}
	 public String getName() {return stdName;}
}
public class Sample10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myStudent1 van =new myStudent1();
		myStudent1 va=new myStudent1(23,"lion");
		
	
		System.out.println(va.getName());
		System.out.println(va.getId());
		
		System.out.println("**********");
		
		System.out.println(van.getId());
		System.out.println(van.getName());

	}

}
