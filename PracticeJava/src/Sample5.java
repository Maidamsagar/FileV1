class square{
	int size;
	int area;
	int perimeter;
	
	public int size() {
		return size;
		
	}
	
	public int areaCalculation() {
		
		return size*size;
		
	}
	public int perimeter() {
		return 4*size;
	}
}
public class Sample5 {

	public static void main(String[] args) {
		square length =new square();
		
		length.size=4;
		
		System.out.println(length.areaCalculation());

		
	}

}
