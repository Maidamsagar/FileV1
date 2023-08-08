//problem solving
class david{
	public david() {
		System.out.println("hello world 1");
	}
	public david(int a,int b) {
		System.out.println("iam the the parazed constor with "+a+"and "+b);
	}
}
class davidSon extends david{
	public davidSon() {
		System.out.println("iam the 2nd child class");
	}
	public davidSon(int r,int s) {
		System.out.println("iam the 2nd paramzed constr with"+r+"and "+s);
	}
}
class paul extends davidSon{
	public paul() {
		System.out.println("iam the 3rd classs constr");
	}
	public paul(int x,int y ) {
		System.out.println("iam the 3rd paramzed constr with"+x+"and "+y);
	}
}

public class Test102 {
	public static void main(String[] args) {
		paul d=new paul();
		// davidSon e=new paul();
	}

}
