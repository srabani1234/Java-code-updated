package charecterOccourance;
//Write a Java program to read a string and if one or both of the first 
//two characters is equal to specified character return without 
//those characters otherwise return the string unchanged.
public class removeCharFromString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="kkgooat";
		char ch='k';
		String res="";
		
		for(int i=0;i<str.length();i++) {
			
			if((i==0) && str.charAt(i)!=ch) {
				
            res=res+str.charAt(i);	
            
			}else if(i==1 && str.charAt(i)!=ch) {
				
	            res=res+str.charAt(i);	

			}else if(i>1 ) {
			res=res+str.charAt(i);
			}
		
			
			
		}
		System.out.println(res);
	}

}
