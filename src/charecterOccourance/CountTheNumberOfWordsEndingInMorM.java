package charecterOccourance;

public class CountTheNumberOfWordsEndingInMorM {
/*91. Write a Java program to count the number of words ending in 'm' or 'n' (not case sensitive)
 *  in a given text. Go to the editor
 *  The given string is: mam is in the room
The number of words ends eith m or n is: 3
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="mam is in the room";
		int count=0;
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++) {
			String word =words[i];
			//System.out.println(word.length());
			if(word.charAt(word.length()-1) == 'm' || word.charAt(word.length()-1) =='n') {
				
				count++;
				
			}
		}
		System.out.println(count);

	}

}
