package changeNumber;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4};
		int k=0;
		int[] newArr=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--) {
			
			newArr[k++]=arr[i];
		}

		
	for(int i=0;i<newArr.length;i++) {
			
		System.out.println(	newArr[i]);
		
	}

}
	
}
