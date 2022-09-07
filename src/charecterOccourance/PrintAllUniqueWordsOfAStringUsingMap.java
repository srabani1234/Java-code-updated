package charecterOccourance;

import java.util.HashMap;
import java.util.Map;

public class PrintAllUniqueWordsOfAStringUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Input  : Welcome to Geeks for Geeks.
Output : Welcome 
         to
         for*/
		//String str= "Welcome to Geeks for Geeks.";
		String str ="Java is great.Python is also great."; 
		
		String[] words = str.replace("."," ").split(" ");
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		for(String word:words) {
			if(map.containsKey(word)) {
				
				map.put(word, map.get(word)+1);
				
			}else {
				map.put(word, 1);
			    //System.out.println(word);
			}
		}
		
		System.out.println(map);//{Java=1, is=2, also=1, great=2, Python=1}

		System.out.println(map.entrySet());//[Java=1, is=2, also=1, great=2, Python=1]

		
		for(Map.Entry<String,Integer> m:map.entrySet()) {
			//System.out.println(m.getKey()+""+m.getValue());
			
			System.out.println("m"+
			m); 
			/*Java=1
			is=2
			also=1
			great=2
		    Python=1*/
			
			if(m.getValue()==1) {
				System.out.println(m.getKey());
			}
			
		}
	

	}

}
