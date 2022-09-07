package charecterOccourance;

//Java String Exercises: 
//New string after removing a specified character from a given string except the first and last position
public class NewStringAfterRemovingaSpecifiedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="gkegtgojg";
		char ch='g';
		String res="";
		for(int i=0;i<str.length();i++) {
			
			if(i==0 && str.charAt(i)==ch) {
				
				res=res+str.charAt(i);
			}else if((i==(str.length()-1)) && str.charAt(str.length()-1)==ch) {
				
				res=res+str.charAt(i);
			}
			else if (i>0 && i<str.length() && !(str.charAt(i)==ch))
           {
				res=res+str.charAt(i);				
			}
		
		}
		System.out.println(res);

	}

}
