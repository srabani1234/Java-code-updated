package Array;

public class Find2ndLargestDigitInGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 1234;
		int rem=0;
		int larzest=0;
		int second=0;
		while(num>0) {
			rem=num%10;
			if(rem>larzest) {
			 second=larzest;
			 larzest=rem;
				
			}
			else if(rem>second && rem<larzest) {
				
				second=rem;
			}
			
			num=num/10;
		}
		System.out.println(larzest +" "+ second);

	}

}
