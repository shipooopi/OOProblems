package standard.seiteneffekte;

public class A {
	private int calculationsCount = 0;
	
	public int multiply(int a, int b){
		int result;
		result = a * b;
		calculationsCount++;
		return result;
	}
	
	public static void main(String[] args){
		A test = new A();
		System.out.println(test.multiply(3, 4));
	}
}
