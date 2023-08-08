//practicefor all



public class Onichan {
	public int count(int n) {
		int x=121;
		int sum=0;
		while(x!=0) {
			x=x/10;
			sum+=1;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
//		String a ="xxyzyxz";
//		int N=a.length();
//		for(int i=0;i<N;i++) {
//			if(a[i]=="x") {
//				
//			}
//		}
		
	Onichan o=new Onichan();
	o.count(121);
	System.out.println(o.count(121));
			
		
		
		
}
}
