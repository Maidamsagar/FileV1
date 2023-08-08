

// method overriding
// done in inheritance  only
// 
class A{
   public int a;
   public int harry() {
	return 4;
	
}
   public void meth1(){
	   System.out.println(" iam meth 1");
   }
   public void meth2() {
	   System.out.println(" iam meth 2");
   }
   

}
class B extends A{
	public void meth2() {
		   System.out.println(" iam meth 2 of class B");
	   }
	public void meth3() {
		System.out.println(" iam meth 3");
	}
}
public class Sample18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A x=new A();
		x.meth1();
		x.meth2();
	System.err.println("********");
	    
	    B y=new B();
	    y.meth2();
	

	}

}
