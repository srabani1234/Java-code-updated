package charecterOccourance;

import java.util.HashSet;

public class findTheLongestSubstringAppearsAtBothEndsOfString {

/*The given string is: playersplay
The longest substring in the string is: play*/
	//https://www.youtube.com/watch?v=ocBU0tKwX1g
	//https://www.youtube.com/watch?v=sqxer2ynS6U
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str="playersplay";
	//System.out.println(str.length());//11
	System.out.println(longestSubStr(str));

	}
	public static String longestSubStr(String str) {
	//	int l = str.length();
		  String f_str = "";
		  String tmp = "";
		  for (int i = 0; i < str.length()/2; i++) 
		  {
		    tmp += str.charAt(i);
		  // System.out.println(tmp.length());
		  //  System.out.println(tmp);
		  //  int t_len = tmp.length();
		   // System.out.println( str.length() /2);
		    if (tmp.equals(str.substring(str.length()-tmp.length(),str.length())))
		    	// System.out.println(str.length()-tmp.length());
		    	f_str = tmp;
		  }
		  return f_str;
	}


}
