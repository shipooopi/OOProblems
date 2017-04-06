package median.importieren;

import median.forImport.*;

public class A {
	public int importMultiply(int a, int b, int c){
		Median myMedian = new Median();
		int result = myMedian.median(a, b, c);
		return result;
	}
	
	public static void main(String[] args){
		A test = new A();
		System.out.println(test.importMultiply(3, 5, 1));
	}
}
