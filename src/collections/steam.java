package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class steam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Integer> ls=new ArrayList<Integer>();	
	ls.add(1);
	ls.add(1);
	ls.add(3);
	ls.add(-1);
	
	List<Integer> l2=ls.stream().filter(i->i>0).distinct().toList();
	
	System.out.println(l2);

	}

}
