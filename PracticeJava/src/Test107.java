//inheritance in interface
// we can extend interface to interface but not 
interface dad{
	void driving();
	void job();
	
}
interface mom extends dad{
	void cooking();
	void baking();
}
interface coclo{
	void fum();
}

class mother implements mom{
	public void driving() {
		System.out.println("meth1");
	}
	public void job() {
		System.out.println("meth2");
	}
	public void cooking() {
		System.out.println("meth3");
	}
	public void baking() {
		System.out.println("meth4");
	}
}
public class Test107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mother m=new mother();
		m.baking();
		m.cooking();
	}

}
