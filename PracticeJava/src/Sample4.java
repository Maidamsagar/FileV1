class cellPhone{
	String ring;
	String silent;
	
	public String ring() {
		return ring;
	}
	public String silent() {
		return silent;
	}
}
public class Sample4 {

	public static void main(String[] args) {
		cellPhone mobile=new cellPhone();
		
		mobile.ring="Ringing";
		mobile.silent="vibrating";
		
		String status=mobile.ring();
		String status1=mobile.silent();
		
		System.out.println(status);
		System.out.println(status1);

	}

}
