class employee{
	String name;
	int age;

	

public void details() {
	System.out.println("Name if the candidate is "+name);
	System.out.println("and his age is "+age);
}
}
public class Sample1 {
	
	
	public static void main(String[] args) {
		Sample1 harry=new Sample1();
		
		employee memb1=new employee();
		//setting attributes
		memb1.name="sagar maidam";
		memb1.age=24;
		
		memb1.details();
		
		

	}
}


