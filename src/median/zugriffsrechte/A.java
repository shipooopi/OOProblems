package median.zugriffsrechte;

public class A {

	public int publicMedian (int a, int b, int c){
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

	protected int protectedMedian (int a, int b, int c){
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

	int packageMedian (int a, int b, int c){
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

	private int privateMedian (int a, int b, int c){
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
		System.out.println(test.publicMedian(2,3,5) + " " + test.protectedMedian(2,3,5) + " " + test.packageMedian(2,3,5) + " " + test.privateMedian(2,3,5));
	}
}
