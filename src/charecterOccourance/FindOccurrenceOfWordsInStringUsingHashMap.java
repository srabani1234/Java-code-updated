package charecterOccourance;

import java.util.HashMap;
import java.util.Map;

public class FindOccurrenceOfWordsInStringUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String str = "Alice is girl and Bob is boy girl"
        		+ "";
        String[] words=str.split(" ");
        Map<String,Integer> map = new HashMap<String, Integer>();
        
        for(String s:words) {
        	
        	String word=s;
        	if(map.containsKey(word)) {
        		
        		map.put(word, map.get(word)+1);
        	}else
        		map.put(word, 1);
        }
        System.out.println(map);

	}

}
