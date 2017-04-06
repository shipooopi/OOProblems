package median.importieren;

import median.forImport.*;

public class A_faulty {
	public int importMultiply(int a, int b, int c){
		Median_faulty myMedian = new Median_faulty();
		int result = myMedian.median(a, b, c);
		return result;
	}
	
	public static void main(String[] args){
		A_faulty test = new A_faulty();
		System.out.println(test.importMultiply(3, 5, 1));
	}
}
