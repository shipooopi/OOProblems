package median.interfaces;

public interface Interface1 {

	public static int median (int a, int b, int c){
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
	
}
