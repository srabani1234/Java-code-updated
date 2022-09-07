package Array;

public class RemoveTheDuplicateElementsOfGivenArray {

	/*Write a Java program to remove the duplicate elements of a given array and return the new length of the array.
Sample array: [20, 20, 30, 40, 50, 50, 50]
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {20, 20, 30, 40, 50, 50, 50};
		
		int k=0;
		for(int i=0;i<arr.length-1;i++) {
				
				if(arr[i]!=arr[i+1]) {
					arr[k]=arr[i];
					k++;
				}	
		}
		
		arr[k++]=arr[arr.length-1];
		for(int l=0;l<k;l++) {
			
			System.out.print(arr[l]);
		}

	}

}
