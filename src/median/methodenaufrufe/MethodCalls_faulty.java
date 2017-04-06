package median.methodenaufrufe;

public class MethodCalls_faulty {
		public int getMedian(int a, int b, int c){
			int result = median(a, b, c);
			return result;
		}

		private int median (int a, int b, int c){
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
		
		public static void main(String[] args){
			MethodCalls_faulty test = new MethodCalls_faulty();
			System.out.println(test.getMedian(2, 3, 1));
		}
}
