package charecterOccourance;

public class NewStringfromTwoGivenStringInSuchWayEachCharacterOfTwoStringWillComeRespectively {
//Write a Java program to make a new string from two given string in such a way that,
	//each character of two string will come respectively.
	/*The given strings  are: welcome  and  w3resource
The new string is: wwe3lrceosmoeurce*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "welcomek";
		String str2 ="w3resource";
		String rev="";
		
		int stl1=str.length();
		int stl2=str2.length();
		int maxln = Math.max(stl1, stl2);
		System.out.print(maxln);
		for(int i=0;i<maxln;i++) {
			
			if(i<stl1) {
				
				rev=rev+str.charAt(i);
				
			}
			if(i<stl2) {
				rev=rev+str2.charAt(i);
			}
			
		}
		System.out.println(rev);
	}

}
