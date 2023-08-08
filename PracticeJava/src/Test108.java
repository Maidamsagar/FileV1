

interface myCamera{
	void takeShot();
	void recordVideo();
	private void treet() {
		System.out.println("hai hello");
	}
	default void greet() {
		System.out.println("hai hello");
	}
}
interface mwifi{
	String[] getNetworks();
	void connectToNetwork(String network);
}
class myPhone{
	void callNumber(int phoneNumber) {
		System.out.println("calling ..."+phoneNumber);
	}
	void pickCall() {
		System.out.println("connecting....");
	}
}
class mySmartPhone extends myPhone implements myCamera,mwifi{
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

public class Test108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mySmartPhone ms=new mySmartPhone();
		ms.recordVideo();
		String []a=ms.getNetworks();
		for(String e:a) {
			System.out.println(e);
		}

	}

}
