//problem solving
class circle{
	public int radius;
	
	public double area() {
		return Math.PI*this.radius*this.radius;
		
	}
	public circle (){
		
	}
	
}
class cylinder extends circle{
	public int height;
	public cylinder(int r,int h){
		this.radius=r;
		this.height=h;
		
	}
	public double volume() {
		return Math.PI*this.radius*this.height;
	}
	
}
public class Test101 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cylinder c=new cylinder(2,4);
		c.volume();
		System.out.println(c.volume());
		System.out.println(c.area());

	}

}
