package standard.abstrakteKlasse;

import java.util.ArrayList;
import java.util.List;

public class Main_faulty {
	
	public void method(List<A_faulty> list){
		for(A_faulty listitem: list){
			System.out.println(listitem.m1() + 2);
		}
	}
	
	
	public static void main(String[] args){
		Main_faulty test = new Main_faulty();
		B_faulty testObj1 = new B_faulty();
		C_faulty testObj2 = new C_faulty();
		List<A_faulty> testList = new ArrayList<A_faulty>();
		
		testList.add(testObj1);
		testList.add(testObj2);
		test.method(testList);
	}
	
	
}
