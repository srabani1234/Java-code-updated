package charecterOccourance;

public class removeLastOccouranceOfFivenCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="tutorial gateway";
		char ch = 'a';
		String res="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			if(str.charAt(i)==ch) {
				
				res=str.substring(0,i)+str.substring(i+1);
				break;
			}
			
			
		}
		System.out.println(res);
	}

}
