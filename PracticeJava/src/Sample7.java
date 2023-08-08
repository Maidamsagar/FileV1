import java.util.Random;
import java.util.Scanner;

public class Sample7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1.enter the rock    1)paper        2)scissor ");
		
		int option=sc.nextInt();
		Random CumpOption=new Random();
		int randGentator=CumpOption.nextInt(3);
		
		
		System.out.println("the User and System Input is "+option+" And "+randGentator);
		
		if(option==randGentator) {
			System.out.println("The game is Draw");
		}
		else if(option==0 && randGentator==2 || option==2 && randGentator==1 || option==1 && randGentator==0) {
			System.out.println("you win");
		}else {
			System.out.println("you lost it");
		}
		

	}

}
