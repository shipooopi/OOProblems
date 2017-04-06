package standard.importieren;

import standard.methodenaufrufe.MethodCalls;

public class A {
	public int importMultiply(int a, int b){
		MethodCalls methodCalls = new MethodCalls();
		int result;
		result = methodCalls.multiply(a, b);
		return result;
	}
	
	public static void main(String[] args){
		A test = new A();
		System.out.println(test.importMultiply(3, 5));
	}
}
