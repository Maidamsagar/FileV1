
//inheritance in constructor
// default constructor will executed when we create the object for it
//when we create the object for child class  constructor then the parent class constructor also executed.
class parent{
	int height;
	
	parent(){
		System.out.println("iam a constructor");
	}
	parent(int a){
		System.out.println("hello this is "+a);
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
class child extends parent{
	int weight;
	child (){
		System.out.println("iam a child class constructor");
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
public class Sample13 {

	public static void main(String[] args) {
		// no creating object for parent class
		
		parent p=new parent();
		parent p1=new parent(90);
		
		p.setHeight(30);
		System.out.println(p.getHeight());
		
		System.out.println("*******************");
		
		child c=new child();
		c.setHeight(45);
		c.setWeight(70);
		
		System.out.println(c.getHeight()+"  /t "+c.getWeight());

	}

}
