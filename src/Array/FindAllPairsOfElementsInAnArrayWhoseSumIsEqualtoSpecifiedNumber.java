package Array;

public class FindAllPairsOfElementsInAnArrayWhoseSumIsEqualtoSpecifiedNumber {
//Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.

/*{2, 7, 4, -5, 11, 5, 20}, 15*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2, 7, 4, -5, 11, 5, 20};
		int input=15;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]+arr[j] ==input) {
					
					System.out.print(arr[i]+"+"+arr[j] +" ");
					System.out.print(arr[i]+"+"+arr[j]+ " ");

					
				}
			}
			
			
		}

	}

}
