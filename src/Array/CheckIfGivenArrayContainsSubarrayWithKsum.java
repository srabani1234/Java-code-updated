package Array;

import java.util.HashSet;

public class CheckIfGivenArrayContainsSubarrayWithKsum {
/*a=[3,4,-1,4,3,-6,-7,2]
 *  <-->  <------>
 *  x=7     k=0
 * <-------------->
 *      y=7
 * x+k=y
 * x-y=k
 * y-k=x
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr = {3,4,-1,4,3,-6,-7,2};
    System.out.print(test(arr));
    
	}
	
	public static boolean test(int[] arr) {
		HashSet<Integer> hs = new HashSet<Integer>();
		int k=6;//true [-1,4,3]
		boolean flag=false;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			hs.add(sum);
			sum=sum+arr[i];
			if(hs.contains(sum-k)) {
				flag =true;
				return true;
			}
			
		}
		return false;
		
		
	}

}
