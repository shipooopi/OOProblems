package standard.vererbung;

import java.util.ArrayList;
import java.util.List;

public class C_faulty extends A{
	
	@Override
	public int m1(int a, int b){
		return 2;
	}
	
	public static void main(String[] args){
		A var = new C_faulty();
		int temp = var.m1(3, 4) + var.m2(1, 2);
		System.out.println(temp);
		
		List<A> list = new ArrayList();
		list.add(new B());
		list.add(new C_faulty());
		int i= 0;
		int j = 1;
		for(A listitem: list){
			System.out.println(listitem.m1(i, j) + listitem.m2(i, j));
		}
	}

}
