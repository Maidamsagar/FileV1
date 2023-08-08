//
class cap{
	cap(){
		System.out.println("iam the first constructor");
	}
	cap(int a){
		System.out.println("the value of a is :"+a);
	}
	
}

class lap extends cap{
	lap(){
		super(2);
		System.out.println("i am the 2nd lap constructor");
	}
	lap(int a,int b){
		super(a);
		System.out.println("the value of 2nd constructor b is "+b);
	}
}
class dop extends lap{
	dop(){
		System.out.println("iam the 3rd dop constructor");
	}
	dop(int a,int b,int c){
		super(a,b);
		System.out.println("the value of c is "+c);
	}
}
public class Sample16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dop d=new dop(12,30,50);

	}

}
