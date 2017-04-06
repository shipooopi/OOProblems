package standard.methodenaufrufe;

public class MethodCalls_faulty {
		public int multiply(int a, int b){
			int result;
			if(a < 0){
				result = calculateMultiplication(a, b);
			}else{
				result = calculateMultiplication(-a,b);
			}
			return result;
		}

		private int calculateMultiplication(int a, int b) {
			return a * b;
		}
		
		public static void main(String[] args){
			MethodCalls_faulty test = new MethodCalls_faulty();
			System.out.println(test.multiply(2, 3));
		}
}
