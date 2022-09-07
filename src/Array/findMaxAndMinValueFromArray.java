package Array;

public class findMaxAndMinValueFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				
				max=arr[i];
			}
			if(min>arr[i]) {
				
				min=arr[i];
			}
			
		}
		System.out.print(max+" ");
		System.out.print(min);
	}

}
