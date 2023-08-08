
//setting and getting the properties

class employee2{
	int salary;
	String name;
	
	
	public int getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
		
	}
	
	public void setName(String n) {
		name= n;
	}
	
	public void setSalary(int s) {
		salary=s;
	}
}

public class Sample3 {

	public static void main(String[] args) {
		employee2 memb2=new employee2();
		
		
		memb2.setName("vinay kumar");
		
		
		
		memb2.getName();
		System.out.println(memb2.getName());
		
		
		memb2.setSalary(3400);
		System.out.println(memb2.getSalary());
		
	    

	}

}
