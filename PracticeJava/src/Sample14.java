
// super key is used to class overloaded method in base class
// without creating the another object for that class
class Base {
	String name;
	
	public void setname(String a) {
		this .name=a;
		
	}
	public String getName() {
		return name;
	}
	
	Base(){
		
		System.out.println("iam the first Constructor");
	}
	Base(String a){
		name=a;
		System.out.println(name +" this is his name");
	}
}

class face extends Base{
	int age;
	
	public void setAge(int b) {
		this.age=b;
		
	}
	// here the super key will give the command to parent parametertaised constructure
    // first super key will execute i.e 
	// second the face()
	//third the parent constructor
	//
	face(){
		super("sunil kumar");
		System.out.println("iam the second Constructor");
	}
	face(int a){
		
		age=a;
		System.out.println("his actual age is "+age);
	}
	public int getAge() {
		return age;
	}
}
public class Sample14 {

	public static void main(String[] args) {
		// first class ---Base class
		Base b=new Base();
		Base b1=new Base("krishan");
		b.setname("sagar");
		b.getName(); // no display	
		
		
		System.out.println(b.getName());
		
		System.out.println("*************************");
		// second class----face class
		
		face f=new face();
		face f1=new face(24);
//		f.setAge(23);
//		System.out.println(f.getAge());
//		
		System.out.println("*************************");
		// using super key word we no need to create object for overloaded constructur
		
		
		
		

	}

}
