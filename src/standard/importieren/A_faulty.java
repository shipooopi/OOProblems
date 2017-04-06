package standard.importieren;

import standard.methodenaufrufe.MethodCalls;

/*
 * Verändern, dass das Programm nicht von einem anderen Programm abhängt(also schon, aber ein extra dafür erstelltes)
 */

public class A_faulty {
	public int importMultiply(int a, int b){
		MethodCalls methodCalls = new MethodCalls();
		int result;
		if(a > 0){
			result = methodCalls.multiply(a, b);
		}else{
			result = methodCalls.multiply(-a, b);
		}
		return result;
	}
	
	public static void main(String[] args){
		A_faulty test = new A_faulty();
		System.out.println(test.importMultiply(3, 5));
	}
}
