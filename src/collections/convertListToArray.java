package collections;

import java.util.ArrayList;
import java.util.List;

public class convertListToArray {
//convert List to Array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> ls= new ArrayList<String>();
		ls.add("DBG");
		ls.add("MPG");
		ls.add("DSG");
		ls.add("GTY");
		
		System.out.println(ls);
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
			
		}
		
		String[] st = new String[ls.size()];
		ls.toArray(st);
		for(String s:st) {
			System.out.println(s);
			
		}

	}

}
