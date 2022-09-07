package charecterOccourance;

//remove first occourance of given charecter from string
//o/p-tutoril gateway

public class removeFirstOccouranceOfGivenChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="mutorial gateway";
		char ch = 'm';
		
		String res="";
		for(int i=0;i<str.length()-1;i++) {
			
			if(str.charAt(i)==ch) {
				
				System.out.println(str.substring(0,i));
				res=str.substring(0,i)+ str.substring(i + 1);
	            break;
				
				
			}
			
				
		}
		System.out.println(res);
	

	}

}
