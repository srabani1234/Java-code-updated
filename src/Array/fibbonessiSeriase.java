package Array;

public class fibbonessiSeriase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		int b=1;
		int c=0;
		//0,1,1
		//0+1
		//1+1
		for(int i=1;i<10;i++) {
			
			c=a+b;
			a=b;
			b=c;
			
			
			
		}
		
System.out.print(c);
	}

}
