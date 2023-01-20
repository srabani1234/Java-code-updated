package charecterOccourance;

import java.util.HashMap;
import java.util.Map;

public class pristCharecterNoWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="ababcab";
	char[] ch=str.toCharArray();	
 HashMap<Character,Integer> mp=new HashMap<Character,Integer>();	
 
 for(char c:ch) {
	 if(mp.containsKey(c)) {
		 mp.put(c, mp.get(c)+1);
		 System.out.print(mp.get(c)+""+c);
		 
		 
	 }
	 else {
		 mp.put(c, 1);
		 System.out.print(mp.get(c)+""+c);
	 }
 }

	}

}
