package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//int arr[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
public class occouranceOfDigitInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
		HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
	  for(int i=0;i<arr.length;i++) {
		  
		  if(m.containsKey(arr[i])) {
			  int t=arr[i];
			  m.put(arr[i], m.get(arr[i])+1 );
			  
		  }
		  else {
			  
			  m.put(arr[i],1);
		  }
		  
	  }
	  System.out.println(m);
	  //store result
	  Map.Entry<Integer,Integer> storResult=null;
	  
	  for(Map.Entry<Integer, Integer> mp: m.entrySet()) {
		  //  // If this entry's value is more than the
          // max value Set this entry as the max
		//  System.out.println(mp.getValue());
		  //-mp.getValue().compareTo(storResult.getValue())>0
		  if(storResult==null || mp.getValue().compareTo(storResult.getValue())>0) {
			//System.out.println(storResult);
			  storResult=mp;
			 // System.out.println(storResult.getValue());
		  }
		  
	  }
	//  System.out.println("g".compareTo(null)>0);
	  System.out.println(storResult);
		
	}

}
