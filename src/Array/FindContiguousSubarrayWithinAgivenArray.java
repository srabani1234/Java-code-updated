package Array;

/*
 * Write a Java program to find contiguous subarray within a given array of integers which has the largest sum.   Go to the editor

In computer science, the maximum sum subarray problem is the task of finding a contiguous subarray with the largest sum, within a given one-dimensional array A[1...n] of numbers. Formally, the task is to find indices and with, such that the sum is as large as possible.

Example:
Input :
int[] A = {1, 2, -3, -4, 0, 6, 7, 8, 9}
Output:
The largest sum of contiguous sub-array: 30
 * 
 * */

public class FindContiguousSubarrayWithinAgivenArray {
//find continious sub array whose sum is grater
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Sub arrays are subsets of an array.

The difference between sub array and contiguous sub arrays is based on indexing.

for instance, {5,4,3,2,1} is an array of integers indexed from 0.

Sub arrays possible with the given array : {1},{2},{3},{4},{5},{1,5},{1,4} and so on.

Contiguous sub arrays must have consecutive indexes i.e., {5,4} is contiguous sub array as they have indexes that are consecutive (0,1) .

{5,3} cannot be contiguous as the indexes are non-consecutive (0,2)
		 * 
		 * */
		int[] arr = {1, 2, -3, -4, 0, 6, 7, 8, 9,-1};
		//int[] arr = {-5,-2,-1,-6,-7};
		int starIndex=0;
		int endIndex=0;
		int holdStartIndex=0;
		int max_so_far=0;//use for hold addition
		int max_ending_here=0;//use for add array ele
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(max_ending_here+"+"+arr[i]);

			max_ending_here=max_ending_here+arr[i];//-4,0
			if(max_so_far<max_ending_here) {//
				max_so_far=max_ending_here;
				starIndex=holdStartIndex;//0,4
				endIndex=i;//3
				
			}
			if(max_ending_here<0) {//-4<0
				
				max_ending_here=0;
				holdStartIndex=i+1;//4
			}
			
			
		}
		System.out.print(max_so_far+ " "+max_ending_here+" "+starIndex+" "+endIndex);
		
		
		
		
		
	}

}
