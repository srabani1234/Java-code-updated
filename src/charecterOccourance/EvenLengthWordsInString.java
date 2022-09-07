package charecterOccourance;

public class EvenLengthWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is a big test java language";
		String[] st=str.split(" ");
		for(int i=0;i<st.length;i++) {
			String word=st[i];
			if(word.length()%2==0) {
				System.out.println(word);
			}
		}

	}

}
