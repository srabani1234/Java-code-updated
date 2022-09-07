package Array;

public class InsertElementIntoArray {
/*Write a Java program to insert an element (specific position) into an array.

originl:[25, 14, 56, 15, 36, 56, 77, 18, 29, 49] 
 * 35 to be inserted in index position 2
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int input =35;
		int indexPos = 2;
		int j=0;
		int[] newArr = new int[arr.length+1];
		for(int i=0;i<indexPos;i++) {
			
			newArr[j]=arr[i];
			j++;
			
		}
		newArr[indexPos]=input;
		//System.out.print(indexPos+1);
		//that should also work
//		for(int i=indexPos;i<arr.length;i++) {
//
//           newArr[i+1]=arr[i];
//           //j++;
//			
//		}
//		
		for(int i=indexPos+1;i<newArr.length;i++) {

	           newArr[i]=arr[i-1];
	           //j++;
				
			}
			
		for(int i=0;i<newArr.length;i++) {
			
			System.out.print(newArr[i]+" ");
			
		}

	}

}
