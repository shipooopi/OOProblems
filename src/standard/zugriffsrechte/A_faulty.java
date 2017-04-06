package standard.zugriffsrechte;

public class A_faulty {

	public int publicTest(){
		return 1;
	}
	
	protected int protectedTest(){
		return 2;
	}
	
	int packageTest(){
		return 3;
	}
	
	private int privateTest(){
		return 4;
	}
	
	public static void main(String[] args){
		A_faulty test = new A_faulty();
		System.out.println(test.publicTest() + test.protectedTest() + test.packageTest() + test.privateTest());
	}
}
