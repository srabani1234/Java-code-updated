package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class ListToHashMao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l=new ArrayList();
		l.add(20);
		l.add(10);
		l.add(30);
		l.add(20);
		
		List l1=new ArrayList();
		l1.add(20);
		l1.add(10);
		l1.add(40);
		l1.add(20);
		
		LinkedHashMap m=new LinkedHashMap();
		
		for(int i=0;i<l.size();i++) {
			m.put(l.get(i), i);
		}
		for(int i=0;i<l1.size();i++) {
			m.put(l1.get(i), i);
		}
		System.out.println(m);
	}

}
