package charecterOccourance;

public class returnStringWithTheCharactersOfTheIndexPosition {
//97. Write a Java program to return a string with the characters of the index position 0,1,2, 5,6,7, ... from a given string. Go to the editor


	public static String getSubString(String str) {
		String res="";
		
		for(int i=0;i<str.length();i+=5) {
			int end=i+3;
			System.out.println(end);
			if(end>str.length()) {//this will work for string lenth when small like w3r 
				end=str.length();
				
			}
			res=res+str.substring(i,end);
			//i=i+5;
			
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "w3resource.com";
		System.out.println(getSubString(str));
		
		//String res="";
	
	}

}
