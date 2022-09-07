package charecterOccourance;

public class MoveAllUppercaseCharactersToTheEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Input    : "heLLGFg"
Output   : "hegLLGF"
*/
		
		String str= "heLLGFg";
	    char[] ch = str.toCharArray();//instead of String loop we can use charecter loop also 
	    String temp="";
	    String rev="";
	    for(int i=0;i<str.length();i++) {
	    	
	    	if(Character.isUpperCase(str.charAt(i))) {
	    		System.out.println(str.charAt(i));
	    		temp=temp+str.charAt(i);
	    	}
	    	else
	    		rev=rev+str.charAt(i);
	    		
	    }
	    System.out.println(temp);
	    System.out.println(rev+""+temp);
	}

}
