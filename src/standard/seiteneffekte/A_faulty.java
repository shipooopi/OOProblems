package standard.seiteneffekte;

/*
 * Wie muss dieses Programm aussehen, damit das Nichtbetrachten des Seiteneffektes in einem Input-Output-Profil deutlich wird?
 */
public class A_faulty {
	private int calculationsCount = 0;
	
	public int multiply(int a, int b){
		int result;
		result = a * b;
		if(result > 0){
			calculationsCount++;
		}else{
			calculationsCount--;
		}
		return result;
	}
	
	public static void main(String[] args){
		A_faulty test = new A_faulty();
		System.out.println(test.multiply(3, 4));
	}
}
