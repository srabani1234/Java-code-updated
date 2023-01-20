package Array;

public class findSumOfContiguiosSubArrayWinthinGinenArra {
	/*
	 * This code work for negative element array int[] arr={-5,-6,-1,-2,-7,1,2};
	 * Write a Java program to find contiguous subarray within a given array of integers which has the largest sum.   Go to the editor

	In computer science, the maximum sum subarray problem is the task of finding a contiguous subarray with the largest sum, within a given one-dimensional array A[1...n] of numbers. Formally, the task is to find indices and with, such that the sum is as large as possible.

	Example:
	Input :
	int[] A = {1, 2, -3, -4, 0, 6, 7, 8, 9}
	Output:
	The largest sum of contiguous sub-array: 30
	 * 
	 * */
	 public static int maxSubarraySum(int arr[], int n){
	        
	       int start=0;
	       int end=0;
	       int holdIndex=0;
	        int currMax=0;//-11
	        int Max=0; //-5
	        for(int i=0;i<n;i++){
	            if(i==0){
	                currMax=arr[i];//-5
	                Max=currMax;//-5
	                continue;//continue the next iteration
	             //  break;//o/p-5
	                
	                //As mentioned break is used for the termination of enclosing loop.
	                //On other hand continue causes early execution of the next iteration of the enclosing loop.
	                
	            }
	            System.out.println("cu:"+currMax);
	                System.out.println("Max:"+Max);
	            			System.out.println(currMax+"+"+arr[i]);
	            			//-5,-6,-1,-2,-7,1,2,-1
	      	               
//perform by next iteration when i=1.-5+(-6)
	            currMax+=arr[i];//-5+(-6)=-11//-6-1=-7//-3//-2-7=-9//-7+1=6//1+2=3
	            System.out.println("arr[i]:"+arr[i]);//-11,-7
	            if(currMax<arr[i]){//3<2
	                currMax=arr[i];//-6,-1,-2,-7,1,3
	                holdIndex=i;////1,2,3,4,5
	               
	            }
	            if(currMax>=Max){//\//
	                Max=currMax;//-1,1
	                start=holdIndex;//2,5
                    end=i;	           //  5
	            }
	        }
	        System.out.println("max index:"+start);
	        System.out.println("end:"+end);
	        return Max;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	int[] arr=  {1, 2, -3, -4, 0, 6, 7, 8, 9,-1};
		int[] arr={-5,-6,-1,-2,-7,1,2,-1};
       //int[] arr= {10,-5,1};
		//int[] arr={-1,-2,-3,-6,-8,-6};
	//	int[] arr={1, 2, -3, -4, 0, 6, 7, 8, 9,-1};
		System.out.println(maxSubarraySum(arr,arr.length));
	}

}
