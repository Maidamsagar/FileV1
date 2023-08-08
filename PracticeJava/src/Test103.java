//abstract classes

abstract class earn{
	public earn(){
		System.out.println("hello");
	}
	abstract void ran() ;//************** method overridding
}

 abstract class cash extends earn{
	public void ran(){
		System.out.println("iam ran");
	}
	abstract void kilo();//*****************
}

class deposit extends cash{
	public void kilo() {
		System.out.println("iam kilo");
	}
}
public class Test103 {
	
	public static void main(String[] args) {
		//earn e=new earn();
		deposit d=new deposit();
		d.kilo();
	}

}
