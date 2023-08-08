class employee1{
	String name;
	int age;
	int salary;
	
	public void details() {
		System.out.println("The person name is "+name);
		System.out.println("and his age "+age);
		//System.out.println("along with his salary "+salary);
	}
	public int getsalary() {
		return salary;
	}

}
public class Sample2 {

	public static void main(String[] args) {
		employee1 emp1=new employee1();
		
		emp1.name="anil kumar";
		emp1.age=24;
		emp1.salary=3400;
		
		emp1.details();
		
		int salary=emp1.getsalary();
		System.out.println("His salary is "+salary);
		

	}

}
