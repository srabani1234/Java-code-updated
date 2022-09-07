package charecterOccourance;

public class returnStringWithTheCharactersOfTheIndexPosition {
//97. Write a Java program to return a string with the characters of the index position 0,1,2, 5,6,7, ... from a given string. Go to the editor


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "w3resource.com";
		String res="";
		//for(int i=0;i<str.length();i++) {
	    res = str.substring(0, 3)+str.substring(5,8)+str.substring(10,13);	
		//}	
		System.out.println(res);
	}

}
