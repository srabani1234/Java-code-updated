package Array;

import java.util.Arrays;

/*Rearrange a given array of unique elements such that every second element of the array 
 * is greater than its left and right elements
 * Input :
nums= { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 }
Output:
Array with every second element is greater than its left and right elements:
[1, 4, 2, 9, 3, 8, 5, 10, 7, 14, 12]



 * */
public class EverySecondElementOfTheArrayGreaterThanItsLeftAndRightElements {
	
	public static void swapnum(int[] arr,int i,int j) {
		
		int temp=0;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void rearrange(int[] arr) {
	 for(int i=1;i<arr.length-1;i+=2) {
		 
		 if( arr[i-1]>arr[i]) {
			 swapnum(arr,i-1,i);
		 }
		 if( arr[i+1]>arr[i]) {
			 swapnum(arr,i+1,i);
		 }
		 
	
	 }	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 };
		rearrange(arr);
		System.out.println(Arrays.toString(arr));

	}

}
