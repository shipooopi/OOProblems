package median.vererbung;

public class B extends A{
	
	@Override
	public int median(int a, int b, int c){
		return super.median(a,b,c);
	}

	public static void main(String[] args){
		A test = new A();
		System.out.println(test.median(2, 1, 4));
	}
}
