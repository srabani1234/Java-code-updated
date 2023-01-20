package charecterOccourance;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class StringRearrange {
	public static String rearrangeCharacters(String str) {
		/*  HashMap<String, Integer> map
            = new HashMap<>();
        map.put("a", 100);
        map.put("b", 200);
        map.put("c", 300);
        map.put("d", 400);
  
        // print map details
        System.out.println("HashMap: "
                           + map.toString());
  
        // provide key whose value has to be obtained
        // and default value for the key. Store the
        // return value in k
        int k = map.getOrDefault("y", 500);->o/p-500
		 * *///aabcba->a=3,b=2,c=1 a,b,a,b,c,a
		//code here
		String s=str;//aabba
		Map<Character,Integer> map=new HashMap();
		for(char c:s.toCharArray())
		{    map.put(c,map.getOrDefault(c, 0)+1);//getOrDefault take default value if value not present
		System.out.println("getOrDefault:"+c+":"+map.getOrDefault(c, 0));
		System.out.println("map start:"+map);}
		/* priority queue in Java is a special type of queue wherein all the elements are ordered as per their
		 *  natural ordering or based on a
		 *  custom Comparator supplied at the time of creation.
		 * 
		 * */
		//Let’s say that we need to create a priority queue of String elements in which the String with the smallest length is processed first.
		//like above String elemnt which count grater proceed first
		//We can create such a priority queue by passing a custom Comparator that compares two Strings charecter by their count.base on grater count
	    PriorityQueue<Character> maxHeap=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));//One of the PriorityQueue constructors takes a Comparator as an argument:
//and comparator has one abstrat method compare that is here.greater count in priority quee store at top like a here
	    maxHeap.addAll(map.keySet());
	    System.out.println("maxHeap:"+maxHeap);
	    StringBuilder result=new StringBuilder();
	    while(maxHeap.size()>1){
	        char current=maxHeap.remove();
	        System.out.println("current:"+current);

	        char next=maxHeap.remove();
	        System.out.println("next:"+next);

	        result.append(current);
	        result.append(next);
	        System.out.println("result:"+result);
	        System.out.println("map mid:"+map);
	        map.put(current,map.get(current)-1);
	        System.out.println("map.get(current):"+map.get(current));
	        map.put(next,map.get(next)-1);
	        System.out.println("map.get(next):"+map.get(next));
  System.out.println("map data:"+map);
	        if(map.get(current)>0)
	        maxHeap.add(current);
	        if(map.get(next)>0)
	        maxHeap.add(next);
	        
	        System.out.println("maxheap"+maxHeap);
	    }
		if(!maxHeap.isEmpty()){
		    char last=maxHeap.remove();
		    if(map.get(last)!=1)
		    return "-1";
		    else
		    result.append(last);
		}
		return result.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(rearrangeCharacters("acbcbcc"));//cbcbcac

		 System.out.println(rearrangeCharacters("aabbacc"));

	}

}
