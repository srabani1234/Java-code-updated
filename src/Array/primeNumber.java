package Array;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=29;
		boolean flag=false;
		//prime number divded by 1 and iself only so we verify here if it is devided by any other number
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				
				flag=true;
				break;
			}
			
		}
		
		if(!flag) {
		System.out.println("prime");	
		}else {
			System.out.println("no prime");
		}

	}

}
