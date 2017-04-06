package standard.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main_faulty {
	
	public void method1(List<Interface1_faulty> list){
		for(Interface1_faulty listitem: list){
			System.out.println(listitem.m1());
		}
	}
	
	public void method2(List<Interface2_faulty> list){
		for(Interface2_faulty listitem: list){
			System.out.println(listitem.m2());
		}
	}
	
	
	public static void main(String[] args){
		Main_faulty test = new Main_faulty();
		A_faulty testObj0 = new A_faulty();
		B_faulty testObj1 = new B_faulty();
		C_faulty testObj2 = new C_faulty();
		List<Interface1_faulty> testList1 = new ArrayList<Interface1_faulty>();
		List<Interface2_faulty> testList2 = new ArrayList<Interface2_faulty>();
		
		testList1.add(testObj0);
		testList1.add(testObj1);
		testList2.add(testObj0);
		testList2.add(testObj2);
		test.method1(testList1);
		test.method2(testList2);
	}
	
	
}