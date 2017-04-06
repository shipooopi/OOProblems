package median.interfaces;

public class Main implements Interface1 {
	
	public int getMedian(int a, int b, int c){
		return Interface1.median(a, b, c);
	}
	
	
	public static void main(String[] args){
		Main test = new Main();
		System.out.println(test.getMedian(5,3,1));
	}	
	
}