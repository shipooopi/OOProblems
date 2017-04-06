package standard.abstrakteKlasse;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public void method(List<A> list){
		for(A listitem: list){
			System.out.println(listitem.m1() + 2);
		}
	}
	
	
	public static void main(String[] args){
		Main test = new Main();
		B testObj1 = new B();
		C testObj2 = new C();
		List<A> testList = new ArrayList<A>();
		
		testList.add(testObj1);
		testList.add(testObj2);
		test.method(testList);
	}
	
	
}
