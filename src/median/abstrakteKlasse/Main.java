package median.abstrakteKlasse;

public class Main extends A{
	
	@Override
	public int median(int a, int b, int c){
		return super.median(a,b,c);
	}
	
	
	public static void main(String[] args){
		Main test = new Main();
		System.out.println(test.median(2,3,4));
	}
	
	
}
