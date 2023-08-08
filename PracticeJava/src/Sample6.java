


// when we have private access modifiers we use setters and getters

class Employee3{
	private int age;
	private String name;
	
	
	public void setAge(int a) {
		this.age=a;
	}
	public void setName(String n) {
		this.name=n;
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}
public class Sample6 {

	public static void main(String[] args) {
		Employee3 memb3=new Employee3();
		
		memb3.setAge(24);
		memb3.setName("Sunil kumar");
		
		
		System.out.println(memb3.getAge());
		System.out.println(memb3.getName());

	}

}
