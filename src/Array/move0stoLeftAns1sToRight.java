package Array;

public class move0stoLeftAns1sToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//there is an 0's and 1's
		int[] arr= {1,0,1,1,0,0};
		
		//ost sgift left 1 shift right
		int[] newArr=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==0) {
				
				newArr[j++]=arr[i];//post the value in indes and then increament j as 1
			}
			
		}
		//put all the 0 and remail now only 1
		while(j<arr.length) {
			newArr[j++]=1;
			
		}
      for(int i=0;i<newArr.length;i++) {
    	  System.out.println(newArr[i]);
      }
	}

}
