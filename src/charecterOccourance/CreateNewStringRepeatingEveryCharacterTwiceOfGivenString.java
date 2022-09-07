package charecterOccourance;


/*Write a Java program to create a new string repeating every character twice of a given string. Go to the editor

Sample Output:

The given string is: welcome
The new string is: wweellccoommee*/
public class CreateNewStringRepeatingEveryCharacterTwiceOfGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="";
		String str = "welcome";
		for(int i=0;i<str.length();i++) {
			
			rev=rev+str.charAt(i)+str.charAt(i);
			
		}
      System.out.println(rev);
	}

}
