class ram{
	int a;

	ram(int a){         
		this.a=a;
		                   /*
	                        (int v)
	                         a=v;
	                      */
		
		
	}
	public int getName() {
		return a;
	}
	public int returnone() {
		return 1;
	}
	
}
class jam extends ram{
	jam(int c){
		super(c); 
		// here nothing will execute because 
		//there is no parametzed constructor inthe parent calss
		System.out.println("iam aconstructor");
	}
}
public class Sample17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ram r=new ram(62);
		System.out.println(r.getName());
		
		jam j=new jam(4);

	}

}
