package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/*Input : arr[] = {5, 2, 3, 6, 4, 4, 6, 6}
Output : Yes
The elements form a contiguous set of integers
which is {2, 3, 4, 5, 6}.

Input : arr[] = {10, 14, 10, 12, 12, 13, 15}
Output : No
 * */

public class theArrayContainsASetOfContiguousIntegers {

	public static boolean test(ArrayList<Integer> l) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		
		for(int i=0;i<l.size();i++) {
			hs.add(l.get(i));
		}
		
		int max = Collections.max(hs);
        int min = Collections.min(hs);
        
        System.out.println(hs);
        System.out.println(max);
        System.out.println(min);
        System.out.println("size:"
        		+ ""+hs.size());
        if(hs.size()!=(max-min+1)) {
        	return false;
        	
        }

		return true;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr= {10,17, 14, 10, 12, 12, 13, 15};
		
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println(test(al));
		
      //  test(al);
	}

}
