package Array;

/*Minimum Size Subarray Sum (Smallest Subarray with Sum Greater than or Equal to the Given Value)
input: {7,2,1,1,6,5} k=11
k=11 = {7,2,1,1} and {6,5}
output: 2  {6,5} cz it is minimum sub arary size
 * 
 * 
 * */
//https://www.youtube.com/watch?v=4EiTF5wnqpE
public class SmallestSubarrayWithSumGreaterThanOrEqualToTheGivenValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int minLength=Integer.MAX_VALUE;
		int[] arr={7,2,1,1,6,5};
		int k=11;
		int start=0; //start pointer start=0
		//we are going to take two pointer start and end
		for(int end=0;end< arr.length;end++) {//end=5
			
			sum=sum+arr[end];//|0+7|7+2|9+1|10+1|4+6|9+5=14
			while(sum>=k && start<=end) {//7>=11|9>=11|10>=11|11>=11|14>=11
				//4>=11 condition not satisfied so jump out from loop and increase the end and start is now 2
				
				minLength=Math.min(minLength, end-start+1);//3-0+1=4|(4,)
				sum=sum-arr[start++];//add the value of start and increate the start
				//11-7=4|start=2
			}
			
		}
     System.out.print(minLength);
	}

}
