package standard.methodenaufrufe;

public class MethodCalls {
		public int multiply(int a, int b){
			int result;
			result = calculateMultiplication(a, b);
			return result;
		}

		private int calculateMultiplication(int a, int b) {
			return a * b;
		}
		
		public static void main(String[] args){
			MethodCalls test = new MethodCalls();
			System.out.println(test.multiply(2, 3));
		}
}
