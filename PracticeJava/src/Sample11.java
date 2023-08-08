import java.util.Random;
import java.util.Scanner;
// problem solving example
class game{
	
	int ranGen;
	int userInPut;
	
	public void takeUserIput() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the input");
		 userInPut=sc.nextInt();		
	}
	//constructor
	public game() {
		Random ran =new Random();
	
		ranGen=ran.nextInt(10);
	}
	public int getComInput() {
		return ranGen;
	}
	public int getInput() {
		return userInPut;
	}
	
	
	
}

public class Sample11 {

	public static void main(String[] args) {
		
		game ga=new game();
		
		ga.takeUserIput();
		System.out.println(ga.getComInput());
		System.out.println(ga.getInput());

	}

}
