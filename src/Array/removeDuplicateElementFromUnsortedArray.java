package Array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class removeDuplicateElementFromUnsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,0, 3,-1, -2, 4, 3, 2,4};
		Set<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			
			hs.add(arr[i]);//get not work for hasSet so read element req iterator
			
		}
		
		for(int s:hs) {
			System.out.println(s +" ");
			
		}
	
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			
			int data= (int)itr.next();
			
			System.out.println(data);
			
		}

	}

}
