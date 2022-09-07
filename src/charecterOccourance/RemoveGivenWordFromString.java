package charecterOccourance;

public class RemoveGivenWordFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Input    : This is the Geeks For Geeks
           word="the"
Output   : This is Geeks For Geeks
		 * */

		
		String str="This is the Geeks For Geeks";
		String rev="";
		String st="the";
		
		String[] words=str.split(" ");
		
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		
			String word=words[i];
			
			if(!st.equalsIgnoreCase(word)) {
				rev=rev+words[i];
				
				
			}
			rev=rev+" ";
		}
		
		System.out.println(rev);
	}

}
