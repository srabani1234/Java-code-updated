package charecterOccourance;

import java.util.HashSet;
//https://www.youtube.com/watch?v=sqxer2ynS6U
//Longest substring without repeated charecter
//https://www.youtube.com/watch?v=jHj13UHURr8&t=779s
public class findLongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str="abcdabmnopqr";
		//String str="abecaeb";
		String str ="playersplay";
		longestSubStr(str);
		
	
	}
	public static void longestSubStr(String str) {
		HashSet<Character> hs = new HashSet<Character>();
		String longestOverAll="";
		String longestTillNow="";
		for(int i=0;i<str.length();i++) {
			
			if(hs.contains(str.charAt(i))) {
				
				longestTillNow="";
				hs.clear();
				
			}
			hs.add(str.charAt(i));
			longestTillNow+=str.charAt(i);
		System.out.println(hs);
		    if(longestOverAll.length()<longestTillNow.length()) {
		    	longestOverAll=longestTillNow;
		    }
		}
		System.out.println(longestOverAll);
	}

}
