

// Constructor   invoke the details in it automatically when we create the object
//no need of creating setters and getters

 class student{
	 private int id;
	 private String  stdName;
	 
	 public void setId(int i) {id=i; }
	 public void setName(String n) { stdName=n;}
	 public int getId() { return id;}
	 public String getName() {return stdName;}
	 
	 
	 //Constructor
	 
	 public student() {
		 id=456;
		 stdName="Nanda Kishor";
	 }

 }
public class Sample8 {
	public static void main(String[] args) {
	 
		student delt=new student();
		
		delt.setId(34);
		delt.setName("Anil kumar");
		
		System.out.println(delt.getId());
		System.out.println(delt.getName());
		
		
		
		
	}

}
