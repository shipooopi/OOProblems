package median.forImport;

public class Median_faulty {
	public int median (int a, int b, int c){
		int result;        
		if ((a >= b && a <= c) || (a <= b && a >= c)) {
	        result = a;
	    } else if ((b >= a && b >= c) || (b <= a && b <= c)) { //fault
	        result = b;
	    } else {
	        result = c;
	    }
	    return result;
	}
}
