
// Inheritance 

class animals{
	public int height;
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}

class humans extends animals{
	
	public int weight;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
public class Sample12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating object for base class we can add values to the parent class
		
		animals all =new animals();
		humans hu=new humans();
		
		all.setHeight(456);
		hu.setHeight(0);
		
//		all.setHeight(4);
		
		System.out.println(all.getHeight());
		
	    hu.setHeight(45);
	    System.out.println(hu.getHeight());
	
		
		

	}

}
