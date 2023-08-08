

// constructor
//passing the attribute as parameters


class myStudent{
	
	
	private int id;
	private String  stdName;
	 
	
	// constructor
	 public myStudent(int a ,String n) {
			id=a;
			stdName=n;
		}
	 
	 public void setId(int i) {id=i; }
	 public void setName(String n) { stdName=n;}
	 public int getId() { return id;}
	 public String getName() {return stdName;}
}


public class Sample9 {

	public static void main(String[] args) {
		
		//passing the attribute as parameters
		myStudent std=new myStudent(45,"anil kumar");
		System.out.println(std.getId());
		System.out.println(std.getName());
		

	}

}
