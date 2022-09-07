package Array;

import java.util.HashMap;
//https://www.youtube.com/watch?v=1WugaISSWx8
//Longest Subarray with Equal 0's and 1's
public class ReturnTheMaximumlengthofContiguousSubarrayWithAnEqualNumberOf0and1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* in map already
                          0   1    1    0     1     0     1     1    0    0    1    1  1
           0    sum      -1   0    1    0     1     0     1     2    1    0    1    2   3
          -1      i       0   1    2   3     4     5     6     7     8    9    10   11
		 * 
		 * 
		 * */
		//consider 0=-1 and 1=1
		int[] arr = {0,1,1,0,1,0,1,1,0,0,1,1,1};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(0,-1);//sum 0, and index=-1 .initialize map
		
		int sum=0;
		int len=0;
		int maxLen=0;
		
		for(int i=0;i<arr.length;i++) {
		
			if(arr[i]==0) {
				sum+=-1;
				
			}else if(arr[i]==1) {
				sum+=+1;
				
			}
			
			if(map.containsKey(sum)) {
				System.out.println("i"+i);
				System.out.println("map:"+map.get(sum));
				System.out.println(i +"-"+map.get(sum));
				len=i-map.get(sum);
				if(maxLen<len) {
                  maxLen=len;					
				}
			}else
				{map.put(sum, i);}
			
			
			//When 0,1 equal then sum of subarray=0
		}
System.out.print(maxLen);//12 [0  0    1         0     1     0     1     1    0    0    1    1 ]
	}

}
