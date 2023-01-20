package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class duplicateElement {
	public static void main(String[] args) {
		
	ArrayList<Integer> al=new ArrayList<Integer>();	
	al.add(1);
	al.add(2);
	al.add(1);
	
	HashSet<Integer> h=new HashSet<Integer>();
	HashSet<Integer> h1=new HashSet<Integer>();
	for(int i=0;i<al.size();i++) {
		
		//h.add(al.get(i));
		if(!h.add(al.get(i))) {
			
			h1.add(al.get(i));
		}
		
		
	}
	System.out.println(h);
	System.out.println(h1);
	}
}
