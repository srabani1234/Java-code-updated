package Array;

public class removeDuplicateElementFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int[] arr = {0,2,2,3,3, 4};
		int[] newArr = new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]!=arr[i+1]) {
				
				newArr[j]=arr[i];//insert value into j and increatese the position of j
				j++;
				
			}
			
			newArr[j]=arr[arr.length-1];
			
		}
		
		for(int i=0;i
				<newArr.length;i++) {
			System.out.println(newArr[i]);
			
		}
	}

}
