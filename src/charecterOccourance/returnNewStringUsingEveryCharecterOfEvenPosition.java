package charecterOccourance;

public class returnNewStringUsingEveryCharecterOfEvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="w3resource.com";
		String res="";
		
		for(int i=0;i<str.length();i++) {
			
			if(i%2==0) {
				
				res=res+str.charAt(i);
				
			}
			
		}
		System.out.println(res);


	}

}
