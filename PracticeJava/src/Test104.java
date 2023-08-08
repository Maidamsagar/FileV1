// INTERFACES
// we can create properties in interfaces
// we cant modify the vale of it because it is final
interface home{
	int a=45;
	void kitchen();
	void bathroom();
	void bedroom();
}

class building implements home{
	public void kitchen() {
		System.out.println("yes 1");
	}
	public void bathroom() {
		System.out.println("yes 2");
	}
	public void bedroom() {
		System.out.println("yes 3");
	}
}
public class Test104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		building b=new building();
		b.kitchen();
		b.bathroom();
		b.bedroom();
		//   b.a=987; it is not possible
	   	System.out.println(b.a);

	}

}
