package charecterOccourance;

public class PrintThefirstCharacterOfEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="print the first character of each word in a String in Java";
		
		String[] words = str.split(" ");
		String res="";
		
		for(int i=0;i<words.length;i++) {
			
			String word=words[i];
			
			for(int j=0;j<word.length();j++) {
				
				if(word.charAt(j)!=' ' && j==0 ) {
					
					System.out.println(word.charAt(j));
					res=res+word.charAt(j);
					
				}
				
			}
			
		}
System.out.print(res);
	}

}
