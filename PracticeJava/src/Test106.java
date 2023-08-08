// problem solving 
// default methods also used in 
/*
 * we cannot add new interface method directly that will go for error
 * implement in the implements class
 * To avoid this default methods are used i.e..by overriding it the latest one 
 * will execute first....
 */
interface girls{
	void skipping();
	void running();
	private void fuf() {
		System.out.println("this private");
	}
	default void coco() {
		fuf();
		System.out.println(" game coco");
	}
}
interface boys{
	void cricket();
	void volyball();
}
class game1{
	void game1(){
		System.out.println("game for boys and girls");
	}
	}
class playing extends game1 implements girls,boys{
	public void skipping() {
		System.out.println("playing by girls");
	}
	public void running() {
		System.out.println("playing by secondary girls ");
	}
	public void cricket() {
		System.out.println("playing by boys");
	}
	public void volyball() {
		System.out.println("playing by secondary boys");
	}
	
}
public class Test106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playing p=new playing();
		p.game1();
		p.cricket();
		p.coco();
		
		

	}

}
