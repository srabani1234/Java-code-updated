package Array;

import java.util.HashSet;

public class CheckIfGivenArrayContainsSubarrayWith0Sum {
/*
 * Write a Java program to check if a given array contains a subarray with 0 sum.

Example:
Input :2
nums1= { 1, , -2, 3, 4, 5, 6 }
nums2 = { 1, 2, 3, 4, 5, 6 }
nums3 = { 1, 2, -3, 4, 5, 6 }
Output:
Does the said array contain a subarray with 0 sum: true
Does the said array contain a subarray with 0 sum: false
Does the said array contain a subarray with 0 sum: true
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*a=[3,4,-1,4,3,-6,-7,2]
		 *   <-><-----0-->
		 *    x=7
		 *   <----------->
		 *      y=7
		 *   means x=y (cz in y we have 0 also(-1+4+3+(-6))
		 *   we can check this through hashSet. if 0 already in hashSet)   
		 *   if y-x =0 and that is exsit in set previosly.that is logic.
		 * */
	//	int[] arr = { 1, 2, -2, 3, 4, 5, 6 };
		int[] arr = {3,4,-1,4,3,-6,-7,2};
	//	int[] arr= { 1, 2, 3, 4, 5, 6 };

      //  int[] arr={1,2,-4,1,3,7,2};
	 System.out.println(test(arr));
		
	}
	public static boolean test(int[] arr) {
	    int sum = 0;
	    boolean flag=false;
	    HashSet<Integer> hs = new HashSet<Integer>();
	    for(int i=0;i<arr.length;i++) {
	        hs.add(sum);
	     System.out.println("hs:"+hs);
	     sum=sum+arr[i];
	 
	     if(hs.contains(sum)) {
	    	 System.out.println(i);
	    	 flag=true;
	    	return true; 
	     }
	    	
	    }
		return false;

	}

}
