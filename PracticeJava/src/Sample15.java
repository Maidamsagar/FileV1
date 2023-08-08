class father{
	father(){
		System.out.println("iam his own father");
	}
	father(String name){
		System.out.println("my name is  "+name);
	}
}
class son extends father{
	son(){
		super("Dhoni sing");
		// again the parent constructor will not execute
		//repeated will be avoided.
		// here the parent parameterize construct0r will execute
		System.out.println("he is my father");
	}
	son(String name1){
		super("sumanth");
		// here we have the parameteraised constuctor so thet it will directly gives to the child class parameterraised constructor
		System.out.println("iam "+name1);
	}
}
public class Sample15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		father f=new father();
		son s=new son();
		System.out.println("**********");
		
		father f1=new father("murali krishna");
		son s1=new son("tinku");
		System.out.println("*************");
		
		

	}

}
