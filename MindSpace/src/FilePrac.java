
class finf{
	
	public void finding() {
		System.out.println("Finding");
		int year =2020;
		if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
			System.out.println("yes Leap Year");
			
		}else
			System.out.println("not a leap year");
	}}
/*
 *
 */
class ternary {
	public void ternaryOperater() {
		System.out.println("Finding the if else statemenet");
		int a=3;
		String output=((a%2==0)?"even":"odd");
		System.out.println(output);
	}
	
}
/*
 * 
 */
class sim{
	public void findingMonth() {
		System.out.println("Finding Month \n");
		int month=11;
		String monthM="";
		switch(month){
		case 1:System.out.println("january");
		break;
		case 2:System.out.println("febraury");
		break;
		case 3:System.out.println("march");
		break;
		case 10:monthM="October";
		break;
		case 11:monthM="November";
		break;
		case 12:monthM="December";
		break;
		default:System.out.println("Invalid");
		}
		System.out.println(monthM);
	}
}
/*
 * 
 */
class num{
	public void Switch() {
		//public enum 
		String Today="";
		enum Day{Sun,Mon,Tue,Wed,Thur,Fri,Sat,}
		Day[] nowDay=Day.values();
		for(Day now:nowDay) {
			switch(now) {
			case Sun:System.out.println("Sunday");
			break;
			case Mon:System.out.println("Monday");
			break;
			case Tue:System.out.println("Tuesday");
			break;
			case Wed:System.out.println("Wednesday");
			break;
//			case Tue:Today="Tuesday";
//			break;
			
			}
			System.out.println(Today);
		}	
}
}
/*
 * 
 */
class pra{
	public void Lable() {
		aa:for(int i=1;i<=3;i++) {
			bb:for(int j=1;j<=3;j++) {
				if(i==2&&j==2) {
				break aa;
				}
				System.out.println(i+" "+j);
			}
			
		}
	}
}
/*
 * 
 */
class jam{
	
}
public class FilePrac {

	public static void main(String[] args) {
		finf n=new finf();
		ternary t=new ternary();
		sim s=new sim();
		num f=new num();
		pra p=new pra();
//		n.finding();
//		t.ternaryOperater();
//		s.findingMonth();
//		f.Switch();
		p.Lable();

}
}
