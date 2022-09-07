package Array;

import java.util.HashSet;

public class findTheLengthOfTheLongestConsecutiveElementsSequence {
/*Write a Java program to find the length of the longest consecutive elements sequence from a given unsorted array of integers.
Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5.
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {49, 1, 3, 200, 2, 4, 70, 5};
		int no=0;
		int largeLength=0;
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			
			hs.add(arr[i]);
			
		}
		
		for(int i=0;i<arr.length;i++) {
			
			if(!hs.contains(arr[i]-1)) {
				
				no=arr[i];
				
				while(hs.contains(no)) {
					
					
					no++;
					System.out.println("no:"+no);
				}
				
				
				if(largeLength<no-arr[i]) {
				
					largeLength=no-arr[i];
				for(int j=arr[i];j<no;j++) {
					
					System.out.print(j);
				}
					
				}
				

			}
			
			
		}
		System.out.println("largeLength:"+largeLength);
		
	}

}
