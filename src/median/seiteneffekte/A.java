package median.seiteneffekte;

public class A {
	private int medianCount = 0;
	
	public int median (int a, int b, int c){
		medianCount++;
		int result;        
		if ((a >= b && a <= c) || (a <= b && a >= c)) {
	        result = a;
	    } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
	        result = b;
	    } else {
	        result = c;
	    }
	    return result;
	}
	
	public static void main(String[] args){
		A test = new A();
		System.out.println(test.median(3, 4, 5));
		System.out.println(test.medianCount);
	}
}
