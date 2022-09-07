package charecterOccourance;

// Write a Java program to read a string and return the string without the first two characters. 
//Keep the first character if it is 'g' and keep the second character if it is 'h'.

public class removeCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ohcmoat";
		String res=" ";
		
		for(int i=0;i<str.length();i++) {
			
	
			if((i==0) && (str.charAt(i)=='g')) {
				
				res=res+str.charAt(i);
			}
			else if((i==1) && (str.charAt(i)=='h')) {
				res=res+str.charAt(i);
				System.out.println(res);
			}else if(i>1) {
				res = res+str.charAt(i);				
				
			}
			
		}
		
		System.out.println(res);

	}

}
