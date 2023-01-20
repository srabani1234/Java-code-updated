package Array;

public class countNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num=1234;
  int count=0;
  int sum=0;
  while(num>0) {
	  /* count of digit */
//	  num=num/10;
//	  System.out.println(num);
//	  count++;
	  /*sum of digit*/
	  
	  sum=sum+num%10;
	  num=num/10;
	  System.out.println(num);
  }
  System.out.println(sum);
	}

}
