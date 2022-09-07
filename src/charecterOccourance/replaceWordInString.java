package charecterOccourance;

public class replaceWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="This car is my car";
		String rev="";
		String[] words=str.split(" ");
		//StringBuilder sb=new StringBuilder();
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			
			if(word.equals("car")) {
				rev=rev+"bike";
				//sb.append("bike").append(" ");
			}
			else
				//sb.append(word).append(" ").toString();
				rev=rev+word;
			    
			
			rev=rev+" ";
		}
		
		System.out.println(rev);
		//System.out.println(sb);

	}

}
