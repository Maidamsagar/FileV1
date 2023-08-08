//polymorphism

interface myCamera1{
	void takeShot();
	void recordVideo();
	private void treet() {
		System.out.println("Good Morning");
	}
	default void greet() {
		treet();
		System.out.println("hai hello");
	}
}
interface mwifi1{
	String[] getNetworks();
	void connectToNetwork(String network);
}
class myPhone1{
	void callNumber(int phoneNumber) {
		System.out.println("calling ..."+phoneNumber);
	}
	void pickCall() {
		System.out.println("connecting....");
	}
}
class mySmartPhone1 extends myPhone1 implements myCamera1,mwifi1{
	public void takeShot() {
		System.out.println("taking snap....");
	}
	public void recordVideo() {
		System.out.println("recording....");
	}
	public String[] getNetworks() {
		System.out.println("getting list of networks");
		String[] networkList= {"harry","suresh","airtel"};
				
		
		return networkList;
	}
		
	public void connectToNetwork(String network) {
		System.out.println("connecting to "+network );
	}
}

public class Test109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myCamera1 obj=new mySmartPhone1();//only myCmae methods can be retrived
		obj.greet();// this is smartphomne but use for camera--for reference
		
		
		}

	}


