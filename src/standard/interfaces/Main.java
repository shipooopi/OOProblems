package standard.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public void method1(List<Interface1> list){
		for(Interface1 listitem: list){
			System.out.println(listitem.m1());
		}
	}
	
	public void method2(List<Interface2> list){
		for(Interface2 listitem: list){
			System.out.println(listitem.m2());
		}
	}
	
	
	public static void main(String[] args){
		Main test = new Main();
		A testObj0 = new A();
		B testObj1 = new B();
		C testObj2 = new C();
		List<Interface1> testList1 = new ArrayList<Interface1>();
		List<Interface2> testList2 = new ArrayList<Interface2>();
		
		testList1.add(testObj0);
		testList1.add(testObj1);
		testList2.add(testObj0);
		testList2.add(testObj2);
		test.method1(testList1);
		test.method2(testList2);
	}
	
	
}