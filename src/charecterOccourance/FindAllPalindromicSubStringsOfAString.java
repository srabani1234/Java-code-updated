package charecterOccourance;

//Java Program to Find All Palindromic Sub-Strings of a String
/*
 * Given a string, the task is to count all palindrome substring in a given string.
Input        : aba
Output       : 4
Explanation  : All palindrome substring are : "aba" , "a" , "b", "a"

*/
public class FindAllPalindromicSubStringsOfAString {

	public static boolean check(String str) {
		
	 String reverse="";
	 for(int i=str.length()-1 ;i>=0;i--) {
		 
		 reverse =reverse+str.charAt(i);
		// System.out.println(reverse);
		 
	 }
	 if(!reverse.toLowerCase().equals(str.toLowerCase())) {
		 return false;
	 }
	 return true;
	 
	 // // Iterating over string till midway to
     // check pallindromic behavior
		
	/*	for(int i=0;i<str.length()/2;i++) {
			System.out.println(str.charAt(str.length()-i-1));
			
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				                 //9-1-1 [i=1:A] =7=A
				
				return false;
			}
		}
		return true;
	*/
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Custom input string
        String str = "MALAYALAM";
        String subString="";
        int count=0;
        
        // Outer loop iterating over input string

        for(int i=0;i<str.length();i++) {
        	
            // Inner loop iterating from current starting
            // character of outer loop current starting
            // character
        	for(int j=i;j<str.length();j++) {
        		
        		
        		subString=str.substring(i,j+1);
        		System.out.println(subString);	
        		
        		if(check(subString)) {
        		
        			
        			count++;
        		}
        		
        		
        	}

        	
        }
        
        System.out.println("count of palindrom string present in main string:"+count);
	}

}
