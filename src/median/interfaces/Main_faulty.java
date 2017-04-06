package median.interfaces;

public class Main_faulty implements Interface1_faulty {
	
	public int getMedian(int a, int b, int c){
		return Interface1_faulty.median(a, b, c);
	}
	
	
	public static void main(String[] args){
		Main_faulty test = new Main_faulty();
		System.out.println(test.getMedian(5,3,1));
	}	
	
}