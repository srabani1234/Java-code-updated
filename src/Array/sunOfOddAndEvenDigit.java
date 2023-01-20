package Array;

public class sunOfOddAndEvenDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		int even=0;
		int odd=0;
		int sum=0;
		int rem=0;
		while(num>0) {
			rem=num%10;
			if(rem%2==0) {
				even=even+rem;
			}
			else {
				
				odd=odd+rem;
			}
			num=num/10;
		}
		
          System.out.println(even+" "+odd);
	}

}
