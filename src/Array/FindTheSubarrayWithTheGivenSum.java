package Array;

import java.util.HashMap;

public class FindTheSubarrayWithTheGivenSum {
//Same as code CheckIfGivenArrayContainsSubarrayWithKsum
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
                // |-7-|--6--|
       //          |---13-----| 13-6=7 
                   
	// int[] arr= {10,15,-5,15,-10,5};
     HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
     int sum=6;
    // int sum=20;
     int curSum=0;
     int start=0;
     int end=-1;
     for(int i=0;i<arr.length;i++) {
     curSum=curSum+arr[i];//0+3/3+4/7-1/6+4/10+3/13-6/7-7/2
     map.put(curSum, i);
     
     System.out.println(map);
 
     if(curSum-sum==0) { //for this asrry we use this condition  int[] arr= {10,15,-5,15,-10,5};.int sum=20.here need and minus and check we get in start
    	 start=0;
    	 end=i;
    	 break;
    	 
     }
     if(map.containsKey(curSum-sum)) { //13-6=7
    	 start=map.get((curSum-sum))+1;
    	 end=i;
    	break; 
     }
  

     }
     if(end==-1) {
    	 System.out.println("not found");
     }else {
    	 System.out.print(start+"and"+end+" "+curSum);
     }
     
	}

}
