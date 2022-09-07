package charecterOccourance;

/*
 * Given a string containing n numbers of words. 
 * The task is to swap the corner words of the string and reverses all the middle characters of the string.

Input:  "Hello this is the GFG user"
Output: "user GFG eth si siht Hello"
 */
public class SwapCornerWordsAndReverseMiddleCharactersOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "Hello this is the GFG user";
		
		String[] st = str.split(" ");
		String rev="";
	
		
		String temp;
		
		temp=st[0];
		st[0]=st[st.length-1];
		st[st.length-1]=temp;
		
		
		
		for(int i=st.length-2;i>0;i--){
			
			String word=st[i];
			
			for(int j=word.length()-1;j>=0;j--) {
				
				rev=rev+word.charAt(j);
			}
			rev+=" ";
			System.out.println(rev);
		}
	       // Lastly print the swapped and reversed words
        System.out.print(st[0] + " " + rev + " "
                         + st[st.
                              length - 1]);
		

	}

}
