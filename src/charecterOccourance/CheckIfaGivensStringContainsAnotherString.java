package charecterOccourance;
/*Write a Java program to check if a given string contains another string. Return true or false. Go to the editor

Sample Output:

Original string:
Java is the foundation for virtually every type of networked application and is the global standard for developing and  delivering embedded and mobile applications, games, Web-based content,  and enterprise software. With more than 9 million developers worldwide, Java enables you to efficiently develop, deploy and use exciting applications and services.

Is 'million' present in the said text?
true

Is 'millions' present in the said text?
false
 * 
 * */
public class CheckIfaGivensStringContainsAnotherString {

	
	public boolean m1(String str) {
        String[] word = str.split(" ");
        
        for(int i=0;i<word.length;i++) {
           System.out.println(word[i]);
            String words=word[i];

        if(words.equalsIgnoreCase("millions")) {
        	
            System.out.println(word[i]);
           return true;
        	
        }
		
	}
		//return false;
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String main_string = "Java is the foundation for virtually every type of "+
		           "networked application and is the global standard for developing and "+
		           " delivering embedded and mobile applications, games, Web-based content, "+
		           " and enterprise software. With more than 9 million developers worldwide,"+
		           " Java enables you to efficiently develop, deploy and use exciting applications and services.";
		           // System.out.println("Original string:"+main_string);
		CheckIfaGivensStringContainsAnotherString s = new CheckIfaGivensStringContainsAnotherString();
		s.m1(main_string);
		System.out.print(s.m1(main_string));
		            
	
	}

}
