package median.abstrakteKlasse;

public class Main_faulty extends A_faulty{
	
	@Override
	public int median(int a, int b, int c){
		return super.median(a,b,c);
	}
	
	
	public static void main(String[] args){
		Main_faulty test = new Main_faulty();
		System.out.println(test.median(2,3,4));
	}
	
	
}
