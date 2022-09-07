package charecterOccourance;
//86. Write a Java program to count the number of triples (characters appearing three times in a row)
//in a given string. Go to the editor.check in charecter sequence like eee not for single e


public class CharactersAppearingThreeTimesInaRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welllcommmmeeeoo";
		int count=0;
		System.out.print(str.length()-2);
		for(int i=0;i<str.length()-2;i++) { //i<str.lenght()-2 cz we check str.charAt(i+2) otherwise it should through length out of bound error at end
			
			if(str.charAt(i)==str.charAt(i+1) && str.charAt(i)==str.charAt(i+2)) {
				System.out.println(str.charAt(i)+""+count);
				count++;
				
			}
			//System.out.println(str.charAt(i)+""+count);
			
	}
		System.out.println(count);

}
}
