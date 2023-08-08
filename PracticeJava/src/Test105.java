// why interfaces are dynamic 

// why not abstract y interface because it can form one class by implemneting 
interface flat{
	int a=45;
	void kitchen();
	void bathroom();
	void bedroom();
}

interface room{
	int b=65;
	void playground();
	void hall();
	void balcony();
}
class villa implements flat,room{
	public void kitchen() {
		System.out.println("yes 1");
	}
	public void bathroom() {
		System.out.println("yes 2");
	}
	public void bedroom() {
		System.out.println("yes 3");
	}
	
	public void playground() {
		System.out.println("4th floor");
	}
	public void hall() {
		System.out.println("5 th floor");
	}
	public void balcony() {
		System.out.println("6th floor");
	}
}
public class Test105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		villa v=new villa();
		v.balcony();
		v.bathroom();

	}

}
