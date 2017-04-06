package median.methodenaufrufe;

public class MethodCalls {
		public int getMedian(int a, int b, int c){
			int result = median(a, b, c);
			return result;
		}

		public int median (int a, int b, int c){
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
			MethodCalls test = new MethodCalls();
			System.out.println(test.getMedian(2, 3, 1));
		}
}
