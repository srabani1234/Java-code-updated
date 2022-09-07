package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class convertArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str= {"this","is","my","pet"};
		List<String> ls=new ArrayList<String>(Arrays.asList(str));
		
		System.out.println(ls);
	}

}
