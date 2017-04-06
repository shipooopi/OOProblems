package median.generics;


public class A<T extends Comparable> {
	
	public T median(T a, T b, T c){
		T result;
		if((a.compareTo(b) <= 0 && a.compareTo(c) >= 0) || (a.compareTo(b) >= 0 && a.compareTo(c) <= 0)){
			result = a;
		} else if((b.compareTo(a) <= 0 && b.compareTo(c) >= 0) || (b.compareTo(a) >= 0 && b.compareTo(c) <= 0)){
			result = b;
		} else {
			result = c;
		}
		return result;
	}
	
	public static void main(String[] args){
		A<Integer> test = new A<Integer>();
		System.out.println(test.median(9, 2, 5));
	}
}
