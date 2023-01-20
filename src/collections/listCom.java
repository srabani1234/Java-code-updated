package collections;

import java.util.TreeSet;

public class listCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t=new TreeSet(new myComparator());
		t.add("hllu");
		t.add("ghhoi");
		t.add("gyy");
		t.add("fff");
		
		System.out.print(t);

	}

}
