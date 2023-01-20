package Array;

public class ElementWithAllOdNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {12,41,315,156,15};
		
		for(int i=0;i<arr.length;i++) {
			//String data=String.valueOf(arr[i]);
			int n=arr[i];
			 int odd_count = 0;
			 int even_count=0;
			 String rev="";
			    while (n > 0)
			    {
			    	//if(n%2!=0) {
			        int rem = n % 10;
			        if (rem % 2 == 0)
			            even_count++;
			        else {
			            rev=rev+String.valueOf(rem);
			            
			        }
			        n = n / 10;
			    	}
			        
			  //  }
			    System.out.println(rev);

		}
	}

}
