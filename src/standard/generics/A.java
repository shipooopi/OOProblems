package standard.generics;


public class A<T extends Comparable> {

	private T test;
	
	public void method1(T arg1){
		if(arg1.compareTo(this.test) < 0){
			this.test = arg1;
		}
	}
	
	public T getTest(){
		return this.test;
	}
	
	public void setTest(T testValue){
		this.test = testValue;
	}
	
	public static void main(String[] args){
		A<Integer> test = new A<Integer>();
		test.setTest(9);
		System.out.println("Test1: " + test.getTest());
		test.method1(8);
		System.out.println("Test2: " + test.getTest());

		
	}
}
