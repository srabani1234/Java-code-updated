package Array;

public class mergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4};
		int[] arr1= {7,8};
		
		int l1=arr.length;
		int l2=arr1.length;
		System.out.println(l1);
		System.out.println(l2);
		int[] c=new int[l1+l2];
		System.out.println(c.length);
		for(int i=0;i<l1;i++) {
			
			c[i]=arr[i];
			
			
		}
		for(int i=0;i<l2;i++) {
			c[i+l1]=arr1[i];
			
		}
		for(int i=0;i<c.length;i++) {
			
			System.out.println(c[i]);
		}

	}

}
