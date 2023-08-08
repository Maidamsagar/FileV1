// dynamic method dispatch
// when the method overridding, 
class phone{
	public void phone1() {
		System.out.println("iam the phone ");
	}
	public void  phone2() {
		System.out.println("iam the phone 2");
	}
}
class smartPhone extends phone {
	public void phone2() {
		
		System.out.println(" iam the phone 2 from smart phone");
	}
	public void phone3() {
		System.out.println("t am the smart phone 3");
	}
}
public class Test100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone p=new phone();
//		p.phone1();
//		p.phone2();
		smartPhone s=new smartPhone();
		s.phone2();
		System.err.println("*****");
		phone ps=new smartPhone(); // method of object
		ps.phone1();
		ps.phone2();//
		//the method which is in the both class, from that child class will execute
		//ps.phone3(); is not allowed

	}

}
